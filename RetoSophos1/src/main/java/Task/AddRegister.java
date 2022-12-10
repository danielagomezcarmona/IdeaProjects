package Task;

import UserInterface.WebElementPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddRegister implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebElementPage.ClickAdd)
        );
    }

    public static AddRegister register() {return Tasks.instrumented(AddRegister.class);
    }

}
