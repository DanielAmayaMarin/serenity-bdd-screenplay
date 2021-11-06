package co.com.automatizacion.pedidosweb.stepdefinitions;

import co.com.automatizacion.pedidosweb.model.DatosSensiblesModel;
import co.com.automatizacion.pedidosweb.model.PedidoModel;
import co.com.automatizacion.pedidosweb.questions.DigitarPedidoQuestions;
import co.com.automatizacion.pedidosweb.tasks.AbrirPagina;
import co.com.automatizacion.pedidosweb.tasks.DigitarPedidos.AbrirModuloPedidos;
import co.com.automatizacion.pedidosweb.tasks.DigitarPedidos.RealizarPedidoWeb;
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

public class DigitarPedidoStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que la AI se encuentra en el modulo de Pedido a Credito$")
    public void que_la_AI_se_encuentra_en_el_modulo_de_Pedido_a_Credito(List<DatosSensiblesModel> datossensibles) {
        theActorCalled(datossensibles.get(0).getCedulaai()).wasAbleTo(
                AbrirPagina.pagina(),
                IniciarSesionPedidosWeb.informacion(datossensibles.get(0)),
                AbrirModuloPedidos.abrir()
        );
    }


    @Cuando("^ingrese los sku que desea solicitar$")
    public void ingrese_los_sku_que_desea_solicitar(List<PedidoModel> pedidoModels) {

        theActorInTheSpotlight().wasAbleTo(
                RealizarPedidoWeb.informacion(pedidoModels.get(0))
        );
    }

    @Entonces("^se valida si la solicitud fue exitosa$")
    public void se_valida_si_la_solicitud_fue_exitosa(List<PedidoModel> pedidoModels) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(DigitarPedidoQuestions.validacion(pedidoModels.get(0).getTitulo()))
        );
    }

}
