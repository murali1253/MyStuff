package com.tracfone.selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();

	}

}
