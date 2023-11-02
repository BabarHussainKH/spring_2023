package com.spring.core.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dev")
@Scope("prototype")
public class Developer {
	private int id;
	@Value("Asif")
	private String name;
	private String email;
//	@Autowired
//	@Qualifier("address11")
	private Address address;
	private Set<String> langs;
//	@Autowired
	private Experience experience;

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Developer() {
	}

//	@Autowired(required = false)
	public Developer(int id, String name, String email) {
		super();
		System.out.println("== Developer  - 3 args constructor called: " + this.getName());
		this.id = id;
		this.name = name;
		this.email = email;
	}

//	@Autowired
//	public Developer(int id, String name, String email, Set<String> langs) {
//		super();
////		System.out.println("== Developer  - 4 args constructor called: " + this.getName());
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.langs = langs;
//	}

//	@Autowired(required = false)
	public Developer(int id, String name, String email, Set<String> langs, Address address) {
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

//	@Autowired
//	@Qualifier(value = "address11")
	public void setAddress(Address address) {
		System.out.println("by setAddress: " + this.getName());
		this.address = address;
	}

	public Set<String> getLangs() {
		return langs;
	}

	public void setLangs(Set<String> langs) {
		this.langs = langs;
	}

	@Override
	public String toString() {
		return "\nDeveloper [id=" + id + ", name=" + name + ", email=" + email + ", \naddress=" + address + ", \nlangs="
				+ langs + ", \nexperience=" + experience + "]";
	}

}
