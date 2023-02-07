package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	 private RetailHomeLogin homePage;
	 private RetailSignInPage signInPage;
	 
	 
	 
	 
	 private RetailNewAccountPage createNewAccount;
	 
	 
	 
	 
	 private RetailAccountPage ProfileInformation;
	 private RetailHomePage Allhomepage;
	 private RetailOrderPage OrderPage;
	 public POMFactory() {
		 this.homePage = new RetailHomeLogin();
		 this.signInPage=new RetailSignInPage();
		 
		 
		 
		 this.createNewAccount=new RetailNewAccountPage();
		 
		 
		 this.ProfileInformation=new RetailAccountPage();
		 this.Allhomepage=new RetailHomePage();
		 this.OrderPage=new RetailOrderPage();
		
		     }
	 public RetailHomeLogin homePage() {
	        return this.homePage;
	    }
	 
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetailNewAccountPage createNewAccount() {
		return this.createNewAccount;
	}
	public RetailAccountPage ProfileInformation() {
		return this.ProfileInformation;
	}
	public RetailHomePage Allhomepage() {
		return Allhomepage;
		
	}
	public RetailOrderPage OrderPage() {
		return OrderPage;
	}
}
