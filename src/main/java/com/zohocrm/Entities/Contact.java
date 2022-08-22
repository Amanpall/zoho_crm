package com.zohocrm.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacts")
public class Contact {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private long id;
@Column(name = "first_name",nullable = false,length =45 )
private String FirstName;
@Column(name = "last_name",nullable = false,length =45 )
private String LastName;
@Column(name = "email",nullable = false,length =45 ,unique = true)
private String Email;
@Column(name = "lead_source",nullable = false,length =45 )
private String LeadSource;
@Column(name = "Mobile_Number",nullable = false,length =10,unique =true )
private long Mobile;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getLeadSource() {
	return LeadSource;
}
public void setLeadSource(String leadSource) {
	LeadSource = leadSource;
}
public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}

}
