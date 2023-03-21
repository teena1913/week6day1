package assignmnet2.day2;


import org.openqa.selenium.By;



import org.testng.annotations.Test;
@Test
public class Deleteleads extends Baseclass {
	public  void del(){
		
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.linkText("Phone")).click();
	       driver.findElement(By.name("phoneNumber")).sendKeys("8610490396");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println(text);
	       driver.findElement(By.linkText("10973")).click();
	       driver.findElement(By.linkText("Delete")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.linkText("Name and ID")).click();
	       driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10971");
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      
	      
	}
	@Test public void runLogin() {
		  System.out.println(Thread.currentThread().getId());
		  System.out.println("Login is successful"); }
}
