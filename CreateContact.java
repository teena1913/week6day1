package assignmnet2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends Baseclass {
@Test
	public  void clead() {
	
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Infanteena");
        driver.findElement(By.id("lastNameField")).sendKeys("A");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Infanteena");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("A");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
        driver.findElement(By.id("createContactForm_description")).sendKeys("hi this is me");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("infanteena123@gmail.com");
        WebElement selectprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select op=new Select(selectprovince);
        op.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("the tile is "+ driver.getTitle());
		
}
@Test public void runLogin() {
	  System.out.println(Thread.currentThread().getId());
	  System.out.println("Login is successful"); }
}
