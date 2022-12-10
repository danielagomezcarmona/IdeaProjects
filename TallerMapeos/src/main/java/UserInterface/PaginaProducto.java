package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.mercadolibre.com.co/")

public class PaginaProducto extends PageObject {

    public static final Target Select_Producto = Target
            .the("Selecciona el producto")
            .locatedBy("//div[contains(@class,'slick-slide slick-active')]//img[contains(@alt,'Apple Macbook Air (13 pulgadas, 2020, Chip M1, 256 GB de SSD, 8 GB de RAM) - Gris espacial')]");

    public static final Target Select_Color = Target
            .the("Selecciona el color")
            .locatedBy("//div[contains(@class,'ui-pdp-thumbnail__picture ui-pdp-thumbnail__picture--LARGE')]//img[contains(@alt,'Oro')]");

    public static final Target Select_Opcion = Target
            .the("Abre el seleccionador de cantidad")
            .locatedBy("//span[@class='ui-pdp-buybox__quantity__chevron']");

    public static final Target Select_Cantidad = Target
            .the("Selecciona la cantidad")
            .locatedBy("//span[normalize-space()='2 unidades']");

    public static final Target Select_Agregar = Target
            .the("Selecciona agregar al carrito")
            .locatedBy("//button[@class='andes-button andes-spinner__icon-base andes-button--quiet']//span[@class='andes-button__content'][normalize-space()='Agregar al carrito']");

}
