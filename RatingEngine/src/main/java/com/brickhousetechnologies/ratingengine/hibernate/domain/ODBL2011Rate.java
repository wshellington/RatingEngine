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
@Table(name = "odbl2011rate")
public class ODBL2011Rate implements Serializable{
@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "Agent")
     public String Agent;
     @Column( name = "TariffNum")
     public String TariffNum;
     @Column( name = "TariffSuf")
     public String TariffSuf;
     @Column( name = "LowRBN")
     public int LowRBN;
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
	public String getTariffNum() {
		return TariffNum;
	}
	public void setTariffNum(String tariffNum) {
		TariffNum = tariffNum;
	}
	public String getTariffSuf() {
		return TariffSuf;
	}
	public void setTariffSuf(String tariffSuf) {
		TariffSuf = tariffSuf;
	}
	public int getLowRBN() {
		return LowRBN;
	}
	public void setLowRBN(int lowRBN) {
		LowRBN = lowRBN;
	}
	public int getHiRBN() {
		return HiRBN;
	}
	public void setHiRBN(int hiRBN) {
		HiRBN = hiRBN;
	}
	public int getClassInfo() {
		return ClassInfo;
	}
	public void setClassInfo(int classInfo) {
		ClassInfo = classInfo;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public int getDate() {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	public String getWeightCode() {
		return WeightCode;
	}
	public void setWeightCode(String weightCode) {
		WeightCode = weightCode;
	}
	@Column( name = "HiRBN")
     public int HiRBN;
     @Column( name = "ClassInfo")
     public int ClassInfo;
     @Column( name = "Rate")
     public int Rate;
     @Column( name = "Date")
     public int Date;
     @Column( name = "WeightCode")
     public String WeightCode;
}