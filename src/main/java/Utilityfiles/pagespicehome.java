package Utilityfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pagespicehome {
	
	
	public WebDriver driver;
	public pagespicehome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By trip=By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']");
	public void trip1()
	{
		driver.findElement(trip).click();
	}
	
	@FindBy(css="[id='ctl00_mainContent_ddl_originStation1_CTXT']")
	WebElement departure;
	
	public void departurecity()
	{
		departure.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[@text='Goa (GOI)']")
	WebElement putdcity;
	public void putdeparturecity()
	{
		putdcity.click();
	}
	
	@FindBy(how=How.XPATH,using="//[@class='right1']//div[@class='search_options_menucontentbg']//div//table//tbody//tr//td[@class='mapbg']//div[@class='search_options_menucontent']//div//a[@text='Durgapur (RDP)'][contains(text(),'Durgapur (RDP)')]")
	WebElement destination;
	public void destination1()
	{
		destination.click();
	}
	

}
