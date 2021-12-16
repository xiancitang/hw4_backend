package com.swe642.hw4.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO class, represent Student table in database, STUDENTID is primary key, 
// each attribute corresponding to a table column; each instance is a row
@Entity
@Table(name="student",schema="XTANG7")
public class Student {
	@Id
	private String studentid;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "dateofsurvey")
	private Date dateofsurvey;
	@Column(name = "highschoolmonth")
	private String highschoolmonth;
	@Column(name = "highschoolyea")
	private String highschoolyear;
	@Column(name = "thingslikegmu")
	private String thingslikegmu;
	@Column(name = "waytoknowgmu")
	private String waytoknowgmu;
	@Column(name = "recommend")
	private String recommend;
	@Column(name = "comments")
	private String comments;
	
	
	public Student() {

	}

	public Student(String studentid, String firstName,String lastName,String email,String phone,String address,String city,String state,String zipcode
			,Date dateofsurvey,String highschoolmonth,String highschoolyear,String thingslikegmu,String waytoknowgmu,String recommend,String comments) {
		this.studentid = studentid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.dateofsurvey=dateofsurvey;
		this.highschoolmonth=highschoolmonth;
		this.highschoolyear=highschoolyear;
		this.thingslikegmu=thingslikegmu;
		this.waytoknowgmu=waytoknowgmu;
		this.recommend=recommend;
		this.comments=comments;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getDateofsurvey() {
		return dateofsurvey;
	}
	public void setDateofsurvey(java.util.Date dateofsurvey2) {
		this.dateofsurvey = (java.util.Date) dateofsurvey2;
	}
	public String getHighschoolmonth() {
		return highschoolmonth;
	}
	public void setHighschoolmonth(String highschoolmonth) {
		this.highschoolmonth = highschoolmonth;
	}
	public String getHighschoolyear() {
		return highschoolyear;
	}
	public void setHighschoolyear(String highschoolyear) {
		this.highschoolyear = highschoolyear;
	}
	public String getWaytoknowgmu() {
		return waytoknowgmu;
	}
	public void setWaytoknowgmu(String waytoknowgmu) {
		this.waytoknowgmu = waytoknowgmu;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comment) {
		this.comments = comment;
	}

	public String getThingslikegmu() {
		return this.thingslikegmu;
	}

	public void setThingslikegmu(String thingslikegmu2) {
		
		this.thingslikegmu=thingslikegmu2;
	}

}
