package co.com.automatizacion.pedidosweb.userinterfece.IniciarSesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IValidarUsuario {

    public static final Target VALIDAR_USUARIO = Target.the("usuario input").located(By.id("usuario"));
    public static final Target CONTINUAR = Target.the("validar usuario en bd").located(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));


}
