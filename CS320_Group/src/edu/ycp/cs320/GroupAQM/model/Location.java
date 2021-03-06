package edu.ycp.cs320.GroupAQM.model;


public class Location{
	
	private String coordinates;
	private String city, state, country;
	private int location_id;
	
	public Location() {

	  }
	

	public void setCoordinates(Object coordinates) {
		this.coordinates = (String) coordinates;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setLocationID(int location_id) {
		this.location_id = location_id;
	}
	
	public String getCoordinates() {
		return coordinates;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getLocationID() {
		return location_id;
	}
}