package assignmnet2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {

	public ChromeDriver driver;
	@BeforeSuite
	public void cloud() {
		System.out.println("connected");
	}
	@AfterSuite
		public void disconnect(){
		System.out.println("not connected");
	}
	@BeforeMethod
	public void common() throws InterruptedException {

		ChromeOptions  option = new ChromeOptions();
	   option.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(option); 
	   Thread.sleep(1000);
     driver.get("http://leaftaps.com/opentaps/contol/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("DemoCSR");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
}
@AfterMethod
public void run() {
	 System.out.println("Login is successful");
	
}
}