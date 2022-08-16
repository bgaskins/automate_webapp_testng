package webDriverTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	@Test(priority = 1)
	  public void register() {
		
		  WebDriverManager.chromedriver().setup();
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.com/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("John Smith");
	      wd.findElement(By.id("ap_email")).sendKeys("ABC@xyz.com");
	      wd.findElement(By.id("ap_password")).sendKeys("abc1234$!");
	      wd.findElement(By.id("ap_password_check")).sendKeys("abc1234$!");
	     
	  }
	
	@Test(priority = 2)
	  public void login() {
		  WebDriverManager.chromedriver().setup();
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.com/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("ABC@xyz.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("abc1234$!");

	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  	WebDriverManager.chromedriver().setup();
		  	WebDriver wd=new ChromeDriver();
	      	wd.get("https://www.amazon.com/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("bestselling books 2022");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    wd.findElement(By.linkText("Sparring Partners: Novellas")).click();
		    
		    //if logged in this will add item to cart
	        //wd.findElement(By.id("add-to-cart-button")).click();
	  }
}
