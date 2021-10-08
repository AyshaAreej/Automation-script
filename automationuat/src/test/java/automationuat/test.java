package automationuat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha Areej\\Downloads\\Compressed\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://uat.iscuw.org/portal/users/sign_in");
	WebElement username=driver.findElement(By.id("user_username"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.name("commit"));
	username.sendKeys("director@iscuw.org");
	password.sendKeys("LLCopexA123&*");
	login.click();
	
	WebElement forms=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/ul/li[2]/a/img"));
	forms.click();
	
	WebElement forms1=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms1.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown.selectByVisibleText("ERAP1");  
	WebElement forms2=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms2.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown1 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown1.selectByVisibleText("Devbox");
	WebElement forms3=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[3]/a"));
	forms3.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown2 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown2.selectByVisibleText("Follow Up Form TEST");
	WebElement forms4=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms4.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown3 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown3.selectByVisibleText("Form w/o ::User elements");
	WebElement forms5=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms5.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown4 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown4.selectByVisibleText("Landlord ERAP RIVCO");
	WebElement forms6=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms6.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown5 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown5.selectByVisibleText("San B City - Tenant");
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown6 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown6.selectByVisibleText("SB City TEST");
	WebElement forms7=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms7.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown7 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown7.selectByVisibleText("SBC LL");
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown8 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown8.selectByVisibleText("SBCo - Landlord");
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown9 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown9.selectByVisibleText("Tenant App1");
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown10 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown10.selectByVisibleText("TEST");
	WebElement forms8=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms8.click();
	driver.navigate().to("https://uat.iscuw.org/portal/applications?tickets_filter_scope=all_tickets");
	Select dropdown11 = new Select(driver.findElement(By.id("q_program_id_eq")));  
	dropdown11.selectByVisibleText("Test App");
	WebElement forms9=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[1]/td[3]/a"));
	forms9.click();





	
	
	

	

	String actualUrl="https://live.browserstack.com/dashboard";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	}
}

