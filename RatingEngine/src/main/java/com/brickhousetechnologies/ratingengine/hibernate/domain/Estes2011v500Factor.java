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
@Table(name = "estes2011v500factor")
public class Estes2011v500Factor implements Serializable{
	@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "FactorTable")
     public int FactorTable;
     @Column( name = "WeightGroup")
     public String WeightGroup;
     @Column( name = "Class500")
     public int Class500;
     @Column( name = "Class400")
     public int Class400;
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
	public String getWeightGroup() {
		return WeightGroup;
	}
	public void setWeightGroup(String weightGroup) {
		WeightGroup = weightGroup;
	}
	public int getClass500() {
		return Class500;
	}
	public void setClass500(int class500) {
		Class500 = class500;
	}
	public int getClass400() {
		return Class400;
	}
	public void setClass400(int class400) {
		Class400 = class400;
	}
	public int getClass300() {
		return Class300;
	}
	public void setClass300(int class300) {
		Class300 = class300;
	}
	public int getClass250() {
		return Class250;
	}
	public void setClass250(int class250) {
		Class250 = class250;
	}
	public int getClass200() {
		return Class200;
	}
	public void setClass200(int class200) {
		Class200 = class200;
	}
	public int getClass175() {
		return Class175;
	}
	public void setClass175(int class175) {
		Class175 = class175;
	}
	public int getClass150() {
		return Class150;
	}
	public void setClass150(int class150) {
		Class150 = class150;
	}
	public int getClass125() {
		return Class125;
	}
	public void setClass125(int class125) {
		Class125 = class125;
	}
	public int getClass110() {
		return Class110;
	}
	public void setClass110(int class110) {
		Class110 = class110;
	}
	public int getClass100() {
		return Class100;
	}
	public void setClass100(int class100) {
		Class100 = class100;
	}
	public int getClass92() {
		return Class92;
	}
	public void setClass92(int class92) {
		Class92 = class92;
	}
	public int getClass85() {
		return Class85;
	}
	public void setClass85(int class85) {
		Class85 = class85;
	}
	public int getClass77() {
		return Class77;
	}
	public void setClass77(int class77) {
		Class77 = class77;
	}
	public int getClass70() {
		return Class70;
	}
	public void setClass70(int class70) {
		Class70 = class70;
	}
	public int getClass65() {
		return Class65;
	}
	public void setClass65(int class65) {
		Class65 = class65;
	}
	public int getClass60() {
		return Class60;
	}
	public void setClass60(int class60) {
		Class60 = class60;
	}
	public int getClass55() {
		return Class55;
	}
	public void setClass55(int class55) {
		Class55 = class55;
	}
	public int getClass50() {
		return Class50;
	}
	public void setClass50(int class50) {
		Class50 = class50;
	}
	@Column( name = "Class300")
     public int Class300;
     @Column( name = "Class250")
     public int Class250;
     @Column( name = "Class200")
     public int Class200;
     @Column( name = "Class175")
     public int Class175;
     @Column( name = "Class150")
     public int Class150;
     @Column( name = "Class125")
     public int Class125;
     @Column( name = "Class110")
     public int Class110;
     @Column( name = "Class100")
     public int Class100;
     @Column( name = "Class92")
     public int Class92;
     @Column( name = "Class85")
     public int Class85;
     @Column( name = "Class77")
     public int Class77;
     @Column( name = "Class70")
     public int Class70;
     @Column( name = "Class65")
     public int Class65;
     @Column( name = "Class60")
     public int Class60;
     @Column( name = "Class55")
     public int Class55;
     @Column( name = "Class50")
     public int Class50;
}