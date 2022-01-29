package TestNG_Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Project_One {

	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//add category
		WebElement typebox = driver.findElement(By.name("categorydata"));
		WebElement add = driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]"));
		typebox.sendKeys("New_item_MR_chapai");
		add.click();

		

		//check display 
		Boolean display = driver.findElement(By.linkText("New_item_MR_chapai")).isDisplayed();
		if (display == true) {
			System.out.println("The new category is added in list ");
		} else {
			System.out.println("The new category is not fond in lost");
		}

		// or verify items is there ?
//		WebElement actual_text_link = driver.findElement(By.linkText("New_item_MR_chapai"));
//		String expected_text = "New_item_MR_chapai";
//		Assert.assertEquals(actual_text_link, expected_text);

		driver.close();
	}

}
