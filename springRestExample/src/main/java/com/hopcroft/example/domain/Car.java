package com.hopcroft.example.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// Las notaciones de javax son necesarias para devolver la vista en formato XML.
@XmlRootElement(name = "car")
public class Car {
	private String brand;
	private String model;
	private int year;
	private long prize;
	public String getBrand() {
		return brand;
	}
	@XmlElement
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	@XmlElement
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	@XmlElement
	public void setYear(int year) {
		this.year = year;
	}
	public long getPrize() {
		return prize;
	}
	@XmlElement
	public void setPrize(long prize) {
		this.prize = prize;
	}
}
