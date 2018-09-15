package com.online.module.bean;

public class CityVO {

	private int cityId;
	private String cityName;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityVO [cityId=").append(cityId).append(", cityName=").append(cityName).append("]");
		return builder.toString();
	}
	
}
