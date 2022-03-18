package stepDef;

import base.GlobalTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import pageObject.Adminsection;
import pageObject.Login_page;


import static base.Setup.driver;

public class Admin_steps {

    Adminsection accountsetup = new Adminsection(driver);
    Login_page LOGIN = new Login_page(driver);

    @SuppressWarnings("static-access")
    @Given("Login")
    public void login() throws InterruptedException {
        LOGIN.enterUsername(GlobalTestData.GLOBAL_CUSTOMER_USERNAME);
        LOGIN.enterPasword(GlobalTestData.GLOBAL_CUSTOMER_PASSWORD);
        LOGIN.enterloginbutton();

        accountsetup.bankaccbtn();
        accountsetup.accounts(GlobalTestData.GLobal_BankName);
        accountsetup.accountsname(GlobalTestData.Global_AccountName);
        accountsetup.accountsnumber(GlobalTestData.Global_AccountNumber);
        accountsetup.accountstype(GlobalTestData.Global_AccountType);
        accountsetup.openingbalance(GlobalTestData.Global_OpeningBalance);


    }
}

