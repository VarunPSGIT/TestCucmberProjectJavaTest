package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	private static WebDriver driver;
	
	@Before
	public void LaunchBrowser() {
		System.out.println("Launch Browser!!");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://twhyderabad.github.io/demo_site/"); //Test Link
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser() {
		System.out.println("Kill Browser!!");
		if (driver!=null) {
			driver.quit();
		}		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
//	@BeforeStep
//	public void BeforeStep() {
//		System.out.println(">>Before Step");
//	}
//	
//	@AfterStep
//	public void AfterStep() {
//		System.out.println(">>Afetr Step");
//	}
//	
	
//	
//	@Before("@setup")
//	public void setupDB() {
//		System.out.println("Datebase Setup completed");
//	}
//	
//	@Before("@rollbacksetup")
//	public void rollbacksetup() {
//		System.out.println("Datebase rollbacksetup Setup completed");
//	}
	
}
