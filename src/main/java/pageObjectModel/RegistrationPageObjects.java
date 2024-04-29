package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {

	WebDriver driver;//this driver is null--this don't have scope
	// we will store locators here
	
	//driver.findelement(By.xpath).click

	private By myAccount = By.xpath("//a[@title='My Account']");
	private By Register = By.xpath("//a[text()='Register']");
	private By firstName = By.xpath("//input[@name='firstname']");
	private By lastName = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmPassword = By.xpath("//input[@name='confirm']");
	private By checkbox = By.xpath("//input[@type='checkbox']");
	private By submit = By.xpath("//input[@type='submit']");

	//created the constructor
	public RegistrationPageObjects(WebDriver driver2) {
		
		this.driver=driver2; //we gave the scope here
	}

	public WebElement clickOnMyAccount() { 
		  
	     return driver.findElement(myAccount); 
	 }
	
	 public WebElement clickOnRegister() { 
	  
	     return driver.findElement(Register); 
	 } 
	 public WebElement enterFirstName() { 
	  
	     return driver.findElement(firstName); 
	 } 
	 public WebElement enterLastName() { 
	  
	     return driver.findElement(lastName); 
	 } 
	 public WebElement enterEmail() { 
	  
	     return driver.findElement(email); 
	 } 
	 public WebElement enterTelephone() { 
	  
	     return driver.findElement(telephone); 
	 } 
	 public WebElement enterPassword() { 
	  
	     return driver.findElement(password); 
	 } 
	 public WebElement enterConfirmPassword() { 
	  
	     return driver.findElement(confirmPassword); 
	 } 
	 public WebElement clickOnCheckBox() { 
	  
	     return driver.findElement(checkbox); 
	 } 
	 public WebElement clickOnContinue() { 
	  
	     return driver.findElement(submit); 
	 }
	
	
	
	
	
}
