package org.vapasi;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod() throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/shrutigupta/IdeaProjects/FirstMavenProject/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Running Before Method");
        this.screenShot(driver, "/Users/shrutigupta/test.png");

    }

    @AfterMethod
    public void close()
    {
        driver.quit();
    }


    public void screenShot(WebDriver driver, String fileWithPath) throws IOException {
        TakesScreenshot scrshot = ((TakesScreenshot) driver);
        File scrFile = scrshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File(fileWithPath);
        FileHandler.copy(scrFile, destFile);


    }

}
