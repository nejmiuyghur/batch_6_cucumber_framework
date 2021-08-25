package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver,ConfigReader configReader) {
		super(driver,configReader);
		this.driver = driver; 
	}
	
	private By header_LoginPage = By.xpath("//h1[text()='Sign In']");
	private By input_Email = By.name("email");
	private By input_Password = By.name("password");
	private By btn_Login = By.xpath("//input[@type='submit' and @value='Login']");
	
	public void isAtLoginPage() {
		SeleniumHelper.waitForElementPresent(driver, 5, header_LoginPage);
	}
	
	public void login(String userName, String password) {
		driver.findElement(input_Email).sendKeys(userName);
		driver.findElement(input_Password).sendKeys(password);
		driver.findElement(btn_Login).click();
		
	}
	
}
