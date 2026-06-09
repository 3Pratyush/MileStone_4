package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotattions.AfterMethod;
import org.testng.annotattions.BeforeMethod;
import utilities.ConfigReader;
public class BaseTest {
	protected WebDriver driver;
	ConfigReader config;
	
	@BeforeMethod
	public void setup() {
		config = new ConfigReader();
		driver = DriverFactory.initilizeDriver(config.getProperty("browser"));
		driver.get(config.getProperty("url"));
	}
	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
