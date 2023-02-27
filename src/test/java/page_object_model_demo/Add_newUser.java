package page_object_model_demo;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_newUser {
	
	WebDriver driver;
	Add_newUser(WebDriver drv)
	{
		driver = drv;
		PageFactory.initElements(driver, this);
	}

	//Locate the elements
	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/a/span")
	WebElement User_Management;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/ul/div/li[1]/a")
	WebElement List;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/ul/div/li[2]/a")
	WebElement add;
	
	@FindBy(xpath="//*[@id='dashboard-analytics']/div/div/div/div[1]/div[3]/div/button")
	WebElement Add_user;

	@FindBy(xpath="//*[@id='name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id='address']")
	WebElement Address;
	
	@FindBy(xpath="//*[@id='phoneNumber']")
	WebElement PHN;
	
	@FindBy(xpath="//*[@id='dashboard-analytics']/form/div[2]/div/fieldset/div[5]/div[2]/div/div")
	WebElement Country;
	
	@FindBy(xpath="//div[@id='react-select-2-option-100']")
	WebElement Countryname;
	
	@FindBy(xpath="//*[@id='dashboard-analytics']/form/div[2]/div/fieldset/div[6]/div[2]/div/div")
	WebElement state;
	
	@FindBy(xpath="//div[@id='react-select-3-option-33']")
	WebElement statename;
	
	@FindBy(xpath="//*[@id='dashboard-analytics']/form/div[2]/div/fieldset/div[7]/div[2]/div/div")
	WebElement city;
	
	@FindBy(xpath="//div[@id='react-select-4-option-4']")
	WebElement cityname;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='exampleCustomSwitch']")
	WebElement enable;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	//Test Cases
	public void clickTo_user_management()
	{
		User_Management.click();		
	}
	public void clickTo_List()
	{
		List.click();		
	}
	 public void clickTo_Add_user()
	{
		Add_user.click();		
	}
	
	public  void clickTo_Name()
	{
		Name.click();		
	}
	public  String enter_name()
	{
		Name.sendKeys("Naresh");
		return toString();
	}
	public void  clickTo_Address()
	{
		Address.click();
	}
	public  String enter_Address()
	{
		Address.sendKeys("5A-5B fusion square, Noida sec 126");
		return toString();
	}
	public void clickTo_PHN()
	{
		PHN.click();		
	}
	public String enter_PHN()
	{
		PHN.sendKeys("7894563212");
		return toString();		
	}
	public void clickTo_Country()
	{
		Country.click();				
	}
	public void clickTo_Countryname()
	{
		Countryname.click();				
	}
	public void clickTo_state()
	{
		state.click();				
	}
	public void clickTo_statename()
	{
		statename.click();				
	}
	public void clickTo_city()
	{
		city.click();				
	}
	public void clickTo_cityname()
	{
		cityname.click();				
	}
	public void clickTo_email()
	{
		email.sendKeys("naresh@yopmail.com");				
	}
	public void clickTo_enable()
	{
		enable.click();				
	}
	public void clickTo_submit()
	{
		submit.click();				
	}
	
}
