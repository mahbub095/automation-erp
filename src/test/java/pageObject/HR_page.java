package pageObject;

import base.GlobalTestData;
import base.Setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class HR_page extends Setup {

    public HR_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Faker faker = new Faker();
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "HUMAN RESOURCE")
    public WebElement hrmenu;
    @FindBy(how = How.LINK_TEXT, using = "DESIGNATION")
    public WebElement designationmenu;
    @FindBy(how = How.NAME, using = "title")
    public WebElement designationTITLE;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save designation']")
    public WebElement savedesignation;
    @FindBy(how = How.LINK_TEXT, using = "DEPARTMENT")
    public WebElement departmentmenu;
    @FindBy(how = How.NAME, using = "name")
    public WebElement departmentname;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save department']")
    public WebElement savedepartment;
    @FindBy(how = How.LINK_TEXT, using = "ADD STAFF")
    public WebElement addstaff;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Role *']")
    public WebElement clickrole;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Teacher']")
    public WebElement selectteacher;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Department *']")
    public WebElement clickdept;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Academic']")
    public WebElement selectacademic;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Designations *']")
    public WebElement clickdegination;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Assistant Teacher']")
    public WebElement selectassistant;
    @FindBy(how = How.NAME, using = "first_name")
    public WebElement FIRST_NAME;
    @FindBy(how = How.NAME, using = "last_name")
    public WebElement LAST_NAME;
    @FindBy(how = How.NAME, using = "email")
    public WebElement CUSTOMER_EMAIL;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Gender *']")
    public WebElement clickgender;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Male')]")
    public WebElement selectmale;
    @FindBy(how = How.NAME, using = "current_address")
    public WebElement ADDRESS;
    @FindBy(how = How.NAME, using = "basic_salary")
    public WebElement SALARY;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Staff']")
    public WebElement SAVESTAFF;


    public void designation(String firstName) throws InterruptedException {

        hrmenu.click();
        designationmenu.click();
        designationTITLE.sendKeys("Assistant Teacher");
        Thread.sleep(500);
        savedesignation.click();


    }

    public void department(String firstName) throws InterruptedException {

        departmentmenu.click();
        departmentname.sendKeys("Academic");
        Thread.sleep(500);
        savedepartment.click();


    }

    public void addstaff(String firstName, String lastName, String email) throws InterruptedException {

        addstaff.click();
        clickrole.click();
        selectteacher.click();
        clickdept.click();
        selectacademic.click();
        clickdegination.click();
        selectassistant.click();

        FIRST_NAME.sendKeys("John");
        LAST_NAME.sendKeys("Smith");
        CUSTOMER_EMAIL.sendKeys("john@gmail.com");


        clickgender.click();
        selectmale.click();
        ADDRESS.sendKeys("USA");
        SALARY.sendKeys("1234");
        SAVESTAFF.click();


    }

    public void enterEmailInSignUpPage(String email) throws InterruptedException {
        CUSTOMER_EMAIL.clear();
        CUSTOMER_EMAIL.sendKeys(email);
        Thread.sleep(500);
    }


    public void enterFirstNameInSignUpPage(String firstName) throws InterruptedException {
        FIRST_NAME.sendKeys(firstName);
        Thread.sleep(1500);
    }

    public void enterLastNameInSignUpPage(String lastName) throws InterruptedException {
        LAST_NAME.sendKeys(lastName);
        Thread.sleep(1500);
    }

    public void staffdata(String lastName) throws InterruptedException {
        clickgender.click();
        selectmale.click();
        ADDRESS.sendKeys("USA");
        SALARY.sendKeys("1234");
        SAVESTAFF.click();
    }

}