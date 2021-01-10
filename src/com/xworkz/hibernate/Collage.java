package com.xworkz.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collage")
public class Collage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")

	private int id;
	@Column(name = "cname")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "no_of_students")
	private int noOfStudent;
	@Column(name = "no_of_rooms")
	private int noOfRoom;
	@Column(name = "no_of_branches")
	private int noOfBranches;

	public Collage() {
		System.out.println(this.getClass().getSimpleName() + "Default constructor");
	}

	public Collage(int id, String name, String location, int noOfStudent, int noOfRoom, int noOfBranches) {
		super();
		this.id = id;

		this.name = name;
		this.location = location;
		this.noOfStudent = noOfStudent;
		this.noOfRoom = noOfRoom;
		this.noOfBranches = noOfBranches;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public int getNoOfRoom() {
		return noOfRoom;
	}

	public void setNoOfRoom(int noOfRoom) {
		this.noOfRoom = noOfRoom;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudent=" + noOfStudent
				+ ", noOfRoom=" + noOfRoom + ", noOfBranches=" + noOfBranches + "]";
	}

}
