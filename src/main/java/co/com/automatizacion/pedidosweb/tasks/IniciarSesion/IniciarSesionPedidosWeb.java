package co.com.automatizacion.pedidosweb.tasks.IniciarSesion;

import co.com.automatizacion.pedidosweb.model.DatosSensiblesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesionPedidosWeb implements Task {

    private DatosSensiblesModel datosModel;

    public IniciarSesionPedidosWeb(DatosSensiblesModel datosSensiblesModel) {
        this.datosModel = datosSensiblesModel;
    }

    public static IniciarSesionPedidosWeb informacion(DatosSensiblesModel datosSensiblesModel) {
        return Tasks.instrumented(IniciarSesionPedidosWeb.class,datosSensiblesModel );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                ValidarUsuario.iniciarsesion(datosModel),
                IniciarSesion.informacion(datosModel)
        );
    }
}
