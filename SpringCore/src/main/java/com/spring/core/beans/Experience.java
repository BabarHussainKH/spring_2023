package com.spring.core.beans;

public class Experience {
	private int compId;
	private int total;
	private String title;
	private String city;
	private String country;
	private String designation;
	private boolean onsite;

	public Experience() {
	}

	public Experience(int compId, int total, String title, String city, String country, String designation,
			boolean onsite) {
		super();
		this.compId = compId;
		this.total = total;
		this.title = title;
		this.city = city;
		this.country = country;
		this.designation = designation;
		this.onsite = onsite;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isOnsite() {
		return onsite;
	}

	public void setOnsite(boolean onsite) {
		this.onsite = onsite;
	}

	@Override
	public String toString() {
		return "Experience [compId=" + compId + ", total=" + total + ", title=" + title + ", city=" + city
				+ ", country=" + country + ", designation=" + designation + ", onsite=" + onsite + "]";
	}

}
