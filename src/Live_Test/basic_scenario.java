package Live_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Live_Test.*;

import org.openqa.selenium.support.ui.Select;


import org.apache.log4j.Logger;


public  class basic_scenario  {
	  
	
		
	  
	final static Logger logger = Logger.getLogger(Check.class);
		static String a= "AutomatedBCA";
		static String b= "AutomatedBCA1";
		static String c= "test@123";
	  
		public static void Chrome_loginid(WebDriver driver)  throws Exception 
		  {
		  		driver.findElement(By.id ("ucLoginSimple_tbLoginName")).clear();  
		  		driver.findElement(By.id ("ucLoginSimple_tbLoginName")).sendKeys(a); 
		  		driver.findElement(By.xpath (".//*[@id='ucLoginSimple_tbPassword']")).clear(); 
		  		driver.findElement(By.xpath (".//*[@id='ucLoginSimple_tbPassword']")).sendKeys(c); 
		  		driver.findElement(By.xpath (".//*[@id='ucLoginSimple_btnLogin']")).click();
		  		Thread.sleep(2000);
		  }
		  
			/*public static  void Firefox_loginid(WebDriver driver2)  throws Exception 
			  {
				  	driver2.findElement(By.xpath (".//*[@id='ucLoginSimple_tbLoginName']")).clear();  
			  		driver2.findElement(By.xpath (".//*[@id='ucLoginSimple_tbLoginName']")).sendKeys(b); 
			  		driver2.findElement(By.xpath (".//*[@id='ucLoginSimple_tbPassword']")).clear(); 
			  		driver2.findElement(By.xpath (".//*[@id='ucLoginSimple_tbPassword']")).sendKeys(c); 
			  		driver2.findElement(By.xpath (".//*[@id='ucLoginSimple_btnLogin']")).click();
			  		
			  }*/
		 
		public static  void Quit_Browsers(WebDriver driver,WebDriver driver2)  throws Exception 
		  {
			 	driver.quit();
			    driver2.quit();
		  }
		 
		public static  void open_links(WebDriver driver, String baseUrl )  throws Exception 
		  {
				
				driver.get(baseUrl + "SystemLog.aspx");
				Thread.sleep(2000);
				
				Select drpCountry = new Select(driver.findElement(By.id("ctl00_cphContent_ddLogLevel")));
				drpCountry.selectByValue("9");
				
				
				logger.info("Chrome browser:-> " + "Systemlog >> error selected");
				driver.findElement(By.xpath ("//*[@id='ctl00_cphContent_ibSearch']")).click();
				Thread.sleep(2000);
				String s = driver.findElement(By.xpath("/html//form[@id='aspnetForm']//table[@class='PageContent']//td[@class='ContentPageHeader']/div/div/div/div[2]/table[@class='MasterTable_SO']/tbody/tr[1]/td")).getText();  
				System.out.println(s);
				
				

				//String str = "Navigeer pagina: << Eerste < Vorige 12345 ... Volgende > Laatste >> | Pagina 1 van 12 | Items 1 tot 50 van 561";
			      
		        String[] line = s.split(">>");
		        String part1 = line[1];
		       // System.out.println("part1: -> " + part1);
		        String[] line2 = s.split("van");
		        String part2 = line2[1];
		        String part3 = line2[2];
		        System.out.println("Total Number of error:- > " + part3);
		       // System.out.println("part2: -> " + part2 + part3);
		        String[] line3= part2.split(" ");
		        String part4 = line3[1];
		        System.out.println("Number of Error pages: -> " + part4);
				
		  }
		/*public static  void open_links2(WebDriver driver2, String baseUrl )  throws Exception 
		  {
				driver2.get(baseUrl + "/GeneralSettings.aspx");
		  }*/
		
	
}
