package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="First_Name")
	private String firstname;
	
	@Column(name="Last_Name")
	private String lastname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="PhNum")
	private String phNumber;
	
	@Column(name="CardNum")
	private int cardnum;
	
	@Column(name="Total_balance")
	private int total_balance;
	
	
	public user(){
		
	}
	
	public user(int id, String firstname, String lastname, String email, String password, String address,
			String phNumber, int cardnum, int totalbalance) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phNumber = phNumber;
		this.cardnum = cardnum;
		total_balance = totalbalance;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public int getCardnum() {
		return cardnum;
	}
	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}

	public int getTotal_balance() {
		return total_balance;
	}

	public void setTotal_balance(int totalbalance) {
		total_balance = totalbalance;
	}
	
	public int add(int tb,int amount){
		 tb = total_balance + amount;
		 setTotal_balance(tb);
		 return tb;
	}

	public int sub(int tb,int amount){
		 tb = total_balance - amount;
		 setTotal_balance(tb * -1);
		 return tb;
	}
}
