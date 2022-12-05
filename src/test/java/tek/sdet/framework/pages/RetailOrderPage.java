package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	  public RetailOrderPage() {
	        PageFactory.initElements(getDriver(), this);
	    }
	  @FindBy(id="orderLink")public WebElement OrdersBttn;
	  @FindBy(xpath="//p[text()='Show Details']")public WebElement FirstOrder;
	  @FindBy(id="cancelBtn")public WebElement CancelTheOrderBttn;
	  @FindBy(id="reasonInput")public WebElement ReasonBttn;
	  @FindBy(xpath="//option[text()='Bought wrong item']")public WebElement SelectBoughtWrongItem;
	  @FindBy(id="orderSubmitBtn")public WebElement CancelOrderBttn;
	  @FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")public WebElement CancelationMassage;
	  //----------------------------------------------------------------------------------//
	  @FindBy(id="orderLink")public WebElement OrdersBttnn;
	  @FindBy(xpath="//p[text()='Show Details']")public WebElement FirstOrderr;
	  @FindBy(id="returnBtn")public WebElement returnItemBttn;
	  @FindBy(id="reasonInput")public WebElement reasonBttn;
	  @FindBy(xpath="//option[text()='Item damaged']")public WebElement selectItemDamage;
	  @FindBy(id="dropOffInput")public WebElement DropoffBttn;
	  @FindBy(xpath="//option[text()='FedEx']")public WebElement SelectFedEx;
	  @FindBy(id="orderSubmitBtn")public WebElement ReturnOrderBttn;
	  @FindBy(xpath="//div[@class='return__confirm-card ']")public WebElement ReturnWasSeccefullyMassage;
	  //----------------------------------------//
	  @FindBy(id="orderLink")public WebElement OrdersBttnnn;
	  @FindBy(xpath="//p[text()='Show Details']")public WebElement FirstOrderrr;
	  @FindBy(id="reviewBtn")public WebElement ReviewBttn;
	  @FindBy(id="headlineInput")public WebElement HeadLineReview;
	  @FindBy(xpath="//textarea[@name='comment']")public WebElement AddReviewText;
	  @FindBy(id="reviewSubmitBtn")public WebElement AddReviwBttn;
	  
	  @FindBy(xpath="//div[text()='Your review was added successfully']")public WebElement SeccefulMassagDisplayed;
	  
	  
}
