package co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep1;

import co.com.choucair.proyetoPruebaCandidato.userinterface.IndicatorsStep1.UtestRegisterUserStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class RegistrationUserStep1 implements Task {

    private String name;
    private String last_name;
    private String email;
    private String birth_month;
    private String birth_day;
    private String birth_year;
    private String languages;

    public RegistrationUserStep1(String name, String last_name, String email, String birth_month, String birth_day, String birth_year, String languages) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.birth_month = birth_month;
        this.birth_day = birth_day;
        this.birth_year = birth_year;
        this.languages = languages;
    }

    public static Performable thePage(String name, String last_name, String email, String birth_month, String birth_day, String birth_year, String languages) {
        return Tasks.instrumented(RegistrationUserStep1.class,name,last_name,email,birth_month,birth_day,birth_year,languages);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Tiepo de espera para ingresar al registro
                WaitUntil.the(UtestRegisterUserStep1Page.BUTTON_REGISTER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),

                //Ingresar al panel de registro.
                Click.on(UtestRegisterUserStep1Page.BUTTON_REGISTER),

                //Ingresar el nombre
                Enter.theValue(name).into(UtestRegisterUserStep1Page.INSERT_NAME),

                //Ingresar el apellido
                Enter.theValue(last_name).into(UtestRegisterUserStep1Page.INSERT_LASTNAME),

                //Ingresar el email.
                Enter.theValue(email).into(UtestRegisterUserStep1Page.INSERT_EMAIL),

                //Selecionar mes de nacimiento
                SelectFromOptions.byVisibleText(birth_month).from(UtestRegisterUserStep1Page.INSERT_MES),

                //Selecionar dia de nacimiento
                SelectFromOptions.byVisibleText(birth_day).from(UtestRegisterUserStep1Page.INSERT_DIA),

                //Selecionar años de nacimiento
                SelectFromOptions.byVisibleText(birth_year).from(UtestRegisterUserStep1Page.INSERT_ANO),

                //Ingresar idioma
                Enter.theValue(languages).into(UtestRegisterUserStep1Page.INSERT_IDIOMA),

                //Dar enter en el idioma pre seleccionado
                Hit.the(Keys.ENTER).into(UtestRegisterUserStep1Page.INSERT_IDIOMA),

                //Ingresar a la segunda parte del registro
                Click.on(UtestRegisterUserStep1Page.BUTTON_SECOND_SECTION_REGISTER)

        );

    }
}
