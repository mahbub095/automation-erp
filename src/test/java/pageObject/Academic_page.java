package pageObject;

import base.Setup;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Academic_page extends Setup {

    public Academic_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "ACADEMICS")
    public WebElement Academiclink;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Section')]")
    public WebElement Sectionlink;
    @FindBy(how = How.NAME, using = "name")
    public WebElement GLOBAL_Section_Name;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Section']")
    public WebElement Save_Section;
    @FindBy(how = How.LINK_TEXT, using = "CLASS")
    public WebElement Classlink;
    @FindBy(how = How.NAME, using = "name")
    public WebElement GLOBAL_CLASS_NAME;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Section A4')]")
    public WebElement Select_section;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Class']")
    public WebElement Save_class;
    @FindBy(how = How.LINK_TEXT, using = "STUDENT INFO")
    public WebElement CLickstudenmeu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Student')]")
    public WebElement ClickAddStudent;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Academic Year *')]")
    public WebElement Clickyear;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement click_year2;

    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
    public WebElement ClickClass;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement Select_class;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")
    public WebElement Clicksection;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement Choose_section;
    @FindBy(how = How.NAME, using = "admission_number")
    public WebElement ADDMISSION;
    @FindBy(how = How.ID, using = "roll_number")
    public WebElement rollno;
    @FindBy(how = How.NAME, using = "first_name")
    public WebElement GLOBAL_FIRSTNAME;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Gender *')]")
    public WebElement clickgender;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Male')]")
    public WebElement clickmale;
    @FindBy(how = How.XPATH, using = "//input[@id='startDate']")
    public WebElement GLOBAL_clickdob;
    @FindBy(how = How.NAME, using = "email_address")
    public WebElement GLOBAL_EMAIL;
    @FindBy(how = How.NAME, using = "guardians_email")
    public WebElement GLOBAL_GUARD_EMAIL;
    @FindBy(how = How.NAME, using = "guardians_phone")
    public WebElement GLOBAL_GUARD_phone;
    @FindBy(how = How.XPATH, using = "//button[@id='_submit_btn_admission']")
    public WebElement SAVESTUDENT;
    @FindBy(how = How.NAME, using = "customF[admin]")
    public WebElement ADMIN;


    @FindBy(how = How.LINK_TEXT, using = "STUDENT CATEGORY")
    public WebElement ClickStuCategory;
    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement Global_CategoryName;
    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement CLick_Save_Category;
    @FindBy(how = How.LINK_TEXT, using = "STUDENT GROUP")
    public WebElement CLick_Stu_Group;
    @FindBy(how = How.NAME, using = "group")
    public WebElement GLOBAL_STUDENT_GROUP;
    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement CLICKGROUP;
    //
    @FindBy(how = How.LINK_TEXT, using = "SUBJECTS")
    public WebElement CLick_Subjects;
    @FindBy(how = How.NAME, using = "subject_name")
    public WebElement subjectname;
    @FindBy(how = How.NAME, using = "subject_code")
    public WebElement subjectcode;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Subject']")
    public WebElement SAVESUB;


    //assign subjects
    @FindBy(how = How.LINK_TEXT, using = "ASSIGN SUBJECT")
    public WebElement assignsub;
    @FindBy(how = How.XPATH, using = "//a[@class='primary-btn small fix-gr-bg']")
    public WebElement assignsublink;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Class*']")
    public WebElement clickclass;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Class One']")
    public WebElement classone;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Section *']")
    public WebElement selectsection;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='A4']")
    public WebElement sectiona4;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
    public WebElement search;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Subjects']")
    public WebElement subjectselect;
    @FindBy(how = How.XPATH, using = "//li[@class='option'][normalize-space()='English']")
    public WebElement subjecteng;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Teacher']")
    public WebElement selectteacher;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='John Smith']")
    public WebElement teacherjohn;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
    public WebElement SAVEsubj;

    public void assignsubject(String firstName) throws InterruptedException {
        assignsub.click();
        assignsublink.click();
        clickclass.click();
        classone.click();
        selectsection.click();
        sectiona4.click();
        search.click();
        subjectselect.click();
        subjecteng.click();
        selectteacher.click();
        teacherjohn.click();
        SAVEsubj.click();
        Thread.sleep(500);
    }

//
//    public void enterUsername(String firstName) throws InterruptedException {
//        GLOBAL_CUSTOMER_EMAIL.clear();
//        GLOBAL_CUSTOMER_EMAIL.sendKeys(firstName);
//        Thread.sleep(500);
//    }
//
//    public void enterPasword(String password) throws InterruptedException {
//        GLOBAL_CUSTOMER_PASSWORD.clear();
//        GLOBAL_CUSTOMER_PASSWORD.sendKeys(password);
//        Thread.sleep(500);
//    }
//
//    public void enterloginbutton() {
//        enterloginbutton.click();
//
//    }


    public void click_item() {
        Academiclink.click();

    }

    public void click_section() {
        Sectionlink.click();

    }

    public void entersectionname(String firstName) throws InterruptedException {
        GLOBAL_Section_Name.clear();
        GLOBAL_Section_Name.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void click_sectionbtn() {
        Save_Section.click();

    }

    public void click_Classlink() {
        Classlink.click();

    }

    public void enterSelect_section(String firstName) throws InterruptedException {
        GLOBAL_CLASS_NAME.clear();
        GLOBAL_CLASS_NAME.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void select_sectiona1() {
        Select_section.click();

    }

    public void entersavesection() {
        Save_class.click();

    }

    public void clickstubtn() {
        CLickstudenmeu.click();
        ClickAddStudent.click();
        Clickyear.click();
        click_year2.click();
    }

//    public void selectYear(String sc_year) {
//        Select year = new Select(click_year2);
//        year.selectByValue(sc_year);
//    }


    public void stuyear() {

        ClickClass.click();
        Select_class.click();
        Clicksection.click();
        Choose_section.click();
    }

    public void enterstduname(String firstName) throws InterruptedException {

        ADDMISSION.clear();
        ADDMISSION.sendKeys("88");
        rollno.clear();
        rollno.sendKeys("55");
        GLOBAL_FIRSTNAME.clear();
        GLOBAL_FIRSTNAME.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void clickgender() throws InterruptedException {
        clickgender.click();
        clickmale.click();


    }

    public void enterdob(String firstName) throws InterruptedException {
        GLOBAL_clickdob.clear();
        GLOBAL_clickdob.sendKeys(firstName);
        Thread.sleep(500);
    }


    public void enterEMAIL(String firstName) throws InterruptedException {
        GLOBAL_EMAIL.clear();
        GLOBAL_EMAIL.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void enterGUARDEMAIL(String firstName) throws InterruptedException {
        GLOBAL_GUARD_EMAIL.clear();
        GLOBAL_GUARD_EMAIL.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void enterGUARDphone(String firstName) throws InterruptedException {
        GLOBAL_GUARD_phone.clear();
        GLOBAL_GUARD_phone.sendKeys(firstName);
        Thread.sleep(500);
    }

    public void adminextra(String firstName) throws InterruptedException {
        ADMIN.clear();
        ADMIN.sendKeys("TEST");
        Thread.sleep(500);
    }

    public void clickastubtn2() throws InterruptedException {
        SAVESTUDENT.click();
        //   SAVESTUDENT.click();


    }

    public void subjects(String firstName) throws InterruptedException {
        CLick_Subjects.click();
        subjectname.sendKeys("English");
        subjectcode.sendKeys("111");
        SAVESUB.click();
        Thread.sleep(500);
    }


   /* public void catname(String firstName) throws InterruptedException {
        ClickStuCategory.click();
        Global_CategoryName.clear();
        Global_CategoryName.sendKeys(firstName);
        Thread.sleep(500);
        CLick_Save_Category.click();
        CLick_Stu_Group.click();

        GLOBAL_STUDENT_GROUP.clear();
        GLOBAL_STUDENT_GROUP.sendKeys(firstName);
        Thread.sleep(500);
        CLICKGROUP.click();
    }
*/
}
