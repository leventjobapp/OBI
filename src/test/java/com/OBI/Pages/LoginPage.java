package com.OBI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[.='Mein OBI']")
    public WebElement meinObi;

    @FindBy(id = "cboxClose")
    public WebElement cBoxClose;

    @FindBy(id = "headr_email")
    public WebElement usernameBox;

    @FindBy(id = "headr_pw")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Jetzt anmelden']")
    public WebElement anmeldenButton;

    @FindBy(xpath = "//button[@class='cookiepolicy__button button button--dark-green button--mb-width-100 js-cookiepolicy-dismish']")
    public WebElement cookiesButton;

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        anmeldenButton.click();
        // verification that we logged
    }

}
