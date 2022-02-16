import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FindproductShopee {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\Chromedriver_98.0.478.80.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://shopee.vn/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='shopee-searchbar-input__input']"));
		
		//give a little bit time to find the searchbox
		Thread.sleep(3000);
		
		searchbox.sendKeys("Apple iPhone 13");
		
		WebElement inputbutton = driver.findElement(By.xpath("//button[@type='button']"));
		
		inputbutton.click();
		
		Thread.sleep(3000);
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("img"));
	    
		System.out.println("Total result is " + links.size());
	      
	    for (int i = 1; i<=links.size(); i = i+1) {
	         
	    System.out.println("Name of Link " + i + links.get(i).getAttribute("src"));
		
	    driver.close();
	}
	}
}
