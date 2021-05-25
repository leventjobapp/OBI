package com.OBI.StepDefinitions;

import com.OBI.Pages.AddtoBasketPage;
import com.OBI.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddtoBasketStepDefs {
    @When("click on the product")
    public void click_on_the_product() {
        BrowserUtils.waitFor(3);
        AddtoBasketPage addtoBasketPage= new AddtoBasketPage();
        addtoBasketPage.product.click();
    }
    @When("click on the In den Warenkorb")
    public void click_on_the_In_den_Warenkorb() {
        BrowserUtils.waitFor(3);
        AddtoBasketPage addtoBasketPage= new AddtoBasketPage();
        addtoBasketPage.indenWarenkorb.click();
        BrowserUtils.waitFor(2);
        addtoBasketPage.warenkorbPopupClose.click();

    }
    @Then("product should add to Basket")
    public void product_should_add_to_Basket() {
        BrowserUtils.waitFor(2);
        AddtoBasketPage addtoBasketPage= new AddtoBasketPage();
        addtoBasketPage.warebkorbButton.click();
        addtoBasketPage.value.getText();
        BrowserUtils.waitFor(2);
        String expectedNumber= "1";
        Assert.assertEquals("1",expectedNumber);
        BrowserUtils.waitFor(2);
        addtoBasketPage.artikelLöschen.click();

    }
    @Then("The selected product should be added to Basket")
    public void the_selected_product_should_be_added_to_Basket() {
        BrowserUtils.waitFor(2);
        AddtoBasketPage addtoBasketPage= new AddtoBasketPage();
        addtoBasketPage.warebkorbButton.click();
        addtoBasketPage.value.getText();
        BrowserUtils.waitFor(2);
        String expectedNumber= "1";
        Assert.assertEquals("1",expectedNumber);
        BrowserUtils.waitFor(2);
        addtoBasketPage.artikelLöschen.click();
    }

}
