package page_object_model_demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//get URL
				 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				 driver.get("https://propftxdevadmin.iworklab.com/");
				 driver.manage().window().maximize();
				 
				 Login_pagewithPF Loginpg = new Login_pagewithPF(driver);
			     Loginpg.enterEmail("rahul.agarwal@mail.vinove.com");
				 Loginpg.enterPassword("Admin@123");
				 Loginpg.click_login_Btn();
				 //Thread.sleep(3000);
				 
				 Add_newUser obj2 = new Add_newUser(driver);
				 obj2.clickTo_user_management();
				 //Thread.sleep(3000);
				 obj2.clickTo_List();
				// Thread.sleep(3000);
				 //obj2.clickTo_add();
				 obj2.clickTo_Add_user();
				 obj2.clickTo_Name();
				 obj2.enter_name();
				 obj2.clickTo_Name();
				 obj2.clickTo_Address();
				 obj2.enter_Address();
				 obj2.clickTo_PHN();
				 obj2.enter_PHN();
				obj2.clickTo_Country();
				obj2.clickTo_Countryname();		
				obj2.clickTo_state();
				obj2.clickTo_statename();
				obj2.clickTo_city();
				obj2.clickTo_cityname();
				obj2.clickTo_email();
				obj2.clickTo_enable();
				obj2.clickTo_submit();
				Thread.sleep(3000);
				Add_toclub obj3=new Add_toclub(driver);
				obj3.clickTo_clubmembership();
				obj3.clickTo_plans();
				obj3.clickTo_list2();
				obj3.clickTo_addclubplan();
				obj3.clickTo_plan_title();
				obj3.clickTo_validity();
				obj3.clickTo_halfyearly();
				obj3.clickTo_price();
				obj3.clickTo_discount();
				obj3.clickTo_switch_enabled();
				obj3.clickTo_save();
	}

	
	}


