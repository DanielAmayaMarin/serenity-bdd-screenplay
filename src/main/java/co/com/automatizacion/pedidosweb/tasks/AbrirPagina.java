package co.com.automatizacion.pedidosweb.tasks;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import co.com.automatizacion.pedidosweb.userinterfece.UrlPedidosWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private UrlPedidosWeb pedidosWeb;

    public static AbrirPagina pagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(pedidosWeb),
                Esperar.milisegundos(1000)
        );
    }
}
