package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.RegistrationPageObjects;
import resources.baseClass;

public class VerifyLoginTestCases extends baseClass {

	@Test
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver); 
 		rpo.clickOnMyAccount().click(); 
  
 		LoginPageObjects lpo = new LoginPageObjects(driver); 
  
 		lpo.clickOnLogin().click(); 
	
		lpo.enterEmail().sendKeys(email);
		lpo.enterPassword().sendKeys("secure");
		lpo.clickOnSubmitButton().click();
		
		SoftAssert sa = new SoftAssert();
		
		String actual = driver.findElement(By.xpath("//h2[text() = 'My Account']")).getText();
				
		String expected = "My Account";
		
		sa.assertEquals(actual, expected);
		
		sa.assertAll();
		
	}
	
	@Test
	public void verifyLoginithInValidData() throws IOException, InterruptedException { 
		  
		  
 		RegistrationPageObjects rpo = new RegistrationPageObjects(driver); 
 		rpo.clickOnMyAccount().click(); 
  
 		LoginPageObjects lpo = new LoginPageObjects(driver); 
  
 		lpo.clickOnLogin().click(); 
  
 		lpo.enterEmail().sendKeys(email); 
 		Thread.sleep(4000); 
 		lpo.enterPassword().sendKeys("securehhhh"); 
 		lpo.clickOnSubmitButton().click(); 
  
 		SoftAssert sa = new SoftAssert(); 
  
 		String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText(); 
 		String expected = "Warning: No match for E-Mail Address and/or Password."; 
 		sa.assertEquals(actual, expected); 
 		sa.assertAll(); 
  
 	} 
	
	
}
