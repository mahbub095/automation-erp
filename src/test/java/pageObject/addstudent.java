package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addstudent {



    WebDriver driver;
    public void invokeBrowser() {

        try {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\Selenium\\Driver\\94\\chromedriver.exe");
            driver = new ChromeDriver();
            // manage use for browser property
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            getNavigate();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void getNavigate() {

        try {
            driver.navigate().to("http://school.test/login");


            driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
            driver.findElement(By.name("password")).sendKeys("12345678");
            driver.findElement(By.id("btnsubmit")).click();
            driver.findElement(By.xpath("//body/div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Add Student')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Academic Year *')]")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        addstudent myObj = new addstudent();
        myObj.invokeBrowser();
    }



}


