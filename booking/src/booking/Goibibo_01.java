package booking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo_01 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/bus/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                          
		   
		//BUS
		 driver.findElement(By.xpath("//input[@id=\"autosuggestBusSRPSrcHome\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//span[normalize-space()=\"Hyderabad, Telangana\"]")).click();
		 
		 driver.findElement(By.xpath("//input[@id=\"autosuggestBusSRPDestHome\"]")).sendKeys("Vijayawada");
		 driver.findElement(By.xpath("//div[@id=\"downshift-2-item-0\"]//li")).click();
		 
		// Select date listbox
		 driver.findElement(By.xpath("//input[@placeholder=\"Pick a date\"]")).sendKeys("Nov 28, 2023");
		 driver.findElement(By.xpath("//span[normalize-space()=\"Today, Tue 28 Nov\"]")).click();
		 
		 //Select search button
		 driver.findElement(By.xpath("//button[normalize-space()=\"Search Bus\"]")).click();
		 
		 driver.quit();
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		  

	}

}
