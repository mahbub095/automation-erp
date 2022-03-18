package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Academic_page;
import pageObject.Homework_page;
import pageObject.Login_page;

import static base.Setup.driver;

public class Homework_steps {
    Homework_page HW = new Homework_page(driver);

    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("click to login button")
    public void login() throws InterruptedException {
       /* LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);*/
        LOGIN.enterloginbutton();
    }

    @When("I will click Homework & fillup homework")
    public void homeworktest() throws InterruptedException {
        HW.ADDHOMEWORK("");
    }
}