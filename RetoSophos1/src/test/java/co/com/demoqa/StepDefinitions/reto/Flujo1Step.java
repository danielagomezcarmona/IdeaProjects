package co.com.demoqa.StepDefinitions.reto;

import Task.AddRegister;
import Task.FullData;
import Task.SelectE;
import Task.SelectWebE;
import UserInterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static UserInterface.SignUpPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Flujo1Step {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^El cliente esta ubicado en el home de la aplicacion$")
    public void elClienteEstaUbicadoEnElHomeDeLaAplicacion() {
        theActorCalled("Usuario").wasAbleTo(Open.browserOn(new HomePage()));
    }

    @When("^Selecciona la opcion de Elements$")
    public void seleccionaLaOpcionDeElements() {
        theActorInTheSpotlight().attemptsTo(SelectE.elements());
    }

    @And("^Selecciona la opcion de Web tables$")
    public void seleccionaLaOpcionDeWebTables() {
        theActorInTheSpotlight().attemptsTo(SelectWebE.webelements());
    }

    @And("^Selecciona agregar registro$")
    public void seleccionaAgregarRegistro() {
        theActorInTheSpotlight().attemptsTo(AddRegister.register());
    }

    @Then("^Guarda los datos del formulario diligenciado \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void guardaLosDatosDelFormularioDiligenciado(String firstname, String lastname, String email, String age, String salary, String department) {
        theActorInTheSpotlight().attemptsTo(FullData.en(firstname, lastname, email, age, salary, department, FIRSTNAME, LASTNAME, EMAIL, AGE, SALARY, DEPARTMENT, ClickSubmit));
    }

    @And("^Agrega un registro completo exitosamente$")
    public void agregaUnRegistroCompletoExitosamente() {
    }

    @And("^Elimina cualquier registro completo exitosamente$")
    public void eliminaCualquierRegistroCompletoExitosamente() {
    }






}
