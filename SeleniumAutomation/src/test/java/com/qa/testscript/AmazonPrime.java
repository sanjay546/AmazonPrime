package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPrime {
	
	

	WebDriver driver;
	
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='dv-offers-container']/div[1]/div[1]/div[1]/div[2]/a[1]/span[2]")
	WebElement LoginButton; 
	
	public WebElement getLoginButton()
	{
		return LoginButton;
		
	}
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailInputField;
	
	public WebElement getemail()
	{
		return emailInputField;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordInputField;
	
	public WebElement getpassword()
	{
		return passwordInputField;
		
	}
	
	@FindBy(id="signInSubmit")
	WebElement signinButton;
	
	public WebElement getsignin()
	{
		return signinButton;
		
	}
//search the movie
	
	@FindBy(xpath="//input[@id='pv-search-nav']")
	WebElement searchBox;
	
	public WebElement getsearchBox()
	{
		return searchBox;
	}
	
	@FindBy(xpath="//body/div[@id='a-page']/section[@id='av-search']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement clickMovie;
	
	public WebElement getMovie()
	{
		return clickMovie;
	}
	
	
	
	@FindBy(xpath="//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/form[1]/span[1]/label[1]/button[1]")
	WebElement addToWatchList;
	
	public WebElement WatchList()
	{
		return addToWatchList;
		
	}
	
	@FindBy(xpath="//label[@id='nav-profiles-dropdown-label']")
	WebElement DropDown;
	
	public WebElement getDropDown()
	{
		
	return DropDown;
	}
	
	@FindBy(xpath="//a[@id='pv-nav-your-watchlist']")
	WebElement watchlist;
	
	public WebElement getWatchList()
	{
		return watchlist;
		}
	
	@FindBy(linkText="Not sanjay.s? Sign Out")
	WebElement DropDown1;
	
	public WebElement getsignout()
	{
		Select drop=new Select(DropDown1);
		drop.selectByVisibleText("Not sanjay.s? Sign Out");
		return DropDown1;
		
		
	}
	@FindAll(@FindBy(xpath="//span[contains(text(),'3 idiots')]"))
	List<WebElement> TitleoftheMovie;
	public List<WebElement> getTitleoftheMovie()
	{
		return TitleoftheMovie;
	}
	
	
	
	public AmazonPrime(WebDriver driver) {
	       this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}




	
	}



