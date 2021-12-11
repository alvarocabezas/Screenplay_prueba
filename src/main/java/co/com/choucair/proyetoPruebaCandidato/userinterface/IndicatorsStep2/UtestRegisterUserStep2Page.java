package co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep2;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterUserStep2Page extends PageObject {

    //Elemento para ingrsar la ciudad
    public static final Target INSERT_CITY = Target.the("Ingresar la ciudad").located(By.id("city"));

    //Elemento para ingresar codigo postal
    public static final Target INSERT_CODE_POSTAL = Target.the("Ingresar el codgo postal").located(By.id("zip"));

    //Elemento para ingresar el pais
    public static final Target INSERT_COUNTRY = Target.the("Selecionar el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INSERT_TEXT_COUNTRY = Target.the("Ingresar el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    //Boton para ingresar a la tercera seccion del registro
    public static final Target BUTTON_THIRD_SECTION_REGISTER = Target.the("ingreso a la tercer paso del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
