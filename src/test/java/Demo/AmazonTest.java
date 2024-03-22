package Demo;

import org.testng.annotations.Test;

import Generic.BaseClass;

public class AmazonTest extends BaseClass {

	@Test
	public void launchAmazon() {
		driver.get("https://www.amazon.in/");
	}
}
