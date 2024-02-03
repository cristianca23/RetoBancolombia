package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class Login {

    public static Target INPUT_USER = PageElement.locatedBy("//input[@name='username']");
    public static Target INPUT_PASSWORD = PageElement.locatedBy("//input[@name='password']");
    public static Target BTN_ENVIAR = PageElement.locatedBy("//button[@class='bg-white border-black p-2 border-2 rounded-md hover:bg-blue-300 w-1/2 mx-auto']");



}
