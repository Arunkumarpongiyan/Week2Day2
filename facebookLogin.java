package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arun");
		//driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		//driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("23568974");
		//driver.findElement(By.name("reg_email__")).sendKeys("7845123695");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("56895623");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		WebElement dropdown = driver.findElement(By.id("day"));
		Select day = new Select(dropdown);
		day.selectByVisibleText("2");
		WebElement listdown = driver.findElement(By.id("month"));
		Select month = new Select(listdown);
		month.selectByValue("4");
		WebElement yearlist = driver.findElement(By.id("year"));
		Select year = new Select(yearlist);
		year.selectByIndex(17);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		//driver.findElement(By.name("sex")).click();
	}

}
