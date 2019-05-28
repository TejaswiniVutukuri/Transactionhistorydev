package com.scrapPlant.functions;

import org.testng.annotations.Test;

import com.scrapPlant.utilities.ReusableFunctions;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class execution {
  @Test
  public void Execution() throws Exception {
	  ReusableFunctions.launchBrowser("chrome");
	  System.out.println();
	  ReusableFunctions.cpoyFolder("sourcePath","destinationPath");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 ReusableFunctions.path = System.getProperty("user.dir");
	  System.out.println("Execution started -------");
	  ReusableFunctions.folderdelete();
	  ReusableFunctions.getTimestamps();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  
	  //Copy files and folders from source
	//  ReusableFunctions.cpoyFolder("C:\\HuskPower\\TemporaryFolder_Trans\\Downloads","C:\\HuskPower\\Dev\\Downloads");
	  ReusableFunctions.cpoyFolder("sourcePath","destinationPath");
  }  

}
