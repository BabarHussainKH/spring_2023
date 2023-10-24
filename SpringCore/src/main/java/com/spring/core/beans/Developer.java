package com.spring.core.beans;

import java.util.List;

public class Developer {
	private int id;
	private String name;
	private String email;
	private Address address;
	private List<String> langs;

	public Developer() {
	}

	public Developer(int id, String name, String email) {
		super();
		System.out.println("== Developer  - 3 args constructor called");
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Developer(int id, String name, String email, Address address, List<String> langs) {
		super();
		System.out.println("== Developer  - 5 args constructor called");
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.langs = langs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getLangs() {
		return langs;
	}

	public void setLangs(List<String> langs) {
		this.langs = langs;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", email=" + email + ", \naddress=" + address + ", \nlangs="
				+ langs + "]";
	}

}
