package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class HomePage extends PageObject {

    public static final Target ClickElements = Target
            .the("Click en Elements")
            .located(By.xpath("//*[name()='path' and contains(@d,'M16 132h416c8')]"));

}
