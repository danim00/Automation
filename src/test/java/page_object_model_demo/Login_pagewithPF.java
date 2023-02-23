package page_object_model_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_pagewithPF {
	
WebDriver driver;
	
	Login_pagewithPF(WebDriver dr)
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="loginEmail")
	WebElement enteremail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div/div/div/div/div/div[2]/div/form/button")
	WebElement click_login_Btn;
	
	public void enterEmail(String email)
	{
		enteremail.sendKeys("rahul.agarwal@mail.vinove.com");
		
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys("Admin@123");
	}
	
	public void click_login_Btn()
	{
		click_login_Btn.click();
	}
	
	
}
