package uk.co.coxauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.coxauto.utility.Util;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:28
 **/
public class ContactMovex extends Util {
    @FindBy (id = "YourName")
    WebElement _yourName;

    @FindBy (id = "PhoneNumber")
    WebElement _phoneNumber;

    @FindBy (id = "EmailAddress")
    WebElement _emailAdd;

    @FindBy (id = "ConfirmEmailAddress")
    WebElement _confirmEmailAdd;

    @FindBy (id = "Message")
    WebElement _enterMessage;

    @FindBy (xpath = "//input[@class='btn btn-primary']")
    WebElement _clickSendMessageBtn;

    @FindBy (xpath = "//p[contains(text(),'Thank you for contacting us!')]")
    WebElement _messageSent;

    public void enterYourName(String name){
        sendTextToElement(_yourName,name);
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(_phoneNumber, number);
    }
    public void enterEmailAdd(String email){
        sendTextToElement(_emailAdd,email);
    }
    public void enterConfirmEmail(String email){
        sendTextToElement(_confirmEmailAdd, email);
    }
    public void enterMessage(String message){
        sendTextToElement(_enterMessage, message);
    }
    public void clickOnSendMessageButton(){
        clickOnElement(_clickSendMessageBtn);
    }
    public String getThankYouMessage(){
        return getTextFromElement(_messageSent);
    }
}
