package Task;

import UserInterface.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task {

@Override
public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(PaginaInicio.Click_ClosePopUp),
        Click.on(PaginaInicio.Select_Categoria)

 );
}
public static Select categoria() {return Tasks.instrumented(Select.class);
    }
            }