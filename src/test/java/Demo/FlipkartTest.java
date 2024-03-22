package Demo;


import org.testng.annotations.Test;

import Generic.BaseClass;

public class FlipkartTest extends BaseClass{

	@Test
	public void launchFlipkart(){
		driver.get("https://www.flipkart.com/");
	}
}
