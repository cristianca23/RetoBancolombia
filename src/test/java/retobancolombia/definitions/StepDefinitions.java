package retobancolombia.definitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Validate;
import tasks.Enter;
import tasks.Make;
import tasks.NavigateTo;

public class StepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    public String nameActor;
    @Given("^(.*) enters in the link of evarlart")
    public void cristianEntersInTheLinkOfEvarlart(String actor) {
        OnStage.theActor(actor).wasAbleTo(NavigateTo.url());
        this.nameActor = actor;

    }

    @Given("Cristian enter´s his {string} and {string}.")
    public void cristianEnterSHisAnd(String user, String password) {
        actor(nameActor).attemptsTo(Enter.theCredentials(user, password));

    }
    @When("Performs the complete flow with the {int} proposed cycles.")
    public void performsTheCompleteFlowWithTheProposedCycles(Integer cycles) {
        actor(nameActor).attemptsTo(Make.theCycles(cycles));
    }

    @Then("Display the Congratulations message {string}")
    public void displayTheCongratulationsMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validate.text(message)));
    }
}
