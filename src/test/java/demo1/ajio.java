package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ajio {
  @Test
  public void ajiotest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	 // Assert.fail();
	  driver.close();
	  Thread.sleep(5000);
	  System.out.println("this is ajio website");
  }
}
