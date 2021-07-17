package seleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jo/MEGAsync/SeleniumDrivers/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "/Users/jo/MEGAsync/SeleniumDrivers/geckodriver");
        System.out.println("..... Starting .....");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
        driver.findElement(By.name("q")).sendKeys("rocket launch schedule");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.quit();
    }
}
