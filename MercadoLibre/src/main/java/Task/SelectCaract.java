
package Task;

import UserInterface.PaginaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCaract implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(2000);
        actor.attemptsTo(
                Click.on(PaginaProducto.Select_Color));
        Thread.sleep(2000);
        actor.attemptsTo(
                Click.on(PaginaProducto.Select_Opcion),
                Click.on(PaginaProducto.Select_Cantidad));
        Thread.sleep(2000);
        actor.attemptsTo(
                Click.on(PaginaProducto.Select_Agregar));
    } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static SelectCaract Caracteristicas() {return Tasks.instrumented(SelectCaract.class);
    }
}
