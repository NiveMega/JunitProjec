package org.adactin.utilities;
import java.io.IOException;

import org.adactin.utilities.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionA extends BaseClass {
	
	@Test 
	public void tc1() throws IOException{
		//for LoginPage
		writeExcel("AdactinLogin", "login", 5, 5, "login");
		createRowOnly("AdactinLogin", "login", 0, 0, "UserName");
		createCellOnly("AdactinLogin", "login", 0, 1, "Password");
		
		createRowOnly("AdactinLogin", "login", 1, 0, "vaithy2410");
		createCellOnly("AdactinLogin", "login", 1, 1, "vaithy@2410");
	}
	
	
	@Test
	public void tc2() throws IOException, Throwable {
			
		//for Booking Hotel		
				writeExcel("Adactin", "details", 20, 4, "data");
				createRowOnly("Adactin", "details", 0, 0, "Hotel Name");
				createCellOnly("Adactin", "details", 0, 1, "Location");
				createCellOnly("Adactin", "details", 0, 2, "Room Type");
				createCellOnly("Adactin", "details", 0, 3, "Arrival date");
				createCellOnly("Adactin", "details", 0, 4, "Depature date");
				createCellOnly("Adactin", "details", 0, 5, "Total Rooms");
				createCellOnly("Adactin", "details", 0, 6, "Adults Per Room");
				createCellOnly("Adactin", "details", 0, 7, "Children per Room");
				createCellOnly("Adactin", "details", 0, 8, "Price Per Night");
				createCellOnly("Adactin", "details", 0, 9, "First Name");
				createCellOnly("Adactin", "details", 0, 10, "Last Name");
				createCellOnly("Adactin", "details", 0, 11, "Billing Address");
				createCellOnly("Adactin", "details", 0, 12, "Credit Card");
				createCellOnly("Adactin", "details", 0, 13, "Credit Card Type");
				createCellOnly("Adactin", "details", 0, 14, "Expiry Date Month");
				createCellOnly("Adactin", "details", 0, 15, "Expiry Date Year");
				createCellOnly("Adactin", "details", 0, 16, "cvv");
				
				createRowOnly("Adactin", "details", 1, 0, "Hotel Sunshine");
				createCellOnly("Adactin", "details", 1, 1, "London");
				createCellOnly("Adactin", "details", 1, 2, "Super Deluxe");
				createCellOnly("Adactin", "details", 1, 3, "20/08/2023");
				createCellOnly("Adactin", "details", 1, 4, "21/08/2023");
				createCellOnly("Adactin", "details", 1, 5, "2 - Two");
				createCellOnly("Adactin", "details", 1, 6, "2 - Two");
				createCellOnly("Adactin", "details", 1, 7, "2 - Two");
				createCellOnly("Adactin", "details", 1, 8, "15");
				createCellOnly("Adactin", "details", 1, 9, "Nive");
				createCellOnly("Adactin", "details", 1, 10, "Mega");
				createCellOnly("Adactin", "details", 1, 11, "Tamilnadu,India");
				createCellOnly("Adactin", "details", 1, 12, "1234567891234567");
				createCellOnly("Adactin", "details", 1, 13, "American Express");
				createCellOnly("Adactin", "details", 1, 14, "March");
				createCellOnly("Adactin", "details", 1, 15, "2024");
				createCellOnly("Adactin", "details", 1, 16, "123");
				
				
		loadBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximizePage();
		Elements e = new Elements();
	    enterText(e.getUsername(), readDataFromExcel("AdactinLogin", "login", 1, 0));
	    enterText(e.getPassword(), readDataFromExcel("AdactinLogin", "login", 1, 1));
	    btnClick(e.getBtnLogin());
		
		//Booking Page
	    Thread.sleep(3000);
	    selByTxt(e.getLocation(), readDataFromExcel("Adactin", "details", 1, 1));
	    selByTxt(e.getHotels(), readDataFromExcel("Adactin", "details", 1, 0));
		selByTxt(e.getRoomType(), readDataFromExcel("Adactin", "details", 1, 2));
		selByTxt(e.getNoOfRooms(), readDataFromExcel("Adactin", "details", 1, 5));
		enterText(e.getCheckInDate(), readDataFromExcel("Adactin", "details", 1, 3));
		enterText(e.getCheckInDate(), readDataFromExcel("Adactin", "details", 1, 3));
		selByTxt(e.getAdultsPerRoom(), readDataFromExcel("Adactin", "details", 1, 6));
		selByTxt(e.getChildrenPerRoom(), readDataFromExcel("Adactin", "details", 1, 7));
		btnClick(e.getBtnSearch());
		
		
		
		//Search Hotel Page
		btnClick(e.getRadioBtn());
		btnClick(e.getContinueBtn());
		
		//Book A Hotel Page
		enterText(e.getFirstName(), readDataFromExcel("Adactin", "details", 1, 9));
		enterText(e.getLastName(), readDataFromExcel("Adactin", "details", 1, 10));
		enterText(e.getAddress(), readDataFromExcel("Adactin", "details", 1, 11));
		enterText(e.getCcNum(), readDataFromExcel("Adactin", "details", 1, 12));
		selByTxt(e.getCcType(), readDataFromExcel("Adactin", "details", 1, 13));
		selByTxt(e.getCcExpMonth(), readDataFromExcel("Adactin", "details", 1, 14));
		selByTxt(e.getCcExpYear(), readDataFromExcel("Adactin", "details", 1, 15));
		enterText(e.getCcCvv(), readDataFromExcel("Adactin", "details", 1, 16));
		btnClick(e.getBookNowBtn());
		
		//Booking Confirmation
		Thread.sleep(5000);
		String attribute = retriveAttribute(e.getOrderNo(), "value");
		System.out.println("Order Id id "+attribute);
		}
	
	
	     
	
	@AfterClass
	public static void closeBrowser() {
	System.out.println("Quit Browser");
	}
   @Before
	public void  tcStartTime() {
		System.out.println("Test Case Start");
    }
	
	@BeforeClass
	public static void  browserLaunch() {
		System.out.println("Launch Browser");

	}
	@After
    public void tcEndTime() {
		System.out.println("testcase ends");

	}



}
