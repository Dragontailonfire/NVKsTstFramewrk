package maincomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HitPage {

	public HitPage() {
		// TODO Auto-generated constructor stub
		
	}
	public static WebDriver driver = null;
	
	public void hitApplicationUrl(String siteURL) throws InterruptedException{
		try {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(siteURL);
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Application not available");
		}
	}
	
	public void exitApplication(){
		driver.close();
	}

}
