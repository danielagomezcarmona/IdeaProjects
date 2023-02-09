package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.co/")

public class PaginaInicio extends PageObject {

    public static final Target Click_ClosePopUp = Target
            .the("Cerrar cookies")
            .locatedBy("//button[@class='cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept']");
    public static final Target Select_Categoria = Target
            .the("Seleccion de categoria")
            .locatedBy("//div[@class='wrapper']//div[2]//div[1]//a[1]");
    public static final Target Filtra_Categoria = Target
            .the("Filtra la categoria")
            .locatedBy("//img[@alt='PORTATILES ']");


}
