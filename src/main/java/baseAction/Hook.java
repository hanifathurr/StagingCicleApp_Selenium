package baseAction;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hook {

    public static WebDriver driver = new FirefoxDriver();
    //Login variable
    public static String signIn = "https://staging.cicle.app/signin";
    public static String emailAccount = "akuntest.hanif";
    public static String passwordEmail = "@Testing123";
    public static String googleAccount = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]";
    public static String emailField = "identifierId";
    public static String berikutnyaButton = "//*[@id=\"identifierNext\"]/div/button/span";
    public static String passwordField = "//*[@id=\"password\"]/div[1]/div/div[1]/input";
    public static String berikutnyaPasswordButton = "//*[@id=\"passwordNext\"]/div/button/span";
    public static String LandingPage = "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/62e39455661629ab10799c76";

    @Before
    public void initDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Login Step Details
        driver.get(signIn);
        driver.findElement(By.xpath(googleAccount)).click();
        driver.findElement(By.id(emailField)).sendKeys(emailAccount);
        driver.findElement(By.xpath(berikutnyaButton)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordField)));
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordEmail);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath(berikutnyaPasswordButton)).click();
//        driver.navigate().to(LandingPage); g perlu ini untuk url,
//        bisa taruh di bagian Given untuk menunjukan kondisi sedang berada di..
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

}


