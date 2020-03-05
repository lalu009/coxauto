package uk.co.coxauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.coxauto.utility.Util;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 15:34
 **/
public class GetInTouchPage extends Util {

@FindBy (xpath = "//a[contains(text(),'Contact Movex')]")
    WebElement _contactMovex;

    public void clickOnMovexButton(){
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(_contactMovex));
        clickOnElement(_contactMovex);
    }
}
