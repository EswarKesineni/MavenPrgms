package sample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class GroupsTest {
	WebDriver driver;
  @Test(groups = "Flowers")
  public void Flowers() {
	  System.out.println("Rose");
  }
  @Test(groups = "Flowers")
  public void Colors() {
	  System.out.println("Pink");
  }
  @Test(groups = "Sunflower")
  public void Sunflower() {
	  System.out.println("Yellow");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
