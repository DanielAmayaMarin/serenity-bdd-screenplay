package co.com.automatizacion.pedidosweb.userinterfece.DigitarPedidos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IAbrirModuloPedidos {

    public static final Target BOTON_PEDIDO_CREDITO = Target.the("Boton pedidos").located(By.cssSelector("div.fullsize-container.ng-scope:nth-child(1) md-content.ng-scope.md-default-theme:nth-child(2) md-content.md-default-theme md-content.md-default-theme:nth-child(3) table:nth-child(1) tbody:nth-child(1) tr.ng-scope:nth-child(1) td:nth-child(1) > div.box-white-shadow.float-box.div-BotonPedidoCreditoVisibleMisPuntos:nth-child(1)"));


}
