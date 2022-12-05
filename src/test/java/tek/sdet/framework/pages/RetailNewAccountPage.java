package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailNewAccountPage extends BaseSetup {
	
	public RetailNewAccountPage() {
		 PageFactory.initElements(getDriver(), this);
	}
@FindBy(id="signinLink")public WebElement SigninButton;

@FindBy(id="newAccountBtn")public WebElement CreatenewAccountBtn;

@FindBy(id="nameInput")public WebElement EnterName;

@FindBy(id="emailInput")public WebElement EnterEmail;

@FindBy(id="passwordInput")public WebElement EnterPassword;

@FindBy(id="confirmPasswordInput")public WebElement EnterConfirmPassword;

@FindBy(id="signupBtn")public WebElement ClickOnSignUpBttn;

@FindBy(xpath="//div[@class='account']")public WebElement AccountPage;
}
