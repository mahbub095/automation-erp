package pageObject;

import base.Setup;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Adminsection extends Setup {

    public Adminsection(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    @FindBy(how = How.NAME, using = "email")
    public WebElement GLOBAL_CUSTOMER_EMAIL;
    @FindBy(how = How.NAME, using = "password")
    public WebElement GLOBAL_CUSTOMER_PASSWORD;
    @FindBy(how = How.ID, using = "btnsubmit")
    public WebElement GLOBAL_LOGIN_BUTTON;
    @FindBy(how = How.LINK_TEXT, using = "ADMIN SECTION")
    public WebElement Adminbtn;
    @FindBy(how = How.LINK_TEXT, using = "ADMIN SETUP")
    public WebElement AdminSetup;

    @FindBy(how = How.LINK_TEXT, using = "ACCOUNTS")
    public WebElement ACCOUNTS;
    @FindBy(how = How.NAME, using = "bank_name")
    public WebElement GLobal_BankName;
    @FindBy(how = How.NAME, using = "account_name")
    public WebElement Global_AccountName;
    @FindBy(how = How.NAME, using = "account_number")
    public WebElement Global_AccountNumber;
    @FindBy(how = How.NAME, using = "account_type")
    public WebElement Global_AccountType;
    @FindBy(how = How.NAME, using = "opening_balance")
    public WebElement Global_OpeningBalance;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Account']")
    public WebElement SaveAccount;
    @FindBy(how = How.LINK_TEXT, using = "BANK ACCOUNT")
    public WebElement Bank_accountbtn;


    public void enterUsername(String firstName) throws InterruptedException {
        GLOBAL_CUSTOMER_EMAIL.clear();
        GLOBAL_CUSTOMER_EMAIL.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void enterPasword(String password) throws InterruptedException {
        GLOBAL_CUSTOMER_PASSWORD.clear();
        GLOBAL_CUSTOMER_PASSWORD.sendKeys(password);
        Thread.sleep(500);
    }

    public void enterloginbutton() {
        GLOBAL_LOGIN_BUTTON.click();

    }

    public void adminsectionbtn() {
        Adminbtn.click();

    }

    public void adminsetupbtn() {
        AdminSetup.click();

    }

    public void bankaccbtn() {
        ACCOUNTS.click();
        Bank_accountbtn.click();

    }

    public void accounts(String firstName) throws InterruptedException {


        GLobal_BankName.sendKeys(firstName);


    }

    public void accountsname(String firstName) throws InterruptedException {

        Global_AccountName.sendKeys(firstName);
    }

    public void accountsnumber(String firstName) throws InterruptedException {

        Global_AccountNumber.sendKeys(firstName);
    }

    public void accountstype(String firstName) throws InterruptedException {

        Global_AccountType.sendKeys(firstName);
    }

    public void openingbalance(String firstName) throws InterruptedException {

        Global_OpeningBalance.sendKeys(firstName);
        SaveAccount.click();
    }
}