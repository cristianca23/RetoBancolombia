package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.Main.*;
import static utils.Utils.columnResult;
import static utils.Utils.resultOfSumCoordinates;


public class Make implements Task {

    private int cycle;

    public Make(int cycle) {
        this.cycle = cycle;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        for (int i = 1;  i<= cycle; i++)

        {
            actor.attemptsTo(
                    Click.on(BTN_NUMBER.of(String.valueOf(resultOfSumCoordinates(i)))).afterWaitingUntilEnabled(),
                    Click.on(TXT_SUM).afterWaitingUntilEnabled(),
                    Enter.theValue(String.valueOf(columnResult(i))).into(TXT_SUM),
                    Click.on(BTN_SUBMIT).afterWaitingUntilEnabled());
        }

    }

    public static Make theCycles( int cycle){
        return Tasks.instrumented(Make.class, cycle);
    }
}
