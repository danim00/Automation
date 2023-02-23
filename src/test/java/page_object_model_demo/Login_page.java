package page_object_model_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

	WebDriver driver;
	
	Login_page(WebDriver dr)
	{
		driver=dr;
	}
	
	//locate elements
	By username = By.name("loginEmail");
	By password = By.name("password");
	By loginbtn = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/button");
	
	//Find element methods
	
	public void enterEmail(String email)
	{
		driver.findElement(username).sendKeys(email);
		
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void click_login_Btn()
	{
		driver.findElement(loginbtn).click();
	}
	
	
}
