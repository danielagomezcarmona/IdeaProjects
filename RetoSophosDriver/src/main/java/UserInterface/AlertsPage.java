package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends PageObject {

    @Managed(driver = "chrome")
    private static WebDriver browser;

    public static final Target ClickBoton1 = Target
            .the("Click en primer boton")
            .located(By.id("alertButton"));
    public static final Target ClickBoton2 = Target
            .the("Click en segundo boton")
            .located(By.id("timerAlertButton"));

    public final WebDriver getDriver() {
        return browser;
    }
}
