package maincomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation extends HitPage{

	public Navigation() {
		// TODO Auto-generated constructor stub
	}
	
	public void isElementPresent(By by) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		element = driver.findElement(by);
		element.isDisplayed();
	}
	
	public void enterText(By by, String text) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		element = driver.findElement(by);
		element.clear();
		element.sendKeys(text);
	}
	
	public void clickElement(By by) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		element = driver.findElement(by);
		element.click();
	}

}
