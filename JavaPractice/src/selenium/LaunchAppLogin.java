package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchAppLogin {
	
	static WebDriver d;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\OxygenW2\\JavaPractice\\lib\\chromedriver.exe");
		d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		
		d.get("http://36.255.252.179:9024/");
		
	
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement ele= d.findElement(By.xpath(".//a[text()='Login' and @data-toggle='modal']"));
		
		   new Actions(d).doubleClick(ele).build().perform();
        	ele.click();
        	Thread.sleep(1000);
		
		
		/* try{
			 
			WebElement ele= d.findElement(By.xpath(".//a[text()='Login' and @data-toggle='modal']"));
             

             for(int m=0;m<20;m++){
                      try{
                    	    new Actions(d).doubleClick(ele).build().perform();
                         	ele.click();
                      	//new Actions(driver).doubleClick(webelement).build().perform();
                      	Thread.sleep(1000);
                      	//WebElement webelement1=driver.findElement(By.name(elements[1]));
                                      break;
                      }catch(Exception e){
                    	  System.out.println("ERROR 1 : "+e);
                                       Thread.sleep(1000);
                      }
                      }
     
      }catch(Exception e){
    	  
    	  System.out.println("ERROR 2 : "+e);
                     
                      throw e;
                     
      }*/
		 
		 d.findElement(By.xpath(".//input[@id='lgnbenif']")).click();
		 
		 d.findElement(By.xpath(".//input[@id='lgnssin']")).click();
		 
		 
		// ((JavascriptExecutor)d).executeScript("document.getElementById('login-username').value='210100000069'");
		 d.findElement(By.xpath(".//input[@id='login-username']")).clear();
		 
		 d.findElement(By.xpath(".//input[@id='login-username']")).sendKeys("210100000069");
		 
		 //((JavascriptExecutor)d).executeScript("document.getElementById('login-password').value='01011981'");
		 
		 d.findElement(By.xpath(".//input[@id='login-password']")).clear();
		 
		 d.findElement(By.xpath(".//input[@id='login-password']")).sendKeys("01011981");
		 
		 d.findElement(By.xpath(".//a[@id='btn-login' and @href='#']")).click();
		 
		 
		

	}

}
