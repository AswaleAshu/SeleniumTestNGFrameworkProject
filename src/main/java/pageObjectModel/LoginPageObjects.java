package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	WebDriver driver;//this driver is null--this don't have scope
	// we will store locators here
	
	//driver.findelement(By.xpath).click

	private By login = By.xpath("//a[text()='Login']");
	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By submitButton = By.xpath("//input[@type='submit']");
	


	public LoginPageObjects(WebDriver driver2) {
		
		this.driver = driver2;
	}
	
	public WebElement clickOnLogin() { 
		  
	     return driver.findElement(login); 
	 }
	public WebElement enterEmail() { 
		  
	     return driver.findElement(email); 
	 }
	 public WebElement enterPassword() { 
	  
	     return driver.findElement(password); 
	 } 
	 public WebElement clickOnSubmitButton() { 
	  
	     return driver.findElement(submitButton); 
	 } 
	 
	
	
	
	
	
}
