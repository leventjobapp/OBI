package com.OBI.StepDefinitions;

import com.OBI.Pages.ProduktSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ProduktSearchStepDefs {
    ProduktSearchPage produktSearchPage= new ProduktSearchPage();
    @When("user search {string} on the search box")
    public void user_search_on_the_search_box(String string) {

        produktSearchPage.searchbox.sendKeys(string+ Keys.ENTER);
    }

    @When("click on the {string}")
    public void click_on_the(String string) {

        produktSearchPage.akkurasenmäher.click();
    }

    @Then("user should be able to see {string} related products")
    public void user_should_be_able_to_see_related_products(String string) {

        String actualErgebnis=produktSearchPage.ergebnisse.getText();
        Assert.assertEquals(string,actualErgebnis);
    }
}
