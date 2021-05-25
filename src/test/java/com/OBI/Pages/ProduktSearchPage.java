package com.OBI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProduktSearchPage extends BasePage{
    @FindBy(id = "Search-Input")
    public WebElement searchbox;

    @FindBy(xpath = "//p[.='Akku-Rasenmäher']")
    public WebElement akkurasenmäher;

    @FindBy(xpath = "//h1[.='rasenmäher ']")
    public WebElement ergebnisse;

}
