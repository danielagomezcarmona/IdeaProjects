package co.com.mercadolibre.StepDefinitions.Taller;

import Task.*;
import UserInterface.PaginaInicio;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SeleccionarStep {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^El cliente esta ubicado en el home de la aplicacion$")
    public void elClienteEstaUbicadoEnElHomeDeLaAplicacion() {
        theActorCalled("Dani").wasAbleTo(Open.browserOn(new PaginaInicio()));
    }

    @And("^Selecciona cualquier categoria exitosamente$")
    public void seleccionaCualquierCategoriaExitosamente() {
        theActorInTheSpotlight().attemptsTo(Select.categoria());
    }

    @And("^Filtra seccion por su nombre$")
    public void filtraSeccionPorSuNombre() {
        theActorInTheSpotlight().attemptsTo(Filtra.categoria());
    }

    @When("^El cliente esta ubicado en el producto$")
    public void elClienteEstaUbicadoEnElProducto() {
        theActorInTheSpotlight().attemptsTo(SelectProd.producto());
    }

    @And("^Selecciona color cantidad y agrega al carrito$")
    public void seleccionaColorCantidadYAgregaAlCarrito() {
        theActorInTheSpotlight().attemptsTo(SelectCaract.Caracteristicas());
    }

    @Then("^Se dirige a la pagina de logueo$")
    public void seDirigeALaPaginaDeLogueo() {
        theActorInTheSpotlight().attemptsTo(Login.login());
    }
}
