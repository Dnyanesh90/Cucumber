package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbregisterPage {
	WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace2\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    
	}
	@When("enter valid firstname and lastname and mob No and password")
	public void enter_valid_firstname_and_lastname_and_mob_no_and_password() {
	   driver.findElement(By.name("firstname")).sendKeys("PRANIL");
	   driver.findElement(By.name("lastname")).sendKeys("BHARGUDE");
	   driver.findElement(By.name("reg_email__")).sendKeys("Pb@9762349605");
	   driver.findElement(By.name("reg_passwd__")).sendKeys("Pb@9762349605");
	}
	@When("enter Date of birth")
	public void enter_date_of_birth() {
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.name("birthday_month"));
		WebElement year =driver.findElement(By.id("year"));
		
		Select Sel1 =new Select(day);
		Select Sel2 =new Select(month);
		Select Sel3 =new Select(year);
		
		Sel1.selectByValue("5");
		Sel2.selectByValue("Jan");
		Sel3.selectByValue("2000");
		
		WebElement a =Sel1.getFirstSelectedOption();
		WebElement b =Sel2.getFirstSelectedOption();
		WebElement c =Sel3.getFirstSelectedOption();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	    
	}
	@Then("Select on gender button")
	public void select_on_gender_button() {
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}
	@Then("clcik on singup")
	public void clcik_on_singup() {
		driver.findElement(By.name("websubmit")).click();
	    
	}


}
