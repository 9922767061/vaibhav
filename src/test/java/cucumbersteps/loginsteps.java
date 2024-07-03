package cucumbersteps;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginsteps {
    public WebDriver driver;
    @Given("user navigate to webpage")
    public void userNavigateToWebpage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user login to orangehrm")
    public void userLoginToOrangehrm() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(2000);
    }

    @And("user click on Login Button")
    public void userClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
    }

    @Then("user verify the home page")
    public void userVerifyTheHomePage() throws InterruptedException {
        WebElement lobo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        lobo.isDisplayed();
        Thread.sleep(2000);

    }

    @And("user click on myinfo button")
    public void userClickOnMyinfoButton() {
        try {
            driver.findElement(By.xpath("//span[text()='My Info']")).click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}


