package com.xworkz.house.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "house_table")

public class HouseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "noOfRooms")
	private int noOfRooms;
	@Column(name = "location")
	private String location;
	@Column(name = "noOfFloors")
	private int noOfFloors;
	@Column(name = "sqMeter")
	private int sqMeter;
	
	public HouseDTO() {
		
	}

	public HouseDTO(int id, String name, int noOfRooms, String location, int noOfFloors, int sqMeter) {
		super();
		this.id = id;
		this.name = name;
		this.noOfRooms = noOfRooms;
		this.location = location;
		this.noOfFloors = noOfFloors;
		this.sqMeter = sqMeter;
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

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public int getSqMeter() {
		return sqMeter;
	}

	public void setSqMeter(int sqMeter) {
		this.sqMeter = sqMeter;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", noOfRooms=" + noOfRooms + ", location=" + location
				+ ", noOfFloors=" + noOfFloors + ", sqMeter=" + sqMeter + "]";
	}

	

}
