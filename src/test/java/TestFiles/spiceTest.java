package TestFiles;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilityfiles.browserdetailes;
import Utilityfiles.pagespicehome;

public class spiceTest extends browserdetailes {
	@Test
	public void sas() throws IOException {
		driver = browser();
		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
		
		pagespicehome phome=new pagespicehome(driver);
		phome.trip1();
		phome.departurecity();
		phome.putdeparturecity();
		phome.destination1();
	}
}
