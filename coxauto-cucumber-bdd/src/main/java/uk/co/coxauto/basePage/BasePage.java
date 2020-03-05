package uk.co.coxauto.basePage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:26
 **/
public class BasePage {

    public static WebDriver driver;

    public BasePage(){

        PageFactory.initElements(driver,this);
    }
}
