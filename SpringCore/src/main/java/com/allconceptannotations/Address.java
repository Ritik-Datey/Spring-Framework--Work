package com.allconceptannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String country;
	private String state;
	private String city;
	private int pincode;

	public Address(@Value("India") String country, @Value("Maharashtra") String state, @Value("Nagpur") String city, @Value("440008") int pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
