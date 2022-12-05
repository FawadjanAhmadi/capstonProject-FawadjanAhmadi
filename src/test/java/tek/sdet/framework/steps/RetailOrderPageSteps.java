package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderPageSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void UserclickonOrderssection() {
		click(factory.OrderPage().OrdersBttn);
		logger.info("User click on Orders section");
	}
	@And("User click on first order in list")
	public void Userclickonfirstorderinlist() {
		click(factory.OrderPage().FirstOrder);
		logger.info("User click on first order in list");
	}
	@And("User click on Cancel The Order button")
	public void UserclickonCancelTheOrderbutton() {
		click(factory.OrderPage().CancelTheOrderBttn);
		logger.info("User click on Cancel The Order button");
	}
	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void UserselectthecancelationReasonBoughtwrongitem(){
		click(factory.OrderPage().ReasonBttn);
		click(factory.OrderPage().SelectBoughtWrongItem);
		logger.info("User select the cancelation Reason ‘Bought wrong item’");
	}
	@And("User click on Cancel Order button")
	public void UserclickonCancelOrderbutton() {
		click(factory.OrderPage().CancelOrderBttn);
		logger.info("User click on Cancel Order button");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void cancelationmessageshouldbedisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().CancelationMassage));
		logger.info("cancelation message should be displayed");
	}
	@When("User click on Orders section")
	public void UserclickonOrderssectionn() {
		click(factory.OrderPage().OrdersBttnn);
		logger.info("User click on Orders section");
	}
	@And("User click on first order in list")
	public void Userclickonfirstorderinlistt() {
		click(factory.OrderPage().FirstOrderr);
		logger.info("User click on first order in list");	
	}
	@And("User click on Return Items button")
	public void UserclickonReturnItemsbutton() {
		click(factory.OrderPage().returnItemBttn);
		logger.info("User click on Return Items button");
	}
	@And("User select the Return Reason ‘Item damaged’")
	public void UserselecttheReturnReasonItemdamaged(){
		click(factory.OrderPage().reasonBttn);
		click(factory.OrderPage().selectItemDamage);
		logger.info("User select the Return Reason ‘Item damaged’");
	}
	@And("User select the drop off service ‘FedEx’")
	public void UserselectthedropoffserviceFedEx(){
		click(factory.OrderPage().DropoffBttn);
		click(factory.OrderPage().SelectFedEx);
		logger.info("User select the drop off service ‘FedEx’");
	}
	@And("User click on Return Order button")
	public void UserclickonReturnOrderbutton() {
	click(factory.OrderPage().ReturnOrderBttn);
	logger.info("User click on Return Order button");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void acancelationmessageshouldbedisplayed(){
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().ReturnWasSeccefullyMassage));
		logger.info("a cancelation message should be displayed ‘Return was successful’");
	}
	@When("User click on Orders section")
	public void UserlickonOrderssection() {
		click(factory.OrderPage().OrdersBttnnn);
		logger.info("User click on Orders section");	
	}
	@And("User click on first order in list")
	public void Userclickonfirstorderinlistu() {
		click(factory.OrderPage().FirstOrderrr);
		logger.info("User click on first order in list");
	}
	@And("User click on Review button")
	public void UserclickonReviewbutton() {
		click(factory.OrderPage().ReviewBttn);
		logger.info("User click on Review button");
	}
	@And("User write Review headline {string} and {string}")
	public void UserwriteReviewheadline (String headline, String TextBody) {
		sendText(factory.OrderPage().HeadLineReview,headline);
		sendText(factory.OrderPage().AddReviewText,TextBody);
		logger.info("User write Review headline");
	}
	@And("User click Add your Review button")
	public void UserclickAddyourReviewbutton() {
		click(factory.OrderPage().AddReviwBttn);
		logger.info("User click Add your Review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void reviewmessageshouldbedisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().SeccefulMassagDisplayed));
		logger.info("review message should be displayed");
	}
}
