package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
POMFactory factory = new POMFactory();
	
	
@When("User click on Sign in option")
public void UserclickonSigninoption() {
	click(factory.signInPage().SignInBttn);
	logger.info("User click on Sign in option");
}

@And ("User enter email {string} and password {string}")
public void userenterEmail(String email, String password) {
	sendText(factory.signInPage().email,email);
	sendText(factory.signInPage().password,password);
	logger.info("user enter emil"+email+"user enter password"+password);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@And("User click on login button")
public void Userclickonloginbutton() {
	click(factory.signInPage().logInBttn);
	logger.info("User click on login button");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
@Then("User should be logged in into Account")
	public void UsershouldbeloggedinintoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountPage));
		logger.info("User should be logged in into Account");
	}






}
