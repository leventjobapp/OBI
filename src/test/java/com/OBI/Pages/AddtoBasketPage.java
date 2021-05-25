package com.OBI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoBasketPage extends BasePage{

    @FindBy(xpath = "//span[@class='description']")
    public WebElement product;

    @FindBy(xpath = "//a[.='In den Warenkorb']")
    public WebElement indenWarenkorb;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement value;

    @FindBy(xpath = "//span[@class='close']")
    public WebElement warenkorbPopupClose;

    @FindBy(xpath = "//div[@class='d-flex flex-column align-items-center position-relative']")
    public  WebElement warebkorbButton;

    @FindBy(xpath = "//a[@class='js-form-submit link-delete']")
    public WebElement artikelLöschen;
}
