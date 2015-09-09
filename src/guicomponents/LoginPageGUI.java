package guicomponents;

import org.openqa.selenium.By;

public interface LoginPageGUI {
	public static final By emailTxtBox = By.id("ismEmail");
	public static final By passwordTxtBox = By.id("id_password");
	public static final By logInBtn = By.xpath(".//input[@value='Log In']");

}
