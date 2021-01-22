package com.xworkz.hibernate.maven;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "car_maven_table")
public class CarMDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@javax.persistence.Id
	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private double Id;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "COST")
	private double cost;

	public CarMDTO(String model, String company, int cost) {
		super();
		this.model = model;
		this.company = company;
		this.cost = cost;
	}
	

	public double getId() {
		return Id;
	}


	public void setId(double id) {
		Id = id;
	}


	public CarMDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "CarMDTO [model=" + model + ", company=" + company + ", cost=" + cost + "]";
	}

}
