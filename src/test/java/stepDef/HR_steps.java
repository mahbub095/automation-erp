package stepDef;

import base.GlobalTestData;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Examination_menu;
import pageObject.HR_page;
import pageObject.Login_page;

import static base.Setup.driver;

public class HR_steps {


    Faker faker = new Faker();
    HR_page hr = new HR_page(driver);
    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("goto login button")
    public void logintest() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();


    }

    @When("I will click human resource & fillup designation")
    public void designationtest() throws InterruptedException {
        hr.designation("");

    }

    @When("I will click fillup department")
    public void departmenttest() throws InterruptedException {
        hr.department("");

    }

    @When("I will fillup staff")
    public void stafftest() throws InterruptedException {
        hr.addstaff("", "", "");


        hr.staffdata("");

    }
}

