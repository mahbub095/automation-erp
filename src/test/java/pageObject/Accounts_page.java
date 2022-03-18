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

public class Accounts_page extends Setup {


    public Accounts_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

    @FindBy(how = How.LINK_TEXT, using = "ACCOUNTS")
    public WebElement Acclink;
    @FindBy(how = How.LINK_TEXT, using = "CHART OF ACCOUNT")
    public WebElement ChartACC;
    @FindBy(how = How.NAME, using = "head")
    public WebElement Headinput;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Type *']")
    public WebElement clicktype;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Income')]")
    public WebElement clickincome;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Save Head']")
    public WebElement clicksavehead;

    public void clickaccmenu() {
        Acclink.click();
        ChartACC.click();

    }


    public void enterheadname(String firstName) throws InterruptedException {
        Headinput.clear();
        Headinput.sendKeys("Fees collection new");
        Thread.sleep(500);
    }

    public void clicktype() {
        clicktype.click();
        clickincome.click();
        clicksavehead.click();

    }
}