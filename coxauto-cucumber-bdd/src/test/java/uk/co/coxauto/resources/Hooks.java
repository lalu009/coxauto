package uk.co.coxauto.resources;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.coxauto.basePage.BasePage;
import uk.co.coxauto.browserSelector.BrowserSelector;
import uk.co.coxauto.loadProperty.LoadProperty;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:35
 **/
public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    @Before
    public void setUp(){
        browserSelector.selectBrowser(loadProperty.getProperty("browser"));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
