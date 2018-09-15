package com.online.module.bean;

public  class CityAreaVO {

	private int areaId;
	private String areaName;
	public CityAreaVO() {
		// TODO Auto-generated constructor stub
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityAreaVO [areaId=").append(areaId).append(", areaName=").append(areaName).append("]");
		return builder.toString();
	}
	
	
}
