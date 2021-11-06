package co.com.automatizacion.pedidosweb.questions;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automatizacion.pedidosweb.userinterfece.DigitarPedidos.IModuloPedidos.TITULO_CONFIRMACION;

public class DigitarPedidoQuestions implements Question<Boolean> {

    private String question;

    public DigitarPedidoQuestions(String question) {
        this.question = question;
    }

    public static DigitarPedidoQuestions validacion(String question) {
        return new DigitarPedidoQuestions(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(TITULO_CONFIRMACION).viewedBy(actor).asString();
        Esperar.milisegundos(100);
        return question.equals(title);
    }
}
