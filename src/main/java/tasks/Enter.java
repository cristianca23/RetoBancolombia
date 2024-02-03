package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.Login.*;

public class Enter implements Task {
    private final String mail;
    private final String password;
    public Enter(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(mail).into(INPUT_USER),
                net.serenitybdd.screenplay.actions.Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_ENVIAR)
        );
    }

    public static Enter theCredentials(String mail, String password){
        return Tasks.instrumented(Enter.class, mail, password);
    }
}
