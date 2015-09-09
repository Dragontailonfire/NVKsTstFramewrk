package applicationmodules;

import guicomponents.LoginPageGUI;
import maincomponents.Navigation;
import maincomponents.ReadDataSheet;;

public class Login extends Navigation {

	public Login() {
		// TODO Auto-generated constructor stub
		//test
	}
	
	public void LogIn() throws Exception{
		try {
			enterText(LoginPageGUI.emailTxtBox, ReadDataSheet.getCellData(1, 1));
			enterText(LoginPageGUI.passwordTxtBox, ReadDataSheet.getCellData(1, 2));
			clickElement(LoginPageGUI.logInBtn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
