package page_object_model_demo;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Add_newUser {
	
	WebDriver driver;
	
	
	Add_newUser(WebDriver drv)
	{
		driver = drv;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/a/span")
	WebElement User_Management;
	
	public void clickTo_user_management()
	{
		User_Management.click();
		
	}
	

	
	
	
	
	
	
	
	
}
