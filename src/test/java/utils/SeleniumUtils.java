package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {

	private static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		if (driver == null)
			switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				throw new RuntimeException("");
			}
		return driver;
	}

	public static void clear() {
		if (driver != null) {
			driver.quit();
		}
	}

}
