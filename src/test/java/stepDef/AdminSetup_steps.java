package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Admin_Setup_Page;
import pageObject.Adminsection;
import pageObject.Login_page;

import static base.Setup.driver;

public class AdminSetup_steps {


    Admin_Setup_Page adminsetuppage = new Admin_Setup_Page(driver);
    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("Setup admin & create referenc source purpose")
    public void adminsetuptest() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();
        adminsetuppage.adminsectionbtn();
        adminsetuppage.adminsetupbtn();
        adminsetuppage.purposetype("");
        adminsetuppage.referncetype("");
        adminsetuppage.sourcetype("");
        adminsetuppage.complinttype("");


    }

    @When("I fillup addmission query form")
    public void addquerytest() throws InterruptedException {
        adminsetuppage.addquery("");
    }

    @When("I fillup Complaint query form")
    public void addcompain() throws InterruptedException {
        adminsetuppage.addcompainted("");
    }

    @When("I fillup Postal Receive form")
    public void addpostaltest() throws InterruptedException {
        adminsetuppage.addpostal("");
    }

    @When("I fillup Postal Dispatch form")
    public void addpostaldispatchtest() throws InterruptedException {
        adminsetuppage.addpostalDIS("");
    }
}
