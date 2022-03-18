package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.HR_page;
import pageObject.Library_page;
import pageObject.Login_page;

import static base.Setup.driver;

public class Library_steps {

    Library_page lib = new Library_page(driver);
    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("submit login button")
    public void logintest() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();


    }

    @When("I will click library ,categories & input categories")
    public void addcategoriestest() throws InterruptedException {
        lib.addbookcategories("");

    }

    @When("I will click subjects & input subjects")
    public void addsubjectstest() throws InterruptedException {
        lib.addsubjects("");
        lib.addBOOK("");

    }
}
