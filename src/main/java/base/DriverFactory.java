package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static WebDriver driver;
	public static WebDriver initilizeDriver(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = new ChromeDriver();
		}
		
				driver.manage().window().maximize();
				return driver;
		}
		public static WebDriver getDriver() {
			return driver;
		}
		
		public static void quitDriver() {
			
			if(driver != null) {
				driver.quit();
			}
		}
	}


