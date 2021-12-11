package co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep4;

import co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep4.UtestRegisterUserStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistrationUserStep4 implements Task {

    private String password;

    public RegistrationUserStep4(String password) {
        this.password = password;
    }

    public static Performable thePage(String password) {
        return Tasks.instrumented(RegistrationUserStep4.class,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Ingresar la contraseña
                Enter.theValue(password).into(UtestRegisterUserStep4Page.INSERT_PASSWORD),

                //Ingresar la confirmacion de contraseña
                Enter.theValue(password).into(UtestRegisterUserStep4Page.INSERT_CONFIRMATION_PASSWORD),

                //Selecionar primer check 1
                Click.on(UtestRegisterUserStep4Page.CHEK1),

                //Selecionar primer check 2
                Click.on(UtestRegisterUserStep4Page.CHEK2),

                //Selecionar primer check 3
                Click.on(UtestRegisterUserStep4Page.CHEK3),

                //Boton para completar el regsitro del usuario
                Click.on(UtestRegisterUserStep4Page.BUTTON_REGISTER_COMPLET),

                //Verifiar si se ingreso el usuario
                WaitUntil.the(UtestRegisterUserStep4Page.USER_VERIFICATION_COMPLETED, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
