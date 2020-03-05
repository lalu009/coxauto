package uk.co.coxauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.coxauto.utility.Util;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:28
 **/
public class HomePage extends Util {

    @FindBy(xpath = "//a[contains(text(),'Get In Touch')]")
    WebElement _getInTouchLink;


    public void clickOnGetInTouchLink() {
        clickOnElement(_getInTouchLink);
    }
}