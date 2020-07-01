package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etransaction")
public class ETransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tid")
	private int id;
	@Column(name="SenderName")
	private String sendername;
	@Column(name="ReceiverName")
	private String receivername;
	@Column(name="CreditCard")
	private int creditcard;
	@Column(name="Amount")
	private int amount;
	@Column(name="Sid")
	private int sid;
	@Column(name="Rid")
	private int rid;
	
	public ETransaction() {
		super();
		
	}
	
	public ETransaction(int id, String sendername, String receivername, int creditcard, int amount) {
		super();
		this.id = id;
		this.sendername = sendername;
		this.receivername = receivername;
		this.creditcard = creditcard;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public int getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}
	
}

