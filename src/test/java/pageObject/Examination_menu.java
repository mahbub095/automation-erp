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

public class Examination_menu extends Setup {

    public Examination_menu(WebDriver driver) {

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
    @FindBy(how = How.LINK_TEXT, using = "EXAMINATION")
    public WebElement exambtn;
    @FindBy(how = How.LINK_TEXT, using = "EXAM TYPE")
    public WebElement examtypebtn;
    @FindBy(how = How.NAME, using = "exam_type_title")
    public WebElement Global_examtype;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Exam Type']")
    public WebElement ExamtypeSave;
    @FindBy(how = How.LINK_TEXT, using = "EXAM SETUP")
    public WebElement examsetup;
    @FindBy(how = How.XPATH, using = "//label[normalize-space()='1st term']")
    public WebElement examterm;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Class *']")
    public WebElement selectexam;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Class One')]")
    public WebElement selectexamone;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'English')]")
    public WebElement subjectbangla;
    @FindBy(how = How.NAME, using = "exam_marks")
    public WebElement EXAMMARK;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Marks']")
    public WebElement SAVE;


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

    public void examsectionbtn() {
        exambtn.click();
        examtypebtn.click();

    }

    public void examtype(String firstName) throws InterruptedException {

        Global_examtype.sendKeys("1st term");
        Thread.sleep(500);
        ExamtypeSave.click();
        examsetup.click();
        examterm.click();
        selectexam.click();
        selectexamone.click();
        subjectbangla.click();
        EXAMMARK.sendKeys("50");
        SAVE.click();
    }
}