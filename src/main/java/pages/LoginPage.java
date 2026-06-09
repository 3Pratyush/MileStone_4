package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	webDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		pageFactory.initElement(driver,this);
	}
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginBtn;
	@FindBy(id="//h3")
	WebElement errorMessage;
	
	public void login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
}
