package co.com.automatizacion.pedidosweb.tasks.IniciarSesion;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import co.com.automatizacion.pedidosweb.model.DatosSensiblesModel;
import static co.com.automatizacion.pedidosweb.userinterfece.IniciarSesion.IValidarUsuario.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ValidarUsuario implements Task {

    private DatosSensiblesModel datosModel;

    public ValidarUsuario(DatosSensiblesModel datosModel) {
        this.datosModel = datosModel;
    }

    public static ValidarUsuario iniciarsesion(DatosSensiblesModel datosModel) {
        return Tasks.instrumented(ValidarUsuario.class, datosModel);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Esperar.milisegundos(1000),
                Enter.keyValues(datosModel.getCedulaai()).into(VALIDAR_USUARIO),
                Click.on(CONTINUAR)
        );
    }
}
