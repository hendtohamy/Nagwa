package Nagwaproject.Nagwaproject.Nagwa;

import org.testng.annotations.Test;
import org.w3c.dom.traversal.TreeWalker;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Script {
	ChromeDriver Task;
  @Test
  public void task () throws IOException {
	  Task.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
      Task.findElementByXPath("/html/body/div/div/main/div[2]/ul/li[1]/a").click();
      Task.findElementByXPath("/html/body/header/div[1]/div/div[3]/button").click();
      Task.findElementById("txt_search_query").sendKeys("addition");
      Task.findElementByXPath("//*[@id=\"btn_global_search\"]").click();
      Task.findElement(By.linkText("Properties of Addition")).click();
      Task.findElementByXPath("//*[@id=\"WorksheetSection\"]/div/div[2]").click();
  }
  

  
  
  @BeforeTest
  public void openbrowser() throws IOException {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		Task = new ChromeDriver();
		Task.get("https://www.nagwa.com/");
		Task.manage().window().maximize();
	}
  

  @AfterTest
  public void afterTest() {
		
		
  }

}
