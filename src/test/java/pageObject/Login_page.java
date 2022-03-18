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

public class Login_page extends Setup {
    // Login_page login = new Login_page(driver);
    public Login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
    // Elements

    @FindBy(how = How.NAME, using = "email")
    public WebElement GLOBAL_CUSTOMER_EMAIL;
    @FindBy(how = How.NAME, using = "password")
    public WebElement GLOBAL_CUSTOMER_PASSWORD;
    @FindBy(how = How.ID, using = "btnsubmit")
    public WebElement GLOBAL_LOGIN_BUTTON;

    //demo
//    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Super admin')]")
//    public WebElement GLOBAL_LOGIN_BUTTON;

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
}
