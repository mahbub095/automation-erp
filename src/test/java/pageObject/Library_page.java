package pageObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static base.Setup.driver;

public class Library_page {

    public Library_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Faker faker = new Faker();
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "LIBRARY")
    public WebElement LIBRARYMENU;
    @FindBy(how = How.LINK_TEXT, using = "BOOK CATEGORIES")
    public WebElement BOOKCATEGORIRES;
    @FindBy(how = How.NAME, using = "category_name")
    public WebElement CATEGORYNAME;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Category']")
    public WebElement SAVECATEGORY;
    @FindBy(how = How.LINK_TEXT, using = "SUBJECT")
    public WebElement SUBJECT;
    @FindBy(how = How.NAME, using = "subject_name")
    public WebElement SUBJECTNAME;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Category Name']")
    public WebElement CLICKCATEGORY;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Historical Fiction']")
    public WebElement HISTORICALFICTION;
    @FindBy(how = How.NAME, using = "subject_code")
    public WebElement SUBJECTCODE;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Subject']")
    public WebElement SAVEBTN;
    @FindBy(how = How.LINK_TEXT, using = "ADD BOOK")
    public WebElement ADDBOOK;
    @FindBy(how = How.NAME, using = "book_title")
    public WebElement BOOKTITLE;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select Book Category *']")
    public WebElement SELECTCATEGORY;
    @FindBy(how = How.XPATH, using = "//li[normalize-space()='Historical Fiction']")
    public WebElement HISTORICALFICTIONBOOK;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Book']")
    public WebElement SAVEBOOK;

    public void addbookcategories(String firstName) throws InterruptedException {
        //scroll & click menu
        wait.until(ExpectedConditions.elementToBeClickable(LIBRARYMENU));
        jsClick(LIBRARYMENU);
        Thread.sleep(1000);
        BOOKCATEGORIRES.click();
        CATEGORYNAME.sendKeys("Historical Fiction");
        Thread.sleep(500);
        SAVECATEGORY.click();

    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void addsubjects(String firstName) throws InterruptedException {

        SUBJECT.click();
        SUBJECTNAME.sendKeys("A Gentleman in Moscow");
        CLICKCATEGORY.click();
        Thread.sleep(500);
        HISTORICALFICTION.click();
        SUBJECTCODE.sendKeys("123");
        SAVEBTN.click();
    }

    public void addBOOK(String firstName) throws InterruptedException {

        ADDBOOK.click();
        BOOKTITLE.sendKeys("Gentleman in Moscow");
        SELECTCATEGORY.click();
        HISTORICALFICTIONBOOK.click();
        SAVEBOOK.click();


    }
}
