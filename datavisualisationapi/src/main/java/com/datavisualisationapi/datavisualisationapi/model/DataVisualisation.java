package com.datavisualisationapi.datavisualisationapi.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "data_visualisation")
public class DataVisualisation {
	
	@Id
	@Column(name="REC_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "R_DATE")
	private Date date;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "District")
	private String district;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Age")
	private int age;
	
	@Column(name = "agegroup")
	private String ageg;
	
	@Column(name = "Caste")
	private String caste;
	
	@Column(name = "Corona")
	private boolean corona;
	
	@Column(name = "TB")
	private boolean tb;

	public DataVisualisation() {

	}

	public DataVisualisation(int id, Date date, String type, String state, String district, String gender, int age,
			String ageg, String caste, boolean corona, boolean tb) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.state = state;
		this.district = district;
		this.gender = gender;
		this.age = age;
		this.ageg = ageg;
		this.caste = caste;
		this.corona = corona;
		this.tb = tb;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataVisualisation [id=").append(id).append(", date=").append(date).append(", type=")
				.append(type).append(", state=").append(state).append(", district=").append(district)
				.append(", gender=").append(gender).append(", age=").append(age).append(", ageg=").append(ageg)
				.append(", caste=").append(caste).append(", corona=").append(corona).append(", tb=").append(tb)
				.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAgeg() {
		return ageg;
	}

	public void setAgeg(String ageg) {
		this.ageg = ageg;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public boolean isCorona() {
		return corona;
	}

	public void setCorona(boolean corona) {
		this.corona = corona;
	}

	public boolean isTb() {
		return tb;
	}

	public void setTb(boolean tb) {
		this.tb = tb;
	}

	}