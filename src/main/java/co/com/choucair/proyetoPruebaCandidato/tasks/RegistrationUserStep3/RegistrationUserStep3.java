package co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep3;

import co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep3.UtestRegisterUserStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegistrationUserStep3 implements Task {

    private String computer;
    private String computer_version;
    private String computer_language;

    public RegistrationUserStep3(String computer, String computer_version, String computer_language) {
        this.computer = computer;
        this.computer_version = computer_version;
        this.computer_language = computer_language;
    }

    public static Performable thePage(String computer, String computer_version, String computer_language) {
        return Tasks.instrumented(RegistrationUserStep3.class,computer,computer_version,computer_language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Seleccionar el campo de computador
                Click.on(UtestRegisterUserStep3Page.CLICK_YOUR_COMPUTER),

                //Ingresar el nombre del computador
                Enter.theValue(computer).into(UtestRegisterUserStep3Page.TEXT_YOUR_COMPUTER),

                //Dar enter al computador pre seleccionado
                Hit.the(Keys.ENTER).into(UtestRegisterUserStep3Page.TEXT_YOUR_COMPUTER),

                //Seleccionar la version del computador
                Click.on(UtestRegisterUserStep3Page.CLICK_VERSION_COMPUTER),

                //Ingresar el nombre de la version del computador
                Enter.theValue(computer_version).into(UtestRegisterUserStep3Page.TEXT_VERSION_COMPUTER),

                //Dar enter a la version del computador pre seleccionado
                Hit.the(Keys.ENTER).into(UtestRegisterUserStep3Page.TEXT_VERSION_COMPUTER),

                //Seleccionar el idioma del computador
                Click.on(UtestRegisterUserStep3Page.CLICK_LENGUAGE_COMPUTER),

                //Ingresar el nombre del idioma del computador
                Enter.theValue(computer_language).into(UtestRegisterUserStep3Page.TEXT_LENGUAGE_COMPUTER),

                //Dar enter al idioma del computador pre seleccionado
                Hit.the(Keys.ENTER).into(UtestRegisterUserStep3Page.TEXT_LENGUAGE_COMPUTER),

                //Ingresar a la cuarta parte del registro
                Click.on(UtestRegisterUserStep3Page.BUTTON_FOURTH_SECTION_REGISTER)
        );
    }
}
