package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id="accountLink")public WebElement AccountBttn;
	@FindBy(id="nameInput")public WebElement profileInputName;
	@FindBy(id="personalPhoneInput") public WebElement profilePhoneNo;
	@FindBy(id="personalUpdateBtn")public WebElement updateBttn;
	@FindBy(xpath="//div[@class='account__personal']")public WebElement updatedPage;
	@FindBy(id="previousPasswordInput")public WebElement previousPassword;
	@FindBy(id="newPasswordInput")public WebElement newPassword;
	@FindBy(id="confirmPasswordInput") public WebElement confirmPassword;
	@FindBy(id="credentialsSubmitBtn")public WebElement changePassWordBttn;
	@FindBy(id="credentialsForm")public WebElement updatedNewPassWordPage;
	@FindBy(id="cardNumberInput") public WebElement addCardNo;
	@FindBy(id="nameOnCardInput")public WebElement addNameONcard;
	@FindBy(xpath="//option[text()='12']")public WebElement SelectMonth;
	@FindBy(xpath="//option[text()='2024']")public WebElement selectYear;
	@FindBy(id="securityCodeInput")public WebElement EnterSecurityCode;
	@FindBy(id="paymentSubmitBtn")public WebElement AddCardBttn;
	@FindBy(xpath="//div[@class='account__payment-detail']")public WebElement NEWPage;
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")public WebElement VisaCardBttn;
	@FindBy(xpath="//button[text()='Edit']")public WebElement EditBttn;
	@FindBy(id="cardNumberInput") public WebElement CardNumberEdit;
	@FindBy(id="nameOnCardInput")public WebElement NameOnCardEdit;
	@FindBy(xpath="//option[text()='12']")public WebElement ExpirationDateEdit;
	@FindBy(xpath="//option[text()='2024']")public WebElement ExpirationYearEdit;
	@FindBy(id="securityCodeInput")public WebElement SecurityCodeEdit;
	@FindBy(id="paymentSubmitBtn") public WebElement UpdateYouCardBttnEdit;
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")public WebElement UpatedSecessfulMassageedit;
	
	@FindBy(xpath="//button[text()='remove']")public WebElement RemoveBttn;
	@FindBy(xpath="//div[@class='account__payments']")public WebElement RemovedPageConfirm;
	
	@FindBy(xpath="//div[@class='account__address-new']")public WebElement AddAddressBttn;
	@FindBy(xpath="//option[text()='United States']")public WebElement AddCountryAddress;
	@FindBy(id="fullNameInput")public WebElement AddFullNameAddress;
	@FindBy(id="phoneNumberInput")public WebElement AddPhoneAddress;
	@FindBy(id="streetInput")public WebElement AddStreetAddress;
	@FindBy(id="apartmentInput")public WebElement Add_APT_Address;
	@FindBy(id="cityInput")public WebElement Add_City_Address;
	@FindBy(xpath="//option[text()='California']")public WebElement AddStateAddress;
	@FindBy(id="zipCodeInput")public WebElement AddZipCodeAddress;
	@FindBy(id="addressBtn") public WebElement AddYourAddressBttn;
	@FindBy(xpath="//div[@class='account__address-single']")public WebElement AddPageAddedDispalyed;
	
	@FindBy(xpath="//button[text()='Edit']")public WebElement EditAddressBttn;
	@FindBy(xpath="//option[text()='United States']")public WebElement EditCountryAddress;
	@FindBy(id="fullNameInput")public WebElement EditFullNameAddress;
	@FindBy(id="phoneNumberInput")public WebElement EditPhoneAddress;
	@FindBy(id="streetInput")public WebElement EditStreetAddress;
	@FindBy(id="apartmentInput")public WebElement Edit_APT_Address;
	@FindBy(id="cityInput")public WebElement Edit_City_Address;
	@FindBy(xpath="//option[text()='California']")public WebElement EditStateAddress;
	@FindBy(id="zipCodeInput")public WebElement EditZipCodeAddress;
	@FindBy(id="addressBtn")public WebElement EditUpdateAddressBtn;
	@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']") public WebElement EditSuccessfulPage;
	
	@FindBy(xpath="//button[text()='Remove']")public WebElement removedBttn;
	@FindBy(xpath="//div[@class='account__address-grid']")public WebElement RemovePageSuccessful;
	
	
}

