package com.OBI.StepDefinitions;

import com.OBI.Pages.LoginPage;
import com.OBI.Utilities.BrowserUtils;
import com.OBI.Utilities.ConfigurationReader;
import com.OBI.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage= new LoginPage();
    @Given("the user on the OBI webpage")
    public void the_user_on_the_OBI_webpage() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage= new LoginPage();
        loginPage.cookiesButton.click();
        Thread.sleep(3000);
        //loginPage.cBoxClose.click();
    }


    @When("user logs in with credentials")
    public void user_logs_in_with_credentials() {
        loginPage.meinObi.click();
        String username= ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");


        loginPage.login(username,password);
        BrowserUtils.waitFor(2);
    }



    @When("user logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
        loginPage.meinObi.click();
        String username= ConfigurationReader.get("invalidUsername");
        String password= ConfigurationReader.get("invalidPassword");


        loginPage.login(username,password);
    }

    @Then("Url ends with {string}")
    public void url_ends_with(String string) {
        BrowserUtils.waitFor(3);
        String actualUrl = Driver.get().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals("https://www.obi.de/"+string,actualUrl);
    }



}
