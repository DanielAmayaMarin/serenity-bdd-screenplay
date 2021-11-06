package co.com.automatizacion.pedidosweb.tasks.IniciarSesion;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import co.com.automatizacion.pedidosweb.model.DatosSensiblesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.automatizacion.pedidosweb.userinterfece.IniciarSesion.IIniciarSesion.*;

public class IniciarSesion implements Task {

    private DatosSensiblesModel datosModel;

    public IniciarSesion(DatosSensiblesModel datosModel) {
        this.datosModel = datosModel;
    }

    public static IniciarSesion informacion(DatosSensiblesModel datosModel) {
        return Tasks.instrumented(IniciarSesion.class, datosModel);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Esperar.milisegundos(100),
                Enter.keyValues(datosModel.getContrasena()).into(INPUT_CONTRASENA),
                Click.on(BUTTON_INGRESAR),
                Esperar.milisegundos(1000)
        );
    }
}
