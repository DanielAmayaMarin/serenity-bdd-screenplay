package co.com.automatizacion.pedidosweb.tasks.DigitarPedidos;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automatizacion.pedidosweb.userinterfece.DigitarPedidos.IAbrirModuloPedidos.*;


public class AbrirModuloPedidos implements Task {


    public static AbrirModuloPedidos abrir() {
        return Tasks.instrumented(AbrirModuloPedidos.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Esperar.milisegundos(500),
                Click.on(BOTON_PEDIDO_CREDITO),
                Esperar.milisegundos(1000)
              

        );
    }
}
