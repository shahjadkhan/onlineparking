package com.online.module.utils;

public class SQLUtils {
	public static final String REGISTER_USER = "insert into user_info (fname,lname,email"
			+ ",mobileNumber,"
	 		+ "createdDate,dob,cityId,password,gender,roll) values(?,?,?,?,?,?,?,?,?,?)";
	public static final String CREATE_USER_WOLET = "insert into userwolet (totalAmount,userId) values(?,?)";
	 public static final String SELECT_USER_CITY = "SELECT city_id,city_name FROM cities";
	 public static final String SLECT_CITY_AREA = "select area_id,area_name from cityarea where city_id=?";
}
