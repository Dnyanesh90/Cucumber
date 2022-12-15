package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterGuruPage {
	WebDriver driver;
	@Given("user is on register home page")
	public void user_is_on_register_home_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadam\\eclipse-workspace2\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://www.demo.guru99.com/test/newtours/register.php");
	   
	}

	@When("user enter valid first name and last name and phone and email and address and city and state and pin code and country")
	public void user_enter_valid_first_name_and_last_name_and_phone_and_email_and_address_and_city_and_state_and_pin_code_and_country() {
	    driver.findElement(By.name("firstName")).sendKeys("DNYANESHWAR");
	    driver.findElement(By.name("lastName")).sendKeys("KADAM");
	    driver.findElement(By.name("phone")).sendKeys("7507847874");
	    driver.findElement(By.name("userName")).sendKeys("kadamdnyana2gmail.com");
	    driver.findElement(By.name("address1")).sendKeys("Atnoor");
	    driver.findElement(By.name("city")).sendKeys("Latur");
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    driver.findElement(By.name("postalCode")).sendKeys("413532");
	    WebElement wb =driver.findElement(By.name("country"));
		Select sel =new Select(wb);
		sel.selectByVisibleText("INDIA");
		WebElement abc =sel.getFirstSelectedOption();
		String a =abc.getText();
		System.out.println(a);
	}
	@When("user enter valid username and password and confirm password")
	public void user_enter_valid_username_and_password_and_confirm_password() {
		driver.findElement(By.name("email")).sendKeys("Dnyanesh90");
		driver.findElement(By.name("password")).sendKeys("Dk@7798913075");
		driver.findElement(By.name("confirmPassword")).sendKeys("Dk@7798913075");
	}
	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	    
	}


}
