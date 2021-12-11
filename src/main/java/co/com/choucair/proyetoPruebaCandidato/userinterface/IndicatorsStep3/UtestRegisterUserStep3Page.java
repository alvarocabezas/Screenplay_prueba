package co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep3;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterUserStep3Page extends PageObject {

    //Elemento para selecionar mi computador
    public static final Target CLICK_YOUR_COMPUTER = Target.the("Ingresar el computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));

    //Elemento para ingresar nombre del sistema operativo del computador
    public static final Target TEXT_YOUR_COMPUTER = Target.the("Ingresar el nombre del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    //Elemento para selcionar la version del comptador
    public static final Target CLICK_VERSION_COMPUTER = Target.the("Ingresar la version del comptador").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    //Elemento para ingresar nombre de la vercion del computador
    public static final Target TEXT_VERSION_COMPUTER = Target.the("Ingresar el nombre del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    //Elemento para selecionar idioma del computador
    public static final Target CLICK_LENGUAGE_COMPUTER = Target.the("Ingresar el lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    //Elemento para ingresar nombre del idioma del comptador
    public static final Target TEXT_LENGUAGE_COMPUTER = Target.the("Ingresar el nombre del lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    //Boton para ingresar a la tercera seccion del registro
    public static final Target BUTTON_FOURTH_SECTION_REGISTER = Target.the("ingreso a la cuarto paso del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));




}
