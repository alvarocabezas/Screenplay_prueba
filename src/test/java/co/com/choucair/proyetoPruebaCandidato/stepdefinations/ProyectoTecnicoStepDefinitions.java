package co.com.choucair.proyetoPruebaCandidato.stepdefinations;

import co.com.choucair.proyetoPruebaCandidato.model.DataRegistro;
import co.com.choucair.proyetoPruebaCandidato.tasks.IngresoUrl.OpenUp;
import co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep1.RegistrationUserStep1;
import co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep2.RegistrationUserStep2;
import co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep3.RegistrationUserStep3;
import co.com.choucair.proyetoPruebaCandidato.tasks.RegistrationUserStep4.RegistrationUserStep4;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ProyectoTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Alvaro wants to enter the user registration url$")
    public void thatAlvaroWantsToEnterTheUserRegistrationUrl() {
        //Igresar a la url del test
        OnStage.theActorCalled("").wasAbleTo(OpenUp.thePage());
    }


    @When("^enter all the appropriate data for user registration on the Utest platform$")
    public void enterAllTheAppropriateDataForUserRegistrationOnTheUtestPlatform(List<DataRegistro>dataRegistro) throws Exception {

        //paso 1 del regsitro
        OnStage.theActorInTheSpotlight().wasAbleTo(RegistrationUserStep1.thePage(dataRegistro.get(0).getName(),
                dataRegistro.get(0).getLast_name(),
                dataRegistro.get(0).getEmail(),
                dataRegistro.get(0).getBirth_month(),
                dataRegistro.get(0).getBirth_day(),
                dataRegistro.get(0).getBirth_year(),
                dataRegistro.get(0).getLanguages()));
        //paso 2 del regsitro
        OnStage.theActorInTheSpotlight().wasAbleTo(RegistrationUserStep2.thePage(dataRegistro.get(0).getCity(),
                dataRegistro.get(0).getCode_postal(),
                dataRegistro.get(0).getCountry()));
        //paso 3 del regsitro
        OnStage.theActorInTheSpotlight().wasAbleTo(RegistrationUserStep3.thePage(dataRegistro.get(0).getComputer(),
                dataRegistro.get(0).getComputer_version(),
                dataRegistro.get(0).getComputer_language()));
        //paso 4 del regsitro
        OnStage.theActorInTheSpotlight().wasAbleTo(RegistrationUserStep4.thePage(dataRegistro.get(0).getPassword()));
    }



    @Then("^verify that the registration is complete$")
    public void verifyThatTheRegistrationIsComplete() {

    }


}
