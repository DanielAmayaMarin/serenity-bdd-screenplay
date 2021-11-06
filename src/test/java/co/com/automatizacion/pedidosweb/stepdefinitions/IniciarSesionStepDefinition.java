package co.com.automatizacion.pedidosweb.stepdefinitions;

import co.com.automatizacion.pedidosweb.model.DatosSensiblesModel;
import co.com.automatizacion.pedidosweb.questions.IniciarSesionQuestions;
import co.com.automatizacion.pedidosweb.tasks.AbrirPagina;
import co.com.automatizacion.pedidosweb.tasks.IniciarSesion.IniciarSesionPedidosWeb;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que la (.*) ingresa a la plataforma para digitar su pedido$")
    public void que_la_AI_ingresa_a_la_plataforma_para_digitar_su_pedido(String ai) {
        theActorCalled(ai).wasAbleTo(
                AbrirPagina.pagina()
        );
    }


    @Cuando("^aparece el login, ingresa su usuario y contrasena$")
    public void aparece_el_login_ingresa_su_usuario_y_contrasena(List<DatosSensiblesModel> datossensibles) {
        theActorInTheSpotlight().wasAbleTo(
                IniciarSesionPedidosWeb.informacion(datossensibles.get(0))
        );
    }

    @Entonces("^se valida si el ingreso fue exitoso, Existe el modal de bienvenida$")
    public void se_valida_si_el_ingreso_fue_exitoso_Existe_el_modal_de_bienvenida(List<DatosSensiblesModel> datossensibles) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(IniciarSesionQuestions.validacion(datossensibles.get(0).getTitulomodal()))


        );
    }


}
