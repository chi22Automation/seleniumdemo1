package TestNgAnnotation;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class SeleniumDemo {





	//static WebDriver driver;

	
    @Test (timeOut=15000 )
	public void findSelenium() throws InterruptedException {

	WebDriverManager.chromedriver().setup();

	ChromeOptions optn= new ChromeOptions();
	optn.addArguments("--disable-notifications");
	//System.setProperty("webdriver.chrome.driver","/Users/sow/Downloads/chromedriver");

	WebDriver  driver = new ChromeDriver();  // it will launch the chrome driver 

  driver.get("https://www.google.com/");

   driver.findElement(By.name("q")).sendKeys("selenium"+"\n");

        	
   // driver.findElement(By.className("gNOO89b")).click();

         
	// String url ="https://www.walmart.com/" ;//https://www.google.com/";
    // driver.get(url);
   // WebElement textbox= driver.findElement(By.xpath//input[@title='Search']//input[@title='Search']//input[@title='Search'])); //("//input[@name='q']"));
             // textbox.sendKeys("milk");//("selenium");
              WebElement searhcbtn= driver.findElement(By.xpath("//input[@title='Search']"));//("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
            //input[@title='Search']
              searhcbtn.click();
              List<WebElement> li = driver.findElements(By.partialLinkText("selenium"));;
              li.get(1).click();  
         Thread.sleep(5000); // pause the code for 5 sec

         driver.quit(); // close the browser       

	}



}