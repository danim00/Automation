package page_object_model_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_withoutPOM {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Launch Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		//get URL
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://propftxdevadmin.iworklab.com/");
		 driver.manage().window().maximize();
		
		//find & enter username
		driver.findElement(By.name("loginEmail")).sendKeys("rahul.agarwal@mail.vinove.com");
		

		//find & enter password
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		

		//find & click to login button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/button")).click();
		
		

	}

}
