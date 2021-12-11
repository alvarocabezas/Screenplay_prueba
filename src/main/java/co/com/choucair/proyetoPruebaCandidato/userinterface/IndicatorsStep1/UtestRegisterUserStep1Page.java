package co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep1;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterUserStep1Page extends PageObject {

    //Boton para ingresar al modulo de registro
    public static final Target BUTTON_REGISTER = Target.the("Ingreso al mdulo de registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    //Elemento para ingrsar el nombre
    public static final Target INSERT_NAME = Target.the("Ingreso de nombre").located(By.id("firstName"));

    //Elemento para ingresoar del apellido
    public static final Target INSERT_LASTNAME = Target.the("Ingreso de apellido").located(By.id("lastName"));

    //Elemento para ingresar el email
    public static final Target INSERT_EMAIL = Target.the("Ingreso del email").located(By.id("email"));

    //INGRESALA FEHA DE NACIMIENTO
    //Elemento para ingresar el mes
    public static final Target INSERT_MES = Target.the("Seleionar el mes").located(By.id("birthMonth"));

    //Elemento para ingresar el dia
    public static final Target INSERT_DIA = Target.the("Seleionar el dia").located(By.id("birthDay"));

    //Elemento para ingresar el año
    public static final Target INSERT_ANO = Target.the("Seleionar el año").located(By.id("birthYear"));

    //Elemento para ingresar el idioma
    public static final Target INSERT_IDIOMA = Target.the("Ingresar idioma").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    //Boton para ingresar a la segunda seccion del registro
    public static final Target BUTTON_SECOND_SECTION_REGISTER = Target.the("Ingreso a la segundo paso del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
