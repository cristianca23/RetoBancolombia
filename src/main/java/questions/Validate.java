package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterfaces.Main.*;

public class Validate implements Question<Boolean> {

    private String message;
    public Validate(String message) {
        this.message = message;
    }

    public static Validate text(String message) {

        return new Validate(message);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ObtenerTexto = BrowseTheWeb.as(actor).find(TXT_VALIDATE).getText().trim();
        String Hash = BrowseTheWeb.as(actor).find(TXT_HASH).getText();
        if (message.equals(ObtenerTexto)) {
            result = true;
            System.out.println("El Hash generado es: " + Hash);

        } else {
            result = false;
        }
        return result;
    }
    }

