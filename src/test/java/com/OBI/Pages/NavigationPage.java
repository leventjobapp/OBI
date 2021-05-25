package com.OBI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.WeakHashMap;

public class NavigationPage extends BasePage{
    @FindBy(xpath = "//span[.='Bohrer & Schrauber']")
    public WebElement dataResultName;

    @FindBy(xpath = "//span[.='Alle Kategorien']")
    public WebElement alleKategorien;

    @FindBy(xpath = "headr__nav-flyout-section")
    public List<WebElement> sortiment;

}
