package stepDefinations;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class StepDefination {

	WebDriver driver;	
	
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/register");
	   
	}
	@When("User enters {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and(String string1, String string2, String string3, String string4, String string5) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(string1);
	    driver.findElement(By.xpath("//input[@id='company']")).sendKeys(string2);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string3);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string4);
	    driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys(string5);
	    
	    
	}
	@When("Click on Register button")
	public void click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	@Then("User is able to register and a sucess message should display")
	public void user_is_able_to_register_and_a_sucess_message_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
