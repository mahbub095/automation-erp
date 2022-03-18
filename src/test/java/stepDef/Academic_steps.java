package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import pageObject.Academic_page;
import pageObject.Login_page;

import static base.Setup.driver;

public class Academic_steps {
    Academic_page Academiclink = new Academic_page(driver);

    Login_page LOGIN = new Login_page(driver);
    @SuppressWarnings("static-access")
    @Given("Click academic button")
    public void login() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();
    }

    @When("I will click on sections then input section and press save section")
    public void section() throws InterruptedException {
        Academiclink.click_item();
        Academiclink.click_section();
        Academiclink.entersectionname(GlobalTestData.GLOBAL_Section_Name);
        Academiclink.click_sectionbtn();
    }

    @Then("I will click on Class then input class ,select select and press save section")
    public void classmenu() throws InterruptedException {
        Academiclink.click_Classlink();
        Academiclink.enterSelect_section(GlobalTestData.GLOBAL_CLASS_NAME);
        Academiclink.select_sectiona1();
        Academiclink.entersavesection();
    }
    @Then("I will click on subject and fillup subject")
    public void subjectsmenu() throws InterruptedException {
        Academiclink.subjects("");

    }
    @Then("I will click on assign subject and fillup subject")
    public void subjectsassign() throws InterruptedException {
        Academiclink.assignsubject("");

    }

 /*   @Then("I will add a student and fillup all data")
    public void addstud() throws InterruptedException {
        Academiclink.clickstubtn();
        Academiclink.stuyear();
        Academiclink.enterstduname(GlobalTestData.GLOBAL_FIRSTNAME);
        Academiclink.clickgender();
        Academiclink.enterdob(GlobalTestData.GLOBAL_clickdob);
        Academiclink.enterEMAIL(GlobalTestData.GLOBAL_EMAIL);
        Academiclink.enterGUARDEMAIL(GlobalTestData.GLOBAL_GUARD_EMAIL);
        Academiclink.enterGUARDphone(GlobalTestData.GLOBAL_GUARD_phone);
        Academiclink.adminextra("");
        Academiclink.clickastubtn2();

    }*/
}