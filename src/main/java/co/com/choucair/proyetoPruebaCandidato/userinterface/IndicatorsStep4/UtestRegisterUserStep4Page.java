package co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep4;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterUserStep4Page extends PageObject {

    //Elemento para ingresar la contraseña
    public static final Target INSERT_PASSWORD = Target.the("Ingreso de la contraseña").located(By.id("password"));

    //Elemento para ingresar la confirmacion contraseña
    public static final Target INSERT_CONFIRMATION_PASSWORD = Target.the("Ingreso de la confirmacion de contraseña").located(By.id("confirmPassword"));

    //Elemento para selecionar el check mumero 1
    public static final Target CHEK1 = Target.the("Selecion del check numero 1").located(By.name("newsletterOptIn"));

    //Elemento para selecionar el check mumero 2
    public static final Target CHEK2 = Target.the("Selecion del check numero 2").located(By.name("termOfUse"));

    //Elemento para selecionar el check mumero 3
    public static final Target CHEK3 = Target.the("Selecion del check numero 3").located(By.name("privacySetting"));

    //Boton de registro completo
    public static final Target BUTTON_REGISTER_COMPLET = Target.the("Boton para ingresar el usuario").located(By.id("laddaBtn"));

    //Berificar si se guardo el usuario
    public static final Target USER_VERIFICATION_COMPLETED = Target.the("Texto de comfirmacion del resgistro").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
