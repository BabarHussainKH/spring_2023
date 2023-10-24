package com.spring.core.beans;

public class Address {

	private int zipCode;
	private String country;
	private String state;
	private String city;
	private String area;
	private String street;

	public Address() {
	}

	public Address(int zipCode, String country, String state, String city, String area, String street) {
		super();
		this.zipCode = zipCode;
		this.country = country;
		this.state = state;
		this.city = city;
		this.area = area;
		this.street = street;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public String getStreet() {
		return street;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", area=" + area + ", street=" + street + "]";
	}

}
