package com.brickhousetechnologies.ratingengine.hibernate.domain;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name = "odbl2011zipcode")
public class ODBL2011ZipCode implements Serializable{
@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "Agent")
     public String Agent;
     @Column( name = "ZipCode1")
     public String ZipCode1;
     @Column( name = "HiZipCode1")
     public String HiZipCode1;
     @Column( name = "ZipCode2")
     public String ZipCode2;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAgent() {
		return Agent;
	}
	public void setAgent(String agent) {
		Agent = agent;
	}
	public String getZipCode1() {
		return ZipCode1;
	}
	public void setZipCode1(String zipCode1) {
		ZipCode1 = zipCode1;
	}
	public String getHiZipCode1() {
		return HiZipCode1;
	}
	public void setHiZipCode1(String hiZipCode1) {
		HiZipCode1 = hiZipCode1;
	}
	public String getZipCode2() {
		return ZipCode2;
	}
	public void setZipCode2(String zipCode2) {
		ZipCode2 = zipCode2;
	}
	public String getHiZipCode2() {
		return HiZipCode2;
	}
	public void setHiZipCode2(String hiZipCode2) {
		HiZipCode2 = hiZipCode2;
	}
	public int getRBN() {
		return RBN;
	}
	public void setRBN(int rBN) {
		RBN = rBN;
	}
	@Column( name = "HiZipCode2")
     public String HiZipCode2;
     @Column( name = "RBN")
     public int RBN;
}