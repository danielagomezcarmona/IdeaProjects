package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomePageTask {

    @Managed(driver = "chrome")
    private WebDriver browser;

    public static final Target ClickElements = Target
            .the("Click en Elements")
            .located(By.xpath("//*[name()='path' and contains(@d,'M16 132h416c8')]"));
    public static final Target ClickWidgets = Target
            .the("Click en Widgets")
            .located(By.xpath("(//div[@class='card-up'])[4]"));
    public static final Target ClickAlerts = Target
            .the("Click en Alerts")
            .located(By.xpath("(//div[@class='card-up'])[3]"));
}