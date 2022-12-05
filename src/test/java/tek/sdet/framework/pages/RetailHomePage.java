package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id=" hamburgerBtn") public WebElement AllBttnHPage;
	@FindBy(xpath="//span[text()='Electronics']") public WebElement ElrctronicBttnHP;
	@FindBy(xpath="//span[text()='Computers']") public WebElement computerBttnHP;
	@FindBy(xpath="//span[text()='Smart Home']") public WebElement smartHomeBttnHP;
	@FindBy(xpath="//span[text()='Sports']") public WebElement sportsBttnHP;
	@FindBy(id="//span[text()='Automative']") public WebElement AutomativeBttnHP;
	
	@FindBy(id=" hamburgerBtn") public WebElement AllBttnSection;
	@FindBy(xpath="//h1[text()='Shop By department']")public WebElement AllSHOPBYDEPARTMENTLIST;
	@FindBy(xpath="//span[text()='Electronics']") public WebElement AllElrctronicBttn;
    @FindBy(xpath="//span[text()='TV & Video']")public WebElement AllTVandVideo;
    @FindBy(xpath="//span[text()='Video Games']")public WebElement AllVideoAndGame;
    
    @FindBy(xpath="//span[text()='Computers']") public WebElement AllcomputerBttnHP;
    @FindBy(xpath="//span[text()='Accessories']")public WebElement AllAccessories;
    @FindBy(xpath="//span[text()='Networking']")public WebElement AllNetWorking;
    
    @FindBy(xpath="//span[text()='Smart Home']") public WebElement AllsmartHomeBttnHP;
    @FindBy(xpath="//span[text()='Smart Home Lightning']")public WebElement AllSmartHomeLightning;
    @FindBy(xpath="//span[text()='Plugs and Outlets']")public WebElement AllPlugsAndOutlets;
    
    @FindBy(xpath="//span[text()='Sports']") public WebElement AllsportsBttnHP;
    @FindBy(xpath="//span[text()='Athletic Clothing']")public WebElement AllAthleticClothing;
    @FindBy(xpath="//span[text()='Exercise & Fitness']")public WebElement AllExcerciseFitness;
    
    @FindBy(id="//span[text()='Automative']") public WebElement AllAutomativeBttnHP;
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")public WebElement AllAtomativePartsAccessories;
  @FindBy(xpath="//span[text()='MotorCycle & Powersports']")  public WebElement AllMotorCylePowerSports;
  //------------------------------------------------------------------------------------------//
  @FindBy(id="search")public WebElement AllDepartmentBttn;
  @FindBy(xpath="//option[text()='Smart Home']")public WebElement SmartHomeSerachBttn;
  @FindBy(id="searchInput")public WebElement SearchBar;
  @FindBy(id="searchBtn")public WebElement SearchBttn;
  @FindBy(xpath="//img[@class='image']")public WebElement Item;
  @FindBy(xpath="//option[text()='2']")public WebElement SelectQuantity2;
  @FindBy(id="addToCartBtn")public WebElement AddToCartBttn;
   @FindBy(xpath="//div[@id='cartBtn']")public WebElement CartIconQuantity;
    //------------------------------------------------------//
   @FindBy(xpath="//div[@id='cartBtn']")public WebElement CartBttn;
   @FindBy(xpath="//button[text()='Proceed to Checkout']") public WebElement ProceedToCheckoutBttn;
   
   @FindBy(id="addAddressBtn")public WebElement AddANewAddressLink;
   
   @FindBy(xpath="//option[text()='United States']")public WebElement SelectCountryUSA;
   @FindBy (id="fullNameInput")public WebElement FullName;
   @FindBy(id="phoneNumberInput")public WebElement PhoneNo;
   @FindBy(id="streetInput")public WebElement StreetAddress;
   @FindBy(id="apartmentInput")public WebElement AptNo;
   @FindBy(id="cityInput")public WebElement City;
   @FindBy(xpath="//option[text()='California']")public WebElement State;
   @FindBy(id="zipCodeInput")public WebElement ZipCode;
   
   @FindBy(id="addressBtn")public WebElement AddYourAddressBttn;
   
   @FindBy(id="addPaymentBtn")public WebElement AddACreditOrDebitCard;
   
   @FindBy(id="cardNumberInput")public WebElement EnterCardNo;
   @FindBy(id="nameOnCardInput")public WebElement EnterFullNameOnCard;
   @FindBy(xpath="//option[text()='12']")public WebElement ExpirationDateOnCard;
   @FindBy(xpath="//option[text()='2026']")public WebElement ExpirationYear;
   @FindBy(id="securityCodeInput")public WebElement SecurityCode;
   
   @FindBy(id="paymentSubmitBtn")public WebElement AddYourCardBttn;
   
   @FindBy(id="placeOrderBtn")public WebElement PlaceYourOrderBttn;
   
   @FindBy(xpath="//p[text()='Order Placed, Thanks']")public WebElement OrderPlacedThanksNotice;
   //--------------------------------------------------------------------------------//
   @FindBy(xpath="//option[text()='Electronics']")public WebElement ElectronicIcon;
   @FindBy(id="searchInput")public WebElement SearchBarr;
    @FindBy(id="searchBtn")public WebElement SearchBarBttn;
    @FindBy(xpath="//img[@class='image']")public WebElement ItemSelect;
    @FindBy(xpath="//option[text()='5']")public WebElement ItemQuantity5;
    @FindBy(id="addToCartBtn")public WebElement AddCardBttnn;
    @FindBy(id="cartBtn")public WebElement CartBttnOption;
    @FindBy(id="proceedBtn")public WebElement ProceedToCheckoutBttnn;
    @FindBy(id="placeOrderBtn")public WebElement PlacedOrderBttn;
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")public WebElement OrderPlacedThank;

}
