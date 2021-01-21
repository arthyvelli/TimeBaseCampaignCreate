package tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.xmlbeans.impl.regex.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.TestConfig;
import core.TestReports;
import pages.CampaignPage;

import pages.LoginPage;

import pages.LogoutPage;
import pages.TimeBaseCampaignPage;

public class SanityTest  extends TestBase{
	LoginPage login;
	
	CampaignPage campaign;
	TimeBaseCampaignPage  tbcampaign;
	
	@BeforeMethod
	public void Login_To_App() {
	
		
		driver().get(TestConfig.getProperty("APP_URL"));
	}
	
	@Test(dataProvider="extractData",priority=1)
	public void  Verify_list_import(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");
		
		
}
	@Test(dataProvider="extractData",priority=1)
	public void  Verify_Normal_Campaign_Sending(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");  
	}
	
	@Test(dataProvider="extractData",priority=1)
	public void Verify_TimeBased_Campaign_Sending(HashMap<String,String> data) throws ParseException, IOException, InterruptedException, Exception {
		System.out.println("Hello");
	}
		
		
		
		
		

}
