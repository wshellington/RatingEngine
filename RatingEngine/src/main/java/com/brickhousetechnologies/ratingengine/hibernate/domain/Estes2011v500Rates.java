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
@Table(name = "estes2011v500rates")
public class Estes2011v500Rates implements Serializable{
	@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "FactorTable")
     public int FactorTable;
     @Column( name = "RBN")
     public int RBN;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getFactorTable() {
		return FactorTable;
	}
	public void setFactorTable(int factorTable) {
		FactorTable = factorTable;
	}
	public int getRBN() {
		return RBN;
	}
	public void setRBN(int rBN) {
		RBN = rBN;
	}
	public int getMinCharge() {
		return MinCharge;
	}
	public void setMinCharge(int minCharge) {
		MinCharge = minCharge;
	}
	public int getL5C() {
		return L5C;
	}
	public void setL5C(int l5c) {
		L5C = l5c;
	}
	public int getM5C() {
		return M5C;
	}
	public void setM5C(int m5c) {
		M5C = m5c;
	}
	public int getM1M() {
		return M1M;
	}
	public void setM1M(int m1m) {
		M1M = m1m;
	}
	public int getM2M() {
		return M2M;
	}
	public void setM2M(int m2m) {
		M2M = m2m;
	}
	public int getM5M() {
		return M5M;
	}
	public void setM5M(int m5m) {
		M5M = m5m;
	}
	public int getM10M() {
		return M10M;
	}
	public void setM10M(int m10m) {
		M10M = m10m;
	}
	public int getM20M() {
		return M20M;
	}
	public void setM20M(int m20m) {
		M20M = m20m;
	}
	public int getM30M() {
		return M30M;
	}
	public void setM30M(int m30m) {
		M30M = m30m;
	}
	public int getM40M() {
		return M40M;
	}
	public void setM40M(int m40m) {
		M40M = m40m;
	}
	@Column( name = "MinCharge")
     public int MinCharge;
     @Column( name = "L5C")
     public int L5C;
     @Column( name = "M5C")
     public int M5C;
     @Column( name = "M1M")
     public int M1M;
     @Column( name = "M2M")
     public int M2M;
     @Column( name = "M5M")
     public int M5M;
     @Column( name = "M10M")
     public int M10M;
     @Column( name = "M20M")
     public int M20M;
     @Column( name = "M30M")
     public int M30M;
     @Column( name = "M40M")
     public int M40M;
}