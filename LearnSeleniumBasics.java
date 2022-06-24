package classroom.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To get Driver for execution
	WebDriverManager.chromedriver().setup();
	//To Open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
		//To maximize the opened browser
		driver.manage().window().maximize();
		WebElement usernameElement = driver.findElement(By.id("username"));
				usernameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.id("password"));
					passwordElement.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
					loginButton.click();
					WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
					crmsfaElement.click();
					WebElement createLead = driver.findElement(By.linkText("Create Lead"));
					createLead.click();
					WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
					companyName.sendKeys("Mphasis");
					WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
					firstName.sendKeys("Subathra");
					WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
					lastName.sendKeys("Nagarajan");
					//WebElement submitCreateLead = driver.findElement(By.className("smallSubmit"));
					//submitCreateLead.click();
					WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
					sourceDropDown.sendKeys("Conference");
					WebElement marketDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
						Select dropDown = new Select(marketDropDown);
						dropDown.selectByValue("Car and Driver");
					WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
					Select currency = new Select(preferredCurrency);
					currency.selectByIndex(2);
					WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
					Select ind = new Select(industry);
					ind.selectByValue("Press");
					
						
					
					
					
					
		
				
		//To close the browser
		//driver.close();

	}

}
