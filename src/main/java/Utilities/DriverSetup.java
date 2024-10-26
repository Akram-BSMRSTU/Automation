package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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

    public WebDriver getbrowser(String browser_name){
        if(browser_name.equalsIgnoreCase("Chrome")){
            return new ChromeDriver() ;
        } else if (browser_name.equalsIgnoreCase("Firefox")) {
            return new FirefoxDriver();

        }
        else if (browser_name.equalsIgnoreCase("edge")){
            return new EdgeDriver();
        }
        else {
            throw new RuntimeException("Browser is not Available");
        }

    }
}

