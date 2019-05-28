package com.scrapPlant.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
	
	public static void main(String args[]) {
		loadTime();
	}

	public static void loadTime() {
		System.setProperty("webdriver.chrome.driver", "D:\\com.scrapPlant.test\\com.scrapPlant.test\\lib\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    // if you like to specify another profile
	    options.addArguments("user-data-dir=/root/Downloads/aaa"); 
	    options.addArguments("start-maximized");
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    @SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
	  		
		long start = System.currentTimeMillis();

		driver.get("http://www.monocept.com");
		 String scriptToExecute = "var performance = window.loadtime ||window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
		
		 long finish = System.currentTimeMillis();
		 long totalTime = finish - start; 
			
		
		
	}
	
	
}

	