package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbcreatemultiple {
	WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace2\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    
	}

	@When("user enter valid {string} and {string} and {string} and {string}")
	public void user_enter_valid_and_and_and(String fname, String lname, String emailid, String pass) {
	    driver.findElement(By.name("firstname")).sendKeys(fname);
	    driver.findElement(By.name("lastname")).sendKeys(lname);
	    driver.findElement(By.name("reg_email__")).sendKeys(emailid);
	    driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
	}
	@Then("user is on Homepage")
	public void user_is_on_homepage() {
	  driver.quit();
	}
}
