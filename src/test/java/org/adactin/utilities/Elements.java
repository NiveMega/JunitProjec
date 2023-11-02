package org.adactin.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements  extends BaseClass{
public Elements() {
PageFactory.initElements(driver, this);
}
//LoginPage WebElements
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement btnLogin;

public WebElement getBtnLogin() {
	return btnLogin;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}

//Booking Page WebElement
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomType;
@FindBy(id="room_nos")
private WebElement noOfRooms;
@FindBy(id="datepick_in")
private WebElement checkInDate;
@FindBy(id="datepick_out")
private WebElement checkOutDate;
@FindBy(id="adult_room")
private WebElement adultsPerRoom;
@FindBy(id="child_room")
private WebElement childrenPerRoom;
@FindBy(id="Submit")
private WebElement btnSearch;
@FindBy(id="Reset")
private WebElement btnReset;

public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getNoOfRooms() {
	return noOfRooms;
}
public WebElement getCheckInDate() {
	return checkInDate;
}
public WebElement getCheckOutDate() {
	return checkOutDate;
}
public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}
public WebElement getChildrenPerRoom() {
	return childrenPerRoom;
}
public WebElement getBtnSearch() {
	return btnSearch;
}
public WebElement getBtnReset() {
	return btnReset;
}


//Select Hotel page WebElement
@FindBy(id="radiobutton_0")
private WebElement radioBtn;
@FindBy(id="continue")
private WebElement continueBtn;
@FindBy(id="cancel")
private WebElement cancelBtn;

public WebElement getRadioBtn() {
	return radioBtn;
}
public WebElement getContinueBtn() {
	return continueBtn;
}
public WebElement getCancelBtn() {
	return cancelBtn;
}


//Book a hotel page..(continuation of Booking page)
@FindBy(id="first_name")
private WebElement firstName;
@FindBy(id="last_name")
private WebElement lastName;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement ccNum;
@FindBy(id="cc_type")
private WebElement ccType;
@FindBy(id="cc_exp_month")
private WebElement ccExpMonth;
@FindBy(id="cc_exp_year")
private WebElement ccExpYear;
@FindBy(id="cc_cvv")
private WebElement ccCvv;
@FindBy(id="book_now")
private WebElement bookNowBtn;
@FindBy(id="cancel")
private WebElement cancelFinalBtn;

public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcNum() {
	return ccNum;
}
public WebElement getCcType() {
	return ccType;
}
public WebElement getCcExpMonth() {
	return ccExpMonth;
}
public WebElement getCcExpYear() {
	return ccExpYear;
}
public WebElement getCcCvv() {
	return ccCvv;
}
public WebElement getBookNowBtn() {
	return bookNowBtn;
}
public WebElement getCancelFinalBtn() {
	return cancelFinalBtn;
}


//Booking Confirmation Page
@FindBy(id="order_no")
private WebElement orderNo;
@FindBy(id="search_hotel")
private WebElement searchHotelBtn;
@FindBy(id="my_itinerary")
private WebElement myItineryBtn;
@FindBy(id="logout")
private WebElement logoutBtn;

public WebElement getOrderNo() {
	return orderNo;
}
public WebElement getSearchHotelBtn() {
	return searchHotelBtn;
}
public WebElement getMyItineryBtn() {
	return myItineryBtn;
}
public WebElement getLogoutBtn() {
	return logoutBtn;
}


}


