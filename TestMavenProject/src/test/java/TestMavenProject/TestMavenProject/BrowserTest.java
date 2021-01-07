package TestMavenProject.TestMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BrowserTest
{
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin1/Desktop/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement Gsearch= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		a.moveToElement(Gsearch).click().sendKeys("flipkart").sendKeys(Keys.ENTER).perform();
		WebElement FlipkartURL= driver.findElement(By.xpath("//h3/span[text()='Flipkart']"));
		FlipkartURL.click();
	}
}
