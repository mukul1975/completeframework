package Utilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserdetailes {

	 public WebDriver driver;
	public Properties prob;
	
	public WebDriver browser() throws IOException
	{
		prob=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Saiful\\eclipse-workspace\\Completeframework\\src\\main\\java\\Utilityfiles\\Reusablefiles.properties");
		prob.load(fis);
		
		String BrowserName=prob.getProperty("Browser");
		
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getscreenshot(String taseCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+taseCaseName+" .png";
		FileUtils.copyFile(source, new File(destinationfile));
		
	}
	
	
}
