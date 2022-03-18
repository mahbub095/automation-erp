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

public class Homework_page extends Setup {


    public Homework_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "HOMEWORK")
    public WebElement HWlink;
    @FindBy(how = How.LINK_TEXT, using = "ADD HOMEWORK")
    public WebElement ADDHOMWORKLINK;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement SELECT_CLASS;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Class One')]")
    public WebElement CLASS_ONE;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement SELECT_SUBJECTS;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement CLICK_ENG;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]")
    public WebElement SELECT_SECTIONS;
    @FindBy(how = How.XPATH, using = "//body/div[5]/ul[1]/li[1]/div[1]")
    public WebElement A4SECTION;
    @FindBy(how = How.NAME, using = "marks")
    public WebElement MARKS;
    @FindBy(how = How.NAME, using = "description")
    public WebElement DESCRIPTION;
    @FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement SAVE_HOMEWORK;


    public void ADDHOMEWORK(String firstName) throws InterruptedException {
        HWlink.click();
        ADDHOMWORKLINK.click();
        SELECT_CLASS.click();
        CLASS_ONE.click();
        SELECT_SUBJECTS.click();
        CLICK_ENG.click();
        SELECT_SECTIONS.click();
        A4SECTION.click();
        MARKS.sendKeys("60");
        DESCRIPTION.sendKeys("TEST");
        SAVE_HOMEWORK.click();

    }
}