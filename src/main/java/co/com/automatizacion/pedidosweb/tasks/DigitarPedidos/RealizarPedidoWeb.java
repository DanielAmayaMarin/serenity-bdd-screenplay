package co.com.automatizacion.pedidosweb.tasks.DigitarPedidos;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import co.com.automatizacion.pedidosweb.model.PedidoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.automatizacion.pedidosweb.userinterfece.DigitarPedidos.IModuloPedidos.*;


public class RealizarPedidoWeb implements Task {

    private PedidoModel pedidoModel;

    public RealizarPedidoWeb(PedidoModel pedidoModel) {
        this.pedidoModel = pedidoModel;
    }

    public static RealizarPedidoWeb informacion(PedidoModel pedidoModel) {
        return Tasks.instrumented(RealizarPedidoWeb.class, pedidoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.keyValues(pedidoModel.getSku()).into(INPUT_CODIGO_PRODUCTO),
                Enter.keyValues(pedidoModel.getCantidad()).into(INPUT_CANTIDAD),
                Esperar.milisegundos(100),
                Click.on(BOTON_ADICIONAR),
                Esperar.milisegundos(100),
                Click.on(BOTON_ENVIARPEDIDO),
                Esperar.milisegundos(100),
                Click.on(BOTON_CONFIRMAR),
                Esperar.milisegundos(1000)
        );
    }
}
