package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yasha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'login')]")).sendKeys("hello");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("eno");
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='login-form']/div[1]")));
				
		
		
		
		
		
		
	}

}
