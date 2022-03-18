package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Accounts_page;
import pageObject.Adminsection;
import pageObject.Login_page;

import static base.Setup.driver;

public class Accounts_steps {

    Accounts_page accmenu = new Accounts_page(driver);
    Login_page LOGIN = new Login_page(driver);

    @Given("Click Accouts Chart Of Account Button")
    public void Accmenu() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();
        accmenu.clickaccmenu();

    }

    @When("I will check income & expense crud")
    public void charts() throws InterruptedException {
        accmenu.enterheadname("");
        accmenu.clicktype();
    }
}