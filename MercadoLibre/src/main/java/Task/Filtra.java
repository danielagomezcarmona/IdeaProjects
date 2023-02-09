package Task;

import UserInterface.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Filtra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Click.on(PaginaInicio.Filtra_Categoria)
        );
    }
    public static Filtra categoria() {return Tasks.instrumented(Filtra.class);
    }
}