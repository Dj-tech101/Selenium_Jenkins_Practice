package compatibiltyTest;

import org.testng.annotations.Test;

public class runner extends base{

	
	
	@Test
	public void run() {
		
		System.out.println("The final title is");
		System.out.println(driver.getTitle());
	}
}
