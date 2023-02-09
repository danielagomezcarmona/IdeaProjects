package Task;

import UserInterface.PaginaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProd implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaProducto.Select_Producto)
        );
    }
    public static SelectProd producto() {return Tasks.instrumented(SelectProd.class);
    }
}