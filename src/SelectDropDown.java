import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\Chromedriver_98.0.478.80.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");

		driver.manage().window().maximize();

		/*select value from drop downlist = company size */
		WebElement dropdown = driver.findElement(By.name("employees_c"));

		Select select = new Select(dropdown);

		/*select by index*/
		select.selectByIndex(2);
		Thread.sleep(2000);


	  /*select by value*/
		select.selectByValue("level10");
		Thread.sleep(2000);

    /*close popup*/
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();

		driver.close();
	}

}
