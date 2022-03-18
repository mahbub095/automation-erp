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

public class Admin_Setup_Page extends Setup {

    public Admin_Setup_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "ADMIN SECTION")
    public WebElement Adminbtn;
    @FindBy(how = How.LINK_TEXT, using = "ADMIN SETUP")
    public WebElement AdminSetup;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Type *']")
    public WebElement clicktype;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Purpose')]")
    public WebElement clickpurpose;
    @FindBy(how = How.NAME, using = "name")
    public WebElement purposename;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Setup']")
    public WebElement SAVEbtn;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Reference')]")
    public WebElement clickreference;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Source')]")
    public WebElement clicksource;


    @FindBy(how = How.LINK_TEXT, using = "ADMISSION QUERY")
    public WebElement clickaddmission;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
    public WebElement clickadd;


    @FindBy(how = How.NAME, using = "phone")
    public WebElement phonetext;
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailtext;

    @FindBy(how = How.NAME, using = "assigned")
    public WebElement assignedtext;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Reference *']")
    public WebElement clickreferencetab;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Newspaper']")
    public WebElement clicknewspaper;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Source *']")
    public WebElement clicksourcetab;
    @FindBy(how = How.XPATH, using = "//div[@class='nice-select niceSelect w-100 bb open']//li[@class='option'][normalize-space()='Internet']")
    public WebElement clickinternet;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Class *']")
    public WebElement clickclasstab;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Class One']")
    public WebElement clickone;

    @FindBy(how = How.NAME, using = "no_of_child")
    public WebElement noofchild;
    @FindBy(how = How.ID, using = "save_button_query")
    public WebElement Savequery;


    //COMPLAINT menu
    //setup complaint

    //clicktype name save
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Complaint Type')]")
    public WebElement complainttype;

    @FindBy(how = How.LINK_TEXT, using = "COMPLAINT")
    public WebElement complaintmenu;
    @FindBy(how = How.NAME, using = "complaint_by")
    public WebElement complaintby;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Complaint Type *']")
    public WebElement complaintTYPE;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Sexual Assault']")
    public WebElement complaintTEST;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Complaint Source *']")
    public WebElement clickcomplaintsource;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Internet')]")
    public WebElement clickcomplaintinternet;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Complaint']")
    public WebElement SavecomplaintBTN;

    //Postal Receive
    @FindBy(how = How.LINK_TEXT, using = "POSTAL RECEIVE")
    public WebElement clickpostalrec;
    @FindBy(how = How.NAME, using = "from_title")
    public WebElement from_title;
    @FindBy(how = How.NAME, using = "reference_no")
    public WebElement reference_name;
    @FindBy(how = How.NAME, using = "address")
    public WebElement address_name;
    @FindBy(how = How.NAME, using = "to_title")
    public WebElement title_name;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Postal Receive']")
    public WebElement SavePostal;

    //Postal Dispatch
    @FindBy(how = How.LINK_TEXT, using = "POSTAL DISPATCH")
    public WebElement clickpostaldis;
    @FindBy(how = How.NAME, using = "to_title")
    public WebElement TO_title;
    @FindBy(how = How.NAME, using = "reference_no")
    public WebElement TO_reference_name;
    @FindBy(how = How.NAME, using = "address")
    public WebElement TO_address_name;
    @FindBy(how = How.NAME, using = "note")
    public WebElement TO_NOTE;
    @FindBy(how = How.NAME, using = "from_title")
    public WebElement FROMTITLE;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Postal Dispatch']")
    public WebElement SavePostaldIS;

    public void adminsectionbtn() {
        Adminbtn.click();
    }

    public void adminsetupbtn() {
        AdminSetup.click();
        clicktype.click();
        clickpurpose.click();

    }

    public void purposetype(String firstName) throws InterruptedException {

        purposename.sendKeys("purposetest");
        Thread.sleep(500);
        SAVEbtn.click();
    }

    public void referncetype(String firstName) throws InterruptedException {

        clicktype.click();
        clickreference.click();
        purposename.sendKeys("Newspaper");
        Thread.sleep(500);
        SAVEbtn.click();


    }

    public void sourcetype(String firstName) throws InterruptedException {

        clicktype.click();
        clicksource.click();
        purposename.sendKeys("Internet");
        Thread.sleep(500);
        SAVEbtn.click();
    }

    public void complinttype(String firstName) throws InterruptedException {

        clicktype.click();
        complainttype.click();
        purposename.sendKeys("Sexual Assault");
        Thread.sleep(500);
        SAVEbtn.click();
    }

    // admission query
    public void addquery(String firstName) throws InterruptedException {

        clickaddmission.click();
        clickadd.click();
        purposename.sendKeys("Addmission query test");
        Thread.sleep(500);
        phonetext.sendKeys("0112344");
        emailtext.sendKeys("admin@gmail.com");
        assignedtext.sendKeys("John");
        clickreferencetab.click();
        clicknewspaper.click();
        clicksourcetab.click();
        clickinternet.click();
        clickclasstab.click();
        clickone.click();
        noofchild.sendKeys("2");
        Savequery.click();

    }


    // compainted  query
    public void addcompainted(String firstName) throws InterruptedException {

        complaintmenu.click();
        complaintby.sendKeys("John");
        complaintTYPE.click();
        complaintTEST.click();
        clickcomplaintsource.click();
        clickcomplaintinternet.click();
        SavecomplaintBTN.click();
    }

    // postal  query
    public void addpostal(String firstName) throws InterruptedException {

        clickpostalrec.click();
        from_title.sendKeys("Alan");
        reference_name.sendKeys("John");
        address_name.sendKeys("USA");
        title_name.sendKeys("Test");
        SavePostal.click();

    }  // postal  query

    public void addpostalDIS(String firstName) throws InterruptedException {

        clickpostaldis.click();
        TO_title.sendKeys("Dan");
        TO_reference_name.sendKeys("John");
        TO_address_name.sendKeys("USA");
        TO_NOTE.sendKeys("Test");
        FROMTITLE.sendKeys("Test");
        SavePostaldIS.click();

    }
}