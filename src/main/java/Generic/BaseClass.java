package Generic;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;

	@Parameters("BROWSER")
	@BeforeClass()
	public void launchBrowser(String BROWSER) throws Throwable {

	//	String BROWSER = "chrome";
		URL url = new URL("http://192.168.68.76:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		if (BROWSER.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		} else {
			System.out.println("invalid browser");
		}
		driver = new RemoteWebDriver(url, cap);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
