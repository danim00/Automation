package page_object_model_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				
				
				//get URL
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 driver.get("https://propftxdevadmin.iworklab.com/");
				 driver.manage().window().maximize();
				 
				 
				 Login_pagewithPF Loginpg = new Login_pagewithPF(driver);
			     Loginpg.enterEmail("rahul.agarwal@mail.vinove.com");
				 Loginpg.enterPassword("Admin@123");
				 Loginpg.click_login_Btn();
				 
			
				 
				 Add_newUser obj2 = new Add_newUser(driver);
				 obj2.clickTo_user_management();
				
			
				 
				
				 

	}

}
