package assignmnet2.day2;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Mergecontact extends Baseclass {
@Test
	public  void merge()
 {
	       driver.findElement(By.linkText("Create Contact")).click();
	       driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	       driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("10595");
	      driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("10596");
	      driver.findElement(By.className("buttonDangerous")).click();
	      Alert alert=driver.switchTo().alert();
	      alert.accept();
	      System.out.println(driver.getTitle());
	}

}
