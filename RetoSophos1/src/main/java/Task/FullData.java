package Task;

import UserInterface.FullDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class FullData implements Task {

    private String firstname;
    private String lastname;
    private String email;
    private String age;
    private String salary;
    private String department;
    private Target fieldFirstname;
    private Target fieldLastname;
    private Target fieldEmail;
    private Target fieldAge;
    private Target fieldSalary;
    private Target fieldDepartment;

    public FullData (String firstname, String lastname, String email, String age, String salary, String department, Target... targets) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.fieldFirstname = targets[0];
        this.fieldLastname = targets[1];
        this.fieldEmail = targets[2];
        this.fieldAge = targets[3];
        this.fieldSalary = targets[4];
        this.fieldDepartment = targets[5];
    }

    public static FullData en(String firstname, String lastname, String email, String age, String salary, String department, Target... targets) {
        return Tasks.instrumented(FullData.class, firstname, lastname, email, age, salary, department, targets);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(fieldFirstname),
                Enter.theValue(lastname).into(fieldLastname),
                Enter.theValue(email).into(fieldEmail),
                Enter.theValue(age).into(fieldAge),
                Enter.theValue(salary).into(fieldSalary),
                Enter.theValue(department).into(fieldDepartment),
                Click.on(FullDataPage.ClickSubmit)
        );
    }
}