package Task;

import UserInterface.SelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectWebE implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectPage.ClickWebElements)

        );
    }

    public static SelectWebE webelements() {return Tasks.instrumented(SelectWebE.class);
    }

}

