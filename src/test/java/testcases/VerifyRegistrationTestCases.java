package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.RegistrationPageObjects;
import resources.baseClass;

public class VerifyRegistrationTestCases extends baseClass{
	
	@Test
	public void verifyRegistrationWithValidData() throws IOException {
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		
		rpo.clickOnMyAccount().click();
		rpo.clickOnRegister().click();
		rpo.enterFirstName().sendKeys("test");
		rpo.enterLastName().sendKeys("test");
		rpo.enterEmail().sendKeys(email);
		rpo.enterTelephone().sendKeys("8456780090");
		rpo.enterPassword().sendKeys("secure");
		rpo.enterConfirmPassword().sendKeys("secure");
		rpo.clickOnCheckBox().click();
		rpo.clickOnContinue().click();
		
		SoftAssert sa = new SoftAssert();
		
		String actual = driver.findElement(By.xpath("//h1[text() = 'Your Account Has Been Created!']")).getText();
				
		String expected = "Your Account Has Been Created!";
		
		sa.assertEquals(actual, expected);
		
		sa.assertAll();
		
		
	}
		
		@Test
		public void verifyRegistrationWithInvalidData() throws IOException {
			
			RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
			
			rpo.clickOnMyAccount().click();
			rpo.clickOnRegister().click();
			rpo.clickOnContinue().click();
			
			SoftAssert sa = new SoftAssert();
			
			String fnActual = driver 
	 				.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText(); 
	 		
			String fnExpected = "First Name must be between 1 and 32 characters!"; 
	  
	 		String lnActual = driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")) 
	 				.getText(); 
	 		
	 		String lnExpected = "Last Name must be between 1 and 32 characters!"; 
	  
	 		sa.assertEquals(fnActual, fnExpected); 
	  
	 		sa.assertEquals(lnActual, lnExpected); 
	 		sa.assertAll(); 
		}
}
