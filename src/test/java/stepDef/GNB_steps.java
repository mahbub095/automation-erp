package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.GNB_page;

import java.util.Iterator;
import java.util.Set;


public class GNB_steps extends Setup {
    GNB_page GNB = new GNB_page(driver);

    @Given("I am at school Home Page")
    public void homePage() {
        Set<String> winIds = driver.getWindowHandles();
        System.out.println("Total windows -> " + winIds.size());
        if (winIds.size() == 2) {
            Iterator<String> iter = winIds.iterator();
            String mainWinID = iter.next();
            String popupWindID = iter.next();
            driver.switchTo().window(popupWindID);
            driver.close();
            driver.switchTo().window(mainWinID);
        }
    }

}