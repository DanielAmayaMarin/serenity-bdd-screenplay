package co.com.automatizacion.pedidosweb.userinterfece.IniciarSesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IIniciarSesion {

    public static final Target INPUT_USUARIO = Target.the("usuario input").located(By.id("usuario"));
    public static final Target INPUT_CONTRASENA = Target.the("contraseña input").located(By.id("password"));
    public static final Target BUTTON_INGRESAR = Target.the("Boton Ingresar").located(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));

    public static final Target TITULO = Target.the("Titulo").located(By.xpath("//h1[contains(text(),'Datos usuario')]"));

}
