package compatibiltyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {

	public WebDriver driver;

	@BeforeClass
	public void lounchiing() {

		String browser = "chrome";

		switch (browser) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "fireFox":

			driver = new FirefoxDriver();

			break;
		case "edge":

			driver = new EdgeDriver();
			break;

		default:
			break;
		}

		driver.manage().window().maximize();

		driver.get("https://test.dockproductsordercenter.com/");

	}

	@AfterClass
	public void tearDown() {

		driver.close();
	}
}
