package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login_Test {
	WebDriver driver;
	
  @Test
  public void testLogin() {
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("manz1@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
      driver.manage().window().maximize();
      
 }

}
