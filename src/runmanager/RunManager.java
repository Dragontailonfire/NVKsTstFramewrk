/**
 * 
 */
package runmanager;

import org.apache.log4j.xml.DOMConfigurator;
import applicationmodules.Login;
import maincomponents.HitPage;
import maincomponents.Log;
import testdata.MainData;
import maincomponents.ReadDataSheet;

public class RunManager {

	/**
	 * 
	 */
	public RunManager() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			DOMConfigurator.configure("log4j.xml");
			Log.info("Test is about to begin");
			ReadDataSheet.setExcelFile(MainData.TestDataPath + MainData.TestDataFile, "Sheet1");
			HitPage page = new HitPage();
			Login login = new Login();
			page.hitApplicationUrl(MainData.TestUrl);
			Log.info("Application has loaded");
			login.LogIn();
			Log.info("User has logged in to the application");
			page.exitApplication();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}

}
