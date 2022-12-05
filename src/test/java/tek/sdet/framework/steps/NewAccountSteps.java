package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class NewAccountSteps  extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in optionn")
	public void UserclickonSigninoption() {
		click(factory.createNewAccount().SigninButton);
		logger.info("User click on Sign in option");
	}
	@And("User click on Create New Account button")
	public void UserclickonCreateNewAccountbutton() {
		click(factory.createNewAccount().CreatenewAccountBtn);
		logger.info("User click on Create New Account button");
		
	}
	@And("User fill the signUp information with below name {string} email {string} password {string} confirmPassword {string}")
	
	public void Userfill(String name, String email, String password, String confirmpassword) {
	 sendText(factory.createNewAccount().EnterName,name);
	 sendText(factory.createNewAccount().EnterEmail, email);
	 sendText(factory.createNewAccount().EnterPassword, password);
	 sendText(factory.createNewAccount().EnterConfirmPassword,confirmpassword);
	 logger.info("User fill the signUp information with below");
	}
	@And("User click on SignUp button")
	public void UserclickonSignUpbutton() {
		click(factory.createNewAccount().ClickOnSignUpBttn);
		logger.info("User click on SignUp button");
	}
	@Then("User should be logged into account page")
	public void Usershouldbeloggedintoaccountpage() {
	 Assert.assertTrue(isElementDisplayed(factory.createNewAccount().AccountPage));
	 logger.info("User should be logged into account page");
	}
}