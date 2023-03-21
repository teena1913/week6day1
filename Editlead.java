package assignmnet2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Editlead extends Baseclass {

	@Test
	public  void edit() {
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Find Leads")).click();
       driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Infanteena");
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       driver.findElement(By.linkText("10761")).click();
      String title = driver.getTitle();
  	  System.out.println(title);
     driver.findElement(By.linkText("Edit")).click();
     driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
      driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("tcs");
     driver.findElement(By.className("smallSubmit")).click();
    WebElement nn =driver.findElement(By.id("viewLead_companyName_sp"));
    String text = nn.getText();
     if(text!=null) {
    	 System.out.println("the name is changed");
     }
     else
     {
    	 System.out.println("the name not changed");
     }

     
    
}
}	


