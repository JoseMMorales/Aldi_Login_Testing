package Login_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC4_InvUser_ValPass {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/......./chromedriver");
    //Launch Chrome and maximise
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.aldi.co.uk/");
    
    //Wait until homepage is charged and click log in
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in / Register")));
    login.click();
    
    //Wait until log in page is charged, enter username and password
    WebDriverWait wait1 = new WebDriverWait(driver, 10);
    WebElement username = wait1.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
    username.sendKeys("xxxxxxxxxxx@gmail.com");
    
    WebElement password = driver.findElement(By.id("j_password"));
    password.sendKeys("Testing1989@");
    
    //Click Sign button
    WebElement sign = driver.findElement(By.xpath("//*[@id=\"returningCustomerForm\"]/div[4]/button"));
    sign.click();
    
    //Close Browser
    driver.quit();			
  }
}
