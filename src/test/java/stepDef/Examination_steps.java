package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Academic_page;
import pageObject.Examination_menu;
import pageObject.Login_page;

import static base.Setup.driver;

public class Examination_steps {

    Examination_menu examination = new Examination_menu(driver);
    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("Click login button")
    public void cartproduct() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();


    }
    @When("I will click exam type")
    public void examtype() throws InterruptedException {
        examination.examsectionbtn();
        examination.examtype(GlobalTestData.Global_examtype);
    }
}
