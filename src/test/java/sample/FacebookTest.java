package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookTest {
  WebDriver driver;
  @BeforeTest
  public void Browser() {
	  System.setProperty("webdriver.chrome.driver","G://Selinium Softwares//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void Login() {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kesinenieswar11@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Honey@1990");
	  driver.findElement(By.xpath("//input[@id='u_0_3']")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
