package Pages;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends DriverSetup {


    public WebElement getelement(By locator){
        return driver.findElement(locator);
    }

}
