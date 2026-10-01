package SalesforceTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Error_Message_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://orgfarm-534878b29f-dev-ed.develop.my.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp%3Fsource%3Dlex");
		Driver.findElement(By.name("username")).sendKeys("shilpaaswath.cba811739bcb@agentforce.com");
		Driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
		Driver.findElement(By.id("password")).clear();
		Driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
		
		//By.xpath("(//div[@id='error'])"
		WebElement message = Driver.findElement(By.id("error"));
		String errormessage = message.getText();

		System.out.println("The errormessage is " +errormessage);
		Driver.close();
		
		
	}

}
