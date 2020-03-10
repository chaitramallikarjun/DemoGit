package AutoIt.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHangleUsingURL {
	
	 public static void main( String[] args )
	 {
		

	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/");
	
	//driver.get("http://admin:admin@the-internet.herokuapp.com/");
	//driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		 
	 }

}
