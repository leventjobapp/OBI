package com.OBI.StepDefinitions;

import com.OBI.Pages.NavigationPage;
import com.OBI.Utilities.BrowserUtils;
import com.OBI.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateStepDefs {
    NavigationPage navigationPage= new NavigationPage();
    @When("user click on {string} {string} {string}")
    public void user_click_on(String string, String string2, String string3) {

        navigationPage.alleKategorien.click();
        BrowserUtils.waitFor(2);
        navigationPage.navigateToModule(string,string2,string3);


    }

    @Then("user should be able to see {string} on the weppage")
    public void user_should_be_able_to_see_on_the_weppage(String string) {

        String actualTitel = Driver.get().getTitle();

        Assert.assertTrue(actualTitel.contains(string));


    }
    @Then("user should be able to see {string} as a title")
    public void user_should_be_able_to_see_as_a_title(String string) {

    }



}
