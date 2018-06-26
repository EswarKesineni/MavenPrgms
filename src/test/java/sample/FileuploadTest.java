package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileuploadTest {
	WebDriver driver;
  @Test
  public void Fileupload() throws Exception {
	 driver.findElement(By.xpath("//span[@class='ui-button-text'][contains(text(),'Upload Files')]")).click();
	 Runtime.getRuntime().exec("G:\\SciTE Scripts\\Fileupload.exe");	 
  }
  @BeforeTest
  public void Browser() {
	  System.setProperty("webdriver.chrome.driver","G:\\Selinium Softwares\\chromedriver1.exe");
	  driver = new ChromeDriver();
	  driver.get("https://pdf2doc.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
