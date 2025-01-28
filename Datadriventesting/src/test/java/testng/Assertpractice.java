package testng;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertpractice {
	@Test
	public void homePageTest(Method mtd) {
		System.out.println(mtd.getName()+ "TestStart");
		String expectTitle = "Homepage";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	String actTitle =	driver.findElement(By.xpath("//a[contains(.,'Home')]")).getText();
	Assert.assertEquals(actTitle,expectTitle);
	driver.close();
	System.out.println(mtd.getName()+ "TestEnd");
	}
	@Test
	public void logoVerify(Method mtd) {
		System.out.println(mtd.getName()+ "TestStart");
		//String expectTitle = "Homepage";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	boolean status =	driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']")).isDisplayed();
	//Assert.assertEquals(status, true);
	Assert.assertTrue(status);
	driver.close();
	System.out.println(mtd.getName()+ "TestEnd");
	}

}
