package uk.co.coxauto.resources;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.coxauto.pages.ContactMovex;
import uk.co.coxauto.pages.GetInTouchPage;
import uk.co.coxauto.pages.HomePage;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 15:59
 **/

public class MyStepdefs {

    ContactMovex contactMovex = new ContactMovex();
    GetInTouchPage getInTouchPage = new GetInTouchPage();
    HomePage homePage = new HomePage();

    @Given("^I am on the CoxAuto homepage$")
    public void iAmOnTheCoxAutoHomepage() {

    }

    @When("^I click on Get in touch link$")
    public void iClickOnGetInTouchLink() {
        homePage.clickOnGetInTouchLink();
    }

    @And("^I click on contact Movex at the bottom of the page$")
    public void iClickOnContactMovexAtTheBottomOfThePage() {
        getInTouchPage.clickOnMovexButton();
    }

    @And("^I enter my name \"([^\"]*)\"$")
    public void iEnterMyName(String name)  {
        // Write code here that turns the phrase above into concrete actions
    contactMovex.enterYourName(name);
    }

    @And("^I enter my phone no \"([^\"]*)\"$")
    public void iEnterMyPhoneNo(String number)  {
        // Write code here that turns the phrase above into concrete actions
    contactMovex.enterPhoneNumber(number);
    }

    @And("^I enter my email \"([^\"]*)\"$")
    public void iEnterMyEmail(String email)  {
        // Write code here that turns the phrase above into concrete actions
    contactMovex.enterEmailAdd(email);
    }

    @And("^I confirm my email \"([^\"]*)\"$")
    public void iConfirmMyEmail(String email)  {
        // Write code here that turns the phrase above into concrete actions
    contactMovex.enterConfirmEmail(email);
    }

    @And("^I type my massage\"([^\"]*)\"$")
    public void iTypeMyMassage(String message)  {
        // Write code here that turns the phrase above into concrete actions
    contactMovex.enterMessage(message);
    }

    @And("^I click on send massage button$")
    public void iClickOnSendMassageButton() {
        contactMovex.clickOnSendMessageButton();
    }

    @Then("^Thank you massage should be displayed$")
    public void thankYouMassageShouldBeDisplayed() {
        Assert.assertEquals("Thank you for contacting us!",contactMovex.getThankYouMessage());
    }
}

