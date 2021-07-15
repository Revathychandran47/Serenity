package Landing_welcome_positive_scenarios;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Landing_welcome_positive_scenarios extends Generic_function {
	static boolean value;
    static int s;
	
	/*Browser opens and enter URL*/
	@Given("launch the URL")
	public static void browser_launching() throws IOException, InterruptedException {
		Browser_Launch();
		s= Dataiter();		
	}
	
	/*TC_001 Verify that user is navigated to the Welcome page */
	@When("navigation to Welcome page")
	public static void landing_welcome_positive_tc_001() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Landing_welcome_positive_tc_001");
		}
	}
	
	/*TC_002 Validate that the  user is able to click on 'Login' button and navigated to login page*/
	@When("clicks on the 'Login' button")
	public static void click_login() throws IOException {
		try {
			click("welcome_login");
			
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_login");
		}
	}
	@Then("navigate to Login page")
	public void landing_welcome_positive_tc_002() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader( "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Landing_welcome_positive_tc_002");
		}
		
	}

	/*TC_003 Validate that the user is able to click on 'Sign Up' button and navigate to 'Sign Up' page*/
	@When("clicks on  'Sign Up' button")
	public static void click_sign_up() throws IOException {
		try {
			driver.navigate().to(getURL());
			click("welcome_signup");
			
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_sign_up");
		}
	}
	@Then("navigate to Sign up page")
	public void landing_welcome_positive_tc_003() throws Exception {
		try {
			browser_wait(1500);
			value = driver.findElement(By.xpath(OR_reader( "signup_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("landing positive");

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Landing_welcome_positive_tc_003");
		}
		browser_close();
	}

}
