import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumFirefox 

{
	public static void mouseover()
	{
		/* Actions action = new Actions(webdriver);
WebElement we = webdriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();
 Actions builder = new Actions(driver);
builder.moveToElement(hoverElement).perform();
builder.moveToElement(clickElement).click().perform();
*/
		//orders
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver;
		webdriver=new ChromeDriver();
		//webdriver.get("https://www.amazon.com/");
		webdriver.get("https://www.salesforce.com/");
		webdriver.manage().window().maximize();
		Actions action=new Actions(webdriver);
		//WebElement menu=webdriver.findElement(By.xpath("(//a[@id='nav-cart'])[1]"));
		WebElement menu=webdriver.findElement(By.xpath("(//span[@class='dropdown-toggle.disabled'])"));
		//WebElement menu=webdriver.findElement(By.cssSelector("img[class='img-responsive']"));
		menu.click();
				action.moveToElement(menu).build().perform();
		
		//Actions action=new Actions(webdriver);
		//action.moveToElement(menu).click().perform();
		//action.moveToElement(menu).perform();
		//menu.click();
		//WebElement menu1=webdriver.findElement(By.className("login h4 text-cirrus text-left salesforce-sans-regular"));
		//action.moveToElement(menu1).click().perform();
	}
	public static void salesforecelLogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();  // it will launch the chrome driver 

	    driver.get("https://login.salesforce.com//");
		//webdriver.get("https://www.salesforce.com//");
	    WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("abc 2gmail.com");
	    WebElement password=driver.findElement(By.id("password"));
	    password.sendKeys("hello");
	     WebElement login=driver.findElement(By.id("Login"));
		 login.click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		salesforecelLogin();
		
		mouseover();
	    
		Thread.sleep(5000); 
		
   System.out.println("done properly");
	}
	

}
//button r4 wide primary
//login-menu-text
//class=dropdown-toggle disabled