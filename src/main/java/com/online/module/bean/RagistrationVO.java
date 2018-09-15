package com.online.module.bean;

public class RagistrationVO {
	private int id;
	private int roll;
	private String fName;
	private String lName;
	private String email;
	private String pass;
	private String dob;
	private String mobileNumber;
	private String gender;
	private int cityId;
	private String currentTime;
	private Double totalAmount;
	
	public RagistrationVO() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OnlineParkingVO [id=").append(id).append(", roll=").append(roll).append(", fName=")
				.append(fName).append(", lName=").append(lName).append(", email=").append(email).append(", pass=")
				.append(pass).append(", dob=").append(dob).append(", mobileNumber=").append(mobileNumber)
				.append(", gender=").append(gender).append(", cityId=").append(cityId).append(", currentTime=")
				.append(currentTime).append(", totalAmount=").append(totalAmount).append("]");
		return builder.toString();
	}
	
	
}
