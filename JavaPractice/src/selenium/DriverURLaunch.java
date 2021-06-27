package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverURLaunch {
	
	static int b;

	public static void main(String[] args) {
		
		
		b=10+b;
		System.out.println(b);
		System.setProperty("webdriver.chrome.driver", "E:\\OxygenW2\\JavaPractice\\lib\\chromedriver.exe");
		
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://google.com");
		
		d.findElement(By.xpath(".//*[contains(text(),'Gmail')]")).click();
		
		d.get("http://amazon.com");
		
		d.findElement(By.xpath(".//*[contains(text(),'Deals')]")).click();

		
		

	}

}
