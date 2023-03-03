package Step_Definitions;

import Pages.CarateriSpeziali_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.management.loading.PrivateClassLoader;

public class CarateriSpeziali_StepDefinitions {

CarateriSpeziali_Page carateriSpeziali_page = new CarateriSpeziali_Page();

    @Given("User deve aprire il browsers e seguire i step")
    public void user_deve_aprire_il_browsers_e_seguire_i_step() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSurl"));

        carateriSpeziali_page.AccetaTutto.click();
        Thread.sleep(2000);

       if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
           carateriSpeziali_page.ClickNellaRicerca.click();
       }else
           System.out.println("La Ricerca non e valida!!");

        Thread.sleep(2000);

    }
    @Then("User deve andare sul la Pagina e seguire")
    public void user_deve_andare_sul_la_pagina_e_seguire() throws InterruptedException {
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("Pensione//Lavoro");
        carateriSpeziali_page.BTNClick.click();

        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt = "Pensione  Lavoro";

        if (carateriSpeziali_page.RisultatoSLash.getText().contains(srt)){
            System.out.println("Resultato e correto ");
            Thread.sleep(3000);
            Driver.getDriver().close();
        }else
            System.out.println("Resultato non e correto!!!!");
        System.out.println("Aspettiamo questo risultato---->" + srt +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
        Thread.sleep(3000);
        Driver.getDriver().close();
    }
    @Then("User deve capire e seguire tutti li step che ci servono.")
    public void user_deve_capire_e_seguire_tutti_li_step_che_ci_servono() {

    }
    @Then("User deve clicare nella home page e cercare un caratero speziale")
    public void user_deve_clicare_nella_home_page_e_cercare_un_caratero_speziale() {

    }


}
