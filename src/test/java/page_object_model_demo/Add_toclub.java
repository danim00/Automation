package page_object_model_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_toclub {
	
	WebDriver driver;
	Add_toclub (WebDriver drv1)
	{
		driver = drv1;
		PageFactory.initElements(driver, this);
	}
	
	//Locate the elements
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[6]/a")
	WebElement clubmembership;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[6]/ul/div/li[2]/a")
	WebElement plans;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[1]/div[3]/ul/li[6]/ul/div/li[2]/ul/div/li[1]/a")
	WebElement list2;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[2]/div[3]/div/div[1]/div/button")
	WebElement addclubplan;
	
	@FindBy(xpath="//*[@id='planTitle']")
	WebElement plan_title;
	
	@FindBy(xpath="//*[@id='root']/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div[2]/div/div")
	WebElement validity;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div[2]/div/div[2]/div/div[3]")
	WebElement halfyearly;
	
	@FindBy(xpath="//*[@id='price']")
	WebElement price;
	
	@FindBy(xpath="//*[@id='discount']")
	WebElement discount;
	
	@FindBy(xpath="//*[@id='exampleCustomSwitch']")
	WebElement switch_enabled;
	
	@FindBy(css="button[type='submit']")
	WebElement save;
	
	
// Test cases
	
	public void clickTo_clubmembership()
	{
		clubmembership.click();				
	}
	public void clickTo_plans()
	{
		plans.click();				
	}
	public void clickTo_list2()
	{
		list2.click();				
	}
	public void clickTo_addclubplan()
	{
		addclubplan.click();				
	}
	public void clickTo_plan_title()
	{
		plan_title.sendKeys("Ultasupereme");				
	}
	public void clickTo_validity()
	{
		validity.click();				
	}
	public void clickTo_halfyearly()
	{
		halfyearly.click();				
	}
	public void clickTo_price()
	{
		price.sendKeys("200000");				
	}
	public void clickTo_discount()
	{
		discount.sendKeys("3000");				
	}
	public void clickTo_switch_enabled()
	{
		switch_enabled.click();				
	}
	public void clickTo_save()
	{
		save.click();				
	}
	


}
