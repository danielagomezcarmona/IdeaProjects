package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class SelectPage extends PageObject {
    public static final Target ClickWebElements = Target
            .the("Click en Web-Elements")
            .located(By.xpath("//span[normalize-space()='Web Tables']"));
}
