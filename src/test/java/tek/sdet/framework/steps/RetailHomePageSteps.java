package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomePageSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void UserclickonAllsection() {
		click(factory.Allhomepage().AllBttnHPage);
		logger.info("User click on All section");
	}
	@Then("below options are present in Shop by Department sidebar |Electronics|Computers|Smart Home|Sports|Automative|")
	public void belowoptionsarepresent() {
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().ElrctronicBttnHP));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().computerBttnHP));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().smartHomeBttnHP));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().sportsBttnHP));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AutomativeBttnHP));
		logger.info("below options are present");
	}
	@When("User click on All section1")
	public void UserclickonAllsection1() {
		click(factory.Allhomepage().AllBttnHPage);
		logger.info("User click on All section");
	}
	
	@And("User on <department>")
	public void Userondepartment() {
     Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllSHOPBYDEPARTMENTLIST));
     logger.info("User on <department>");
	}
	@Then("below options are present in department")
	public void belowoptionsarepresentindepartment() {
		click(factory.Allhomepage().AllElrctronicBttn);
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllTVandVideo));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllVideoAndGame));
		click(factory.Allhomepage().AllcomputerBttnHP);
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllAccessories));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllNetWorking));
		click(factory.Allhomepage().AllsmartHomeBttnHP);
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllSmartHomeLightning));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllPlugsAndOutlets));
		click(factory.Allhomepage().AllsportsBttnHP);
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllAthleticClothing));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllExcerciseFitness));
		click(factory.Allhomepage().AllAutomativeBttnHP);
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllAtomativePartsAccessories));
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().AllMotorCylePowerSports));
		logger.info("User on <department>");
	}
	@When("User change the category to Smart Home")
	public void UserchangethecategorytoSmartHome() {
		click(factory.Allhomepage().AllDepartmentBttn);
		click(factory.Allhomepage().SmartHomeSerachBttn);
		logger.info("User change the category to Smart Home");
	}
	@And("User search for an item {string}")
	public void Usersearchforanitem(String SearchItem) {
		click(factory.Allhomepage().SearchBar);
		sendText(factory.Allhomepage().SearchBar,SearchItem);
		logger.info("User search for an item {string}");
	}
	@And("User click on Search icon")
	public void UserclickonSearchicon() {
		click(factory.Allhomepage().SearchBttn);
		logger.info("User click on Search icon");
	}
	@And("User click on item")
	public void Userclickonitem() {
		click(factory.Allhomepage().Item);
		logger.info("User click on item");
	}
	@And("User select quantity 2")
	public void Userselectquantity2() {
		click(factory.Allhomepage().SelectQuantity2);
		logger.info("User select quantity 2");
	}
	@And("User click add to Cart button")
	public void UserclickaddtoCartbutton() {
		click(factory.Allhomepage().AddToCartBttn);
		logger.info("User click add to Cart button");
	}
	@Then("the cart icon quantity should change to 2")
	public void thecarticonquantityshouldchangeto2() {
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().CartIconQuantity));
		logger.info("the cart icon quantity should change to 2");
	}
	@When("User click on Cart option")
	public void UserclickonCartoption() {
		click(factory.Allhomepage().CartBttn);
		logger.info("User click on Cart option");
	}
	@And("User click on Proceed to Checkout button")
	public void UserclickonProceedtoCheckoutbutton() {
		click(factory.Allhomepage().ProceedToCheckoutBttn);
		logger.info("User click on Proceed to Checkout button");	
	}
	@And("User click Add a new address link for shipping address")
	public void UserclickAddanewaddresslinkforshippingaddress() {
		click(factory.Allhomepage().AddANewAddressLink);
		logger.info("User click Add a new address link for shipping address");
	}
	@And("User fill new address form with below information:country fullName{string}phoneNumber{string}streetAddress{string}apt {string}city {string} state zipCode{string}")
	public void Userfillnewaddressformwithbelowinformation(String FullName, String PhoneNo, String StreetAddress, String Apt, String City, String ZipCode) {
		click(factory.Allhomepage().SelectCountryUSA);
		sendText(factory.Allhomepage().FullName,FullName);
		sendText(factory.Allhomepage().PhoneNo,PhoneNo);
		sendText(factory.Allhomepage().StreetAddress,StreetAddress);
		sendText(factory.Allhomepage().AptNo,Apt);
		sendText(factory.Allhomepage().City,City);
		click(factory.Allhomepage().State);
		sendText(factory.Allhomepage().ZipCode,ZipCode);
		logger.info("User fill new address form with below information");
	}
	@And("User click Add Your Address button")
	public void UserclickAddYourAddressbutton() {
		click(factory.Allhomepage().AddYourAddressBttn);
		logger.info("User click Add Your Address button");
	}
	@And("User click Add a credit card or Debit Card for Payment method")
	public void UserclickAddacreditcardorDebitCardforPaymentmethod() {
		click(factory.Allhomepage().AddACreditOrDebitCard);
		logger.info("User click Add a credit card or Debit Card for Payment method");
	}
	@And("User fill Debit or credit card information cardNumber{string}nameOnCard{string}expirationMonth expirationYear securityCode{string}")
	public void UserfillDebitorcreditcardinformation(String CardNo, String NameOnCard, String SecurityCode) {
		sendText(factory.Allhomepage().EnterCardNo,CardNo);
		sendText(factory.Allhomepage().EnterFullNameOnCard,NameOnCard);
		click(factory.Allhomepage().ExpirationDateOnCard);
		click(factory.Allhomepage().ExpirationYear);
		sendText(factory.Allhomepage().SecurityCode,SecurityCode);
		logger.info("User fill Debit or credit card information");
	}
	@And("User click on Add your card button")
	public void UserclickonAddyourcardbutton() {
		click(factory.Allhomepage().AddYourCardBttn);
		logger.info("User click on Add your card button");
	}
	@And("User click on Place Your Order")
	public void UserclickonPlaceYourOrder() {
		click(factory.Allhomepage().PlaceYourOrderBttn);
		logger.info("User click on Place Your Order");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void amessageshouldbedisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().OrderPlacedThanksNotice));
		logger.info("a message should be displayed ‘Order Placed, Thanks’");
	}
	@When("User change the category to 'Electronics")
	public void UserchangethecategorytoElectronics() {
		click(factory.Allhomepage().ElectronicIcon);
		logger.info("User change the category to 'Electronics");
	}
	@And("User search for an item {string}")
	public void UsersearchforanitemApexLegends(String item) {
		sendText(factory.Allhomepage().SearchBarr,item);
		logger.info("User search for an item {string}");
	}
	@And("User click on Search iconn")
	public void UserclickonSearchiconn() {
		click(factory.Allhomepage().SearchBarBttn);
		logger.info("User click on Search icon");
	}
	@And("User click on item")
	public void Userclickonitemm() {
		click(factory.Allhomepage().ItemSelect);
		logger.info("User click on item");
	}
	@And("User select quantity ‘5’")
	public void Userselectquantity(){
		click(factory.Allhomepage().ItemQuantity5);
		logger.info("User select quantity ‘5’");
	}
	@And("User click add to Cart button")
	public void UserclickddtoCartbutton() {
		click(factory.Allhomepage().AddCardBttnn);
		logger.info("User click add to Cart button");
	}
	@And("the cart icon quantity should change to ‘5’")
	public void thecarticonquantityshouldchangeto() {
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().CartBttnOption));
		logger.info("the cart icon quantity should change to ‘5’");
	}
	@And("User click on Cart optionz")
	public void UserclickonCartoptionn() {
		click(factory.Allhomepage().CartBttnOption);
		logger.info("User click on Cart optionz");
	}
	@And("User click on Proceed to Checkout buttonn")
	public void UserclickonProceedtoCheckoutbuttonn() {
		click(factory.Allhomepage().ProceedToCheckoutBttnn);
		logger.info("User click on Proceed to Checkout button");
	}
	@And("User click on Place Your Orderr")
	public void UserclickonPlaceYourOrderr() {
		click(factory.Allhomepage().PlacedOrderBttn);
		logger.info("User click on Place Your Orderr");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void messageshouldbedisplayedOrderPlacedThanks(){
		Assert.assertTrue(isElementDisplayed(factory.Allhomepage().OrderPlacedThank));
		logger.info("message should be displayed ‘Order Placed, Thanks");
	}
	
	
}
