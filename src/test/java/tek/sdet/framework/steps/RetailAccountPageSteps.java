package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountPageSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void UserclickonAccountoption() {
		click(factory.ProfileInformation().AccountBttn);
		logger.info("User click on Account option");	
	}
	@And("User update Name {string} and Phone {string}")
	public void UserupdateNameandPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.ProfileInformation().profileInputName);
		sendText(factory.ProfileInformation().profileInputName,name);
		clearTextUsingSendKeys(factory.ProfileInformation().profilePhoneNo);
		sendText(factory.ProfileInformation().profilePhoneNo,phone);
		logger.info("User update Name {string} and Phone {string}");
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	} 
	
	@And("User click on Update button")
	public void UserclickonUpdatebutton() {
		click(factory.ProfileInformation().updateBttn);
		logger.info("User click on Update button");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Then("user profile information should be updated")
public void userprofileinformationshouldbeupdated() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().updatedPage));
	logger.info("user profile information should be updated");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@When("User click on Account optionn")
public void UserclickonAccountoptionn() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionn");
}
@And("User enter below information |previousPassword {string} newPassword {string}confirmPassword {string}")
public void Userenterbelowinformation(String PreviusPasswrd, String NewPasswrd, String confirmPasword) {
	sendText(factory.ProfileInformation().previousPassword,PreviusPasswrd );
	sendText(factory.ProfileInformation().newPassword,NewPasswrd);
	sendText(factory.ProfileInformation().confirmPassword,confirmPasword);
	logger.info("User enter below information |previousPassword {string} newPassword {string}confirmPassword {string}");
}
@And("User click on Change Password button")
public void UserclickonChangePasswordbutton() {
	click(factory.ProfileInformation().changePassWordBttn);
	logger.info("User click on Change Password button");	
}
@Then("a message should be displayed ‘Password Updated Successfully’")
public void messageshouldbedisplayedPasswordUpdatedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().updatedNewPassWordPage));
	logger.info("message should be displayed ‘Password Updated Successfully");
	
	
}
@When("User click on Account optionnn")
public void UserclickonAccountoptionnn( ) {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionnn");
}
@And("User fill Debit or credit card information cardNumber{string} nameOnCard{string}expirationMonth expirationYear securityCode{string}")
public void UserfillDebitorcreditcardinformation(String addcardNo, String NameOnCard, String securityCode) {
	sendText(factory.ProfileInformation().addCardNo,addcardNo);
	sendText(factory.ProfileInformation().addNameONcard,NameOnCard);
	click(factory.ProfileInformation().SelectMonth);
	click(factory.ProfileInformation().selectYear);
	sendText(factory.ProfileInformation().EnterSecurityCode,securityCode);
	logger.info("User fill Debit or credit card information");
}
@And("User click on Addd your card button")
public void UserclickonAddyourcardbuttonn() {
	click(factory.ProfileInformation().AddCardBttn);
	logger.info("User click on Add your card button");
}
@Then("a message should be displayed ‘Payment Method added successfully’")
public void messageshouldbedisplayedPaymentMethodaddedsuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().NEWPage));
	logger.info("a message should be displayed ‘Payment Method added successfully");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@When("User click on Account optionq")
public void UserclickonAccountoptionq() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account option");
}
@And("User click on Edit option of card section")
public void UserclickonEditoptionofcardsection() {
	click(factory.ProfileInformation().VisaCardBttn);
	click(factory.ProfileInformation().EditBttn);
	logger.info("User click on Edit option of card section");
}
@And("user edit information with below data cardNumber{string}nameOnCard{string}expirationMonth expirationYear securityCode{string}")
public void usereditinformationwithbelowdata(String CardNo, String NameOnCard, String SecurityCode) {
	clearTextUsingSendKeys(factory.ProfileInformation().CardNumberEdit);
	sendText(factory.ProfileInformation().CardNumberEdit,CardNo);
	clearTextUsingSendKeys(factory.ProfileInformation().NameOnCardEdit);
	sendText(factory.ProfileInformation().NameOnCardEdit,NameOnCard);
	click(factory.ProfileInformation().ExpirationDateEdit);
	click(factory.ProfileInformation().ExpirationYearEdit);
	clearTextUsingSendKeys(factory.ProfileInformation().SecurityCodeEdit);
	sendText(factory.ProfileInformation().SecurityCodeEdit, SecurityCode);
	logger.info("user edit information with below data");
}
@And("user click on Update Your Card button")
public void userclickonUpdateYourCardbutton() {
	click(factory.ProfileInformation().UpdateYouCardBttnEdit);
	logger.info("user click on Update Your Card button");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("a message should be displayed ‘Payment Method updated Successfully’")
public void amessageshouldbedisplayed() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().UpatedSecessfulMassageedit));
	logger.info("a message should be displayed");
}
@When("User click on Account optionE")
public void UserclickonAccountoptionE() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionE");
}
@And("User click on remove option of card section")
public void Userclickonremoveoptionofcardsection() {
	click(factory.ProfileInformation().VisaCardBttn);
	click(factory.ProfileInformation().RemovedPageConfirm);
	logger.info("User click on remove option of card section");
}
@Then("payment details should be removed")
public void paymentdetailsshouldberemoved() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().RemoveBttn));
	logger.info("payment details should be removed");
}

@When("User click on Account optionF")
public void UserlickonAccountoptionF() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionE");
}
@And("User click on Add address option")
public void UserclickonAddaddressoption() {
	click(factory.ProfileInformation().AddAddressBttn);
	logger.info("User click on Add address option");
	
}
@And("user fill new address form with below information country fullName{string}phoneNumber{string}streetAddress{string}apt {string}city {string} state zipCode{string}")
public void userfillnewaddressformwithbelowinformationn(String fullName, String phoneNo, String StreetAddress, String apt,String city, String State, String ZipCode) {
	click(factory.ProfileInformation().AddCountryAddress);
	sendText(factory.ProfileInformation().AddFullNameAddress, fullName );
	sendText(factory.ProfileInformation().AddPhoneAddress,phoneNo);
	sendText(factory.ProfileInformation().AddStreetAddress, StreetAddress);
	sendText(factory.ProfileInformation().Add_APT_Address, apt);
	sendText(factory.ProfileInformation().Add_City_Address,city);
	click(factory.ProfileInformation().AddStateAddress);
	sendText(factory.ProfileInformation().AddZipCodeAddress,ZipCode);
	logger.info("user fill new address form with below information ");
}
@And("User click Add Your Addresss button")
public void UserclickAddYourAddressbuttonn() {
	click(factory.ProfileInformation().AddYourAddressBttn);
	logger.info("User click Add Your Address button");
}
@Then("a message should be displayed ‘Address Added Successfully’")
public void amessageshouldbedisplayedAddressAddedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().AddPageAddedDispalyed));
	logger.info("a message should be displayed ‘Address Added Successfully");
}

@When("User click on Account optionQ")
public void UserclickonAccountoptionQ() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionE");
}
@And("User click on edit address option")
public void Userclickoneditaddressoption() {
	click(factory.ProfileInformation().EditAddressBttn);
	logger.info("User click on edit address option");
}
@And("user fill new address form with below information ccountry fullName{string}phoneNumber{string}streetAddress{string}apt {string}city {string} state zipCode{string}")
public void userfillnewaddressformwithbelowinformationa(String Name, String PhoneNo, String StreetAddress, String Apt, String city, String ZipCode) {
	click(factory.ProfileInformation().EditCountryAddress);
	sendText(factory.ProfileInformation().EditFullNameAddress, Name);
	sendText(factory.ProfileInformation().EditPhoneAddress, PhoneNo);
	sendText(factory.ProfileInformation().EditStreetAddress, StreetAddress);
	sendText(factory.ProfileInformation().Edit_APT_Address, Apt);
	sendText(factory.ProfileInformation().Edit_City_Address, city);
	click(factory.ProfileInformation().EditStateAddress);
	sendText(factory.ProfileInformation().EditZipCodeAddress, ZipCode);
	logger.info("user fill new address form with below information");
}
@And("User click update Your Address button")
public void UserclickupdateYourAddressbutton() {
	click(factory.ProfileInformation().EditUpdateAddressBtn);
	logger.info("User click update Your Address button");
}
@Then("a message should be displayed ‘Address Updated Successfully’")
public void messageshouldbedisplayed() {
	waitTillPresence(factory.ProfileInformation().EditSuccessfulPage);
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().EditSuccessfulPage));
	logger.info("message should be displayed");
	
}
@When("User click on Account optionZ")
public void UserclickonAccountoptionZ() {
	click(factory.ProfileInformation().AccountBttn);
	logger.info("User click on Account optionZ");
}
@And("User click on remove option of Address section")
public void UserlickonremoveoptionofAddresssection() {
	click(factory.ProfileInformation().removedBttn);
	logger.info("User click on remove option of Address section");
}
@Then("Address details should be removed")
public void Addressdetailsshouldberemoved() {
	Assert.assertTrue(isElementDisplayed(factory.ProfileInformation().RemovePageSuccessful));
	logger.info("Address details should be removed");
}

}

