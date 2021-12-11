package co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep2;

import co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep2.UtestRegisterUserStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegistrationUserStep2 implements Task {

    private String city;
    private String code_postal;
    private String country;

    public RegistrationUserStep2(String city, String code_postal, String country) {
        this.city = city;
        this.code_postal = code_postal;
        this.country = country;
    }

    public static Performable thePage(String city, String code_postal, String country) {
        return Tasks.instrumented(RegistrationUserStep2.class,city,code_postal,country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            //Ingresar ciudad
            Enter.theValue(city).into(UtestRegisterUserStep2Page.INSERT_CITY),

            //Dar una fleha abajo para selecionar la ciudad
            Hit.the(Keys.ARROW_DOWN).into(UtestRegisterUserStep2Page.INSERT_CITY),

            //Selecionar el campo de pais
            Click.on(UtestRegisterUserStep2Page.INSERT_COUNTRY),

            //Ingresar el nombre del pais
            Enter.theValue(country).into(UtestRegisterUserStep2Page.INSERT_TEXT_COUNTRY),

            //Dar enter al pais pre seleccionado
            Hit.the(Keys.ENTER).into(UtestRegisterUserStep2Page.INSERT_TEXT_COUNTRY),

            //Ingresar el codigo postal
            Enter.theValue(code_postal).into(UtestRegisterUserStep2Page.INSERT_CODE_POSTAL),

            //Ingresar a la tercera parte del registro
            Click.on(UtestRegisterUserStep2Page.BUTTON_THIRD_SECTION_REGISTER)
        );

    }
}
