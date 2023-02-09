package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.mercadolibre.com.co/")

public class PaginaLogin extends PageObject {
    public static final Target Entrar_Login = Target
            .the("Ingresa al login")
            .locatedBy("//span[normalize-space()='Ingresar']");
}
