package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;


public class DriverSetup {
    public WebDriver driver ;

    @BeforeSuite
    public WebDriver openbrowser(){
        driver = new FirefoxDriver();
        return driver;
//

    }
}

