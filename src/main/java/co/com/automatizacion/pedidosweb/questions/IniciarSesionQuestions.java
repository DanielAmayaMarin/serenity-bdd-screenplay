package co.com.automatizacion.pedidosweb.questions;

import co.com.automatizacion.pedidosweb.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automatizacion.pedidosweb.userinterfece.IniciarSesion.IIniciarSesion.TITULO;

public class IniciarSesionQuestions implements Question<Boolean> {

    private String question;

    public IniciarSesionQuestions(String question) {
        this.question = question;
    }

    public static IniciarSesionQuestions validacion(String question) {
        return new IniciarSesionQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(TITULO).viewedBy(actor).asString();
        Esperar.milisegundos(1000);
        return question.equals(title);
    }
}
