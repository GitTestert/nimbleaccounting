package Practice.CICDTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.gmail.com/");
	}

}
