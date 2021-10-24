package think.Bridges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quetion2 {

    WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
    	WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @Test
	public  void travelWebsites() {
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.findElement(By.xpath("//input[@type='search']"));


		driver.findElement(By.id("name")).sendKeys("Ravindra");
		driver.findElement(By.id("orgName")).sendKeys("Ravindra chavan");
		driver.findElement(By.id("singUpEmail")).sendKeys("ravindra.chavan4117@gmail.com");
		WebElement checkbox=driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]"));
		Assert.assertTrue(checkbox.isEnabled());
		checkbox.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
    @AfterMethod
    public void closeBrowser() {
    	driver.close();
    }
	
	
}


