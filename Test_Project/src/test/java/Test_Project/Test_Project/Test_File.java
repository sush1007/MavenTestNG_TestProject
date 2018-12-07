package Test_Project.Test_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_File {
	WebDriver driver;
	
	@BeforeMethod
	 public void launch_browser() {
		String path= System.getProperty("user.dir")+ "\\src\\main\\java\\web_driver\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path);
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void get_url() {
	
		System.out.print("https://www.seleniumhq.org/");
	}
		
	@Test
		public void print_url() {
		
			driver.get("https://www.seleniumhq.org/");
		
		
	}
	

	  @AfterMethod
	  public void tearDown() {
		//driver.quit();
	   }
	
	
	
}
