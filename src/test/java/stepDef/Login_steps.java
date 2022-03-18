package stepDef;

import base.GlobalTestData;
import base.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.Login_page;


public class Login_steps extends Setup {

    Faker faker = new Faker();
    Login_page LOGIN = new Login_page(driver);

    @Given("I fill up the username")
    public void username() throws Exception {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
    }

    @And("I fill up the password")
    public void Pasword() throws Exception {
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
    }

    @Given("Click Login Button")
    public void LoginBTN() {
        LOGIN.enterloginbutton();
    }
}


