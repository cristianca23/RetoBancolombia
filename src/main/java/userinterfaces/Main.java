package userinterfaces;

import com.gargoylesoftware.htmlunit.Page;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;

public class Main {


    public static Target TXT_MATRIZ = PageElement.locatedBy("//p[@class='text-center text-xl font-bold']");
    public static Target BTN_NUMBER = PageElement.locatedBy("//button[normalize-space()='{0}']");

    public static Target TXT_SUM = PageElement.locatedBy("//input[@class='rounded-md border-2 border-black p-2']");

    public static Target BTN_SUBMIT = Button.withText("Enviar");

    public static Target TXT_VALIDATE = PageElement.locatedBy("//h1[contains(text(),'Felicidades, has terminado la prueba exitosamente')]");

    public static Target TXT_HASH = PageElement.locatedBy("//p[@class='text-white text-2xl text-center break-all']");
}
