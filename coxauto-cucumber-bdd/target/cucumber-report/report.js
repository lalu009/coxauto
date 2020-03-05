$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resource/featurefile/contactus.feature");
formatter.feature({
  "line": 1,
  "name": "CoxAuto contact us feature",
  "description": "As a user i want to contact CoxAuto",
  "id": "coxauto-contact-us-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 25954793562,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should contact Movex successfully",
  "description": "",
  "id": "coxauto-contact-us-feature;user-should-contact-movex-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the CoxAuto homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Get in touch link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on contact Movex at the bottom of the page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter my name \" Steve Jobs\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my phone no \"07979797979\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my email \"abcd12@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I confirm my email \"abcd12@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I type my massage\" I would like to enquiry about X product\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on send massage button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Thank you massage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheCoxAutoHomepage()"
});
formatter.result({
  "duration": 756488487,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnGetInTouchLink()"
});
formatter.result({
  "duration": 5794614929,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnContactMovexAtTheBottomOfThePage()"
});
formatter.result({
  "duration": 10385028711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Steve Jobs",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.iEnterMyName(String)"
});
formatter.result({
  "duration": 555776925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07979797979",
      "offset": 21
    }
  ],
  "location": "MyStepdefs.iEnterMyPhoneNo(String)"
});
formatter.result({
  "duration": 469217083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd12@gmail.com",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterMyEmail(String)"
});
formatter.result({
  "duration": 487914743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd12@gmail.com",
      "offset": 20
    }
  ],
  "location": "MyStepdefs.iConfirmMyEmail(String)"
});
formatter.result({
  "duration": 366846640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " I would like to enquiry about X product",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iTypeMyMassage(String)"
});
formatter.result({
  "duration": 537842989,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSendMassageButton()"
});
formatter.result({
  "duration": 228061342,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.thankYouMassageShouldBeDisplayed()"
});
formatter.result({
  "duration": 1080957185,
  "status": "passed"
});
formatter.after({
  "duration": 927246965,
  "status": "passed"
});
});