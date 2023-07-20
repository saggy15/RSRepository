package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
  @Test
  public void ftest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
	  Thread.sleep(3000);
  }
}
