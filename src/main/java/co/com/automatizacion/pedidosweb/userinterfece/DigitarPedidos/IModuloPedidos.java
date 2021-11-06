package co.com.automatizacion.pedidosweb.userinterfece.DigitarPedidos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IModuloPedidos {

    public static final Target INPUT_CODIGO_PRODUCTO = Target.the("Input codigo producto").located(By.id("txt_search"));
    public static final Target INPUT_CANTIDAD = Target.the("Input cantidad").located(By.id("txt_cantidad"));
    public static final Target BOTON_ADICIONAR = Target.the("Boton adicionar").located(By.xpath("//body/div[1]/md-content[1]/md-content[1]/form[1]/md-toolbar[1]/button[1]"));

    public static final Target BOTON_ENVIARPEDIDO = Target.the("Boton Enviar pedido").located(By.xpath("/html[1]/body[1]/div[1]/md-content[1]/md-content[1]/md-toolbar[4]/button[1]"));
    public static final Target BOTON_CONFIRMAR = Target.the("Boton confirmar pedido").located(By.xpath("//body/div[@id='customErrConf']/div[1]/md-dialog[1]/div[1]/button[2]"));

    public static final Target TITULO_CONFIRMACION = Target.the("Titulo").located(By.cssSelector("div.md-dialog-container.custom-dialog-container:nth-child(13) div.middle md-dialog.layout-middle.md-default-theme md-toolbar.md-medium-tall.graybar.md-default-theme > h2.md-toolbar-tools.custom-error-title.ng-binding"));

}
