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
@Table(name = "estes2011v500adjust")
public class Estes2011v500Adjust implements Serializable{
	@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "AdjustmentCode")
     public int AdjustmentCode;
     @Column( name = "MinAdjustType")
     public int MinAdjustType;
     @Column( name = "RateAdjustType")
     public int RateAdjustType;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAdjustmentCode() {
		return AdjustmentCode;
	}
	public void setAdjustmentCode(int adjustmentCode) {
		AdjustmentCode = adjustmentCode;
	}
	public int getMinAdjustType() {
		return MinAdjustType;
	}
	public void setMinAdjustType(int minAdjustType) {
		MinAdjustType = minAdjustType;
	}
	public int getRateAdjustType() {
		return RateAdjustType;
	}
	public void setRateAdjustType(int rateAdjustType) {
		RateAdjustType = rateAdjustType;
	}
	public int getAppCode() {
		return AppCode;
	}
	public void setAppCode(int appCode) {
		AppCode = appCode;
	}
	public int getMinAdjust() {
		return MinAdjust;
	}
	public void setMinAdjust(int minAdjust) {
		MinAdjust = minAdjust;
	}
	public int getL5CClass500() {
		return L5CClass500;
	}
	public void setL5CClass500(int l5cClass500) {
		L5CClass500 = l5cClass500;
	}
	public int getM5CClass500() {
		return M5CClass500;
	}
	public void setM5CClass500(int m5cClass500) {
		M5CClass500 = m5cClass500;
	}
	public int getM1MClass500() {
		return M1MClass500;
	}
	public void setM1MClass500(int m1mClass500) {
		M1MClass500 = m1mClass500;
	}
	public int getM2MClass500() {
		return M2MClass500;
	}
	public void setM2MClass500(int m2mClass500) {
		M2MClass500 = m2mClass500;
	}
	public int getM5MClass500() {
		return M5MClass500;
	}
	public void setM5MClass500(int m5mClass500) {
		M5MClass500 = m5mClass500;
	}
	public int getM10MClass500() {
		return M10MClass500;
	}
	public void setM10MClass500(int m10mClass500) {
		M10MClass500 = m10mClass500;
	}
	public int getM20MClass500() {
		return M20MClass500;
	}
	public void setM20MClass500(int m20mClass500) {
		M20MClass500 = m20mClass500;
	}
	public int getM30MClass500() {
		return M30MClass500;
	}
	public void setM30MClass500(int m30mClass500) {
		M30MClass500 = m30mClass500;
	}
	public int getM40MClass500() {
		return M40MClass500;
	}
	public void setM40MClass500(int m40mClass500) {
		M40MClass500 = m40mClass500;
	}
	public int getL5CClass400() {
		return L5CClass400;
	}
	public void setL5CClass400(int l5cClass400) {
		L5CClass400 = l5cClass400;
	}
	public int getM5CClass400() {
		return M5CClass400;
	}
	public void setM5CClass400(int m5cClass400) {
		M5CClass400 = m5cClass400;
	}
	public int getM1MClass400() {
		return M1MClass400;
	}
	public void setM1MClass400(int m1mClass400) {
		M1MClass400 = m1mClass400;
	}
	public int getM2MClass400() {
		return M2MClass400;
	}
	public void setM2MClass400(int m2mClass400) {
		M2MClass400 = m2mClass400;
	}
	public int getM5MClass400() {
		return M5MClass400;
	}
	public void setM5MClass400(int m5mClass400) {
		M5MClass400 = m5mClass400;
	}
	public int getM10MClass400() {
		return M10MClass400;
	}
	public void setM10MClass400(int m10mClass400) {
		M10MClass400 = m10mClass400;
	}
	public int getM20MClass400() {
		return M20MClass400;
	}
	public void setM20MClass400(int m20mClass400) {
		M20MClass400 = m20mClass400;
	}
	public int getM30MClass400() {
		return M30MClass400;
	}
	public void setM30MClass400(int m30mClass400) {
		M30MClass400 = m30mClass400;
	}
	public int getM40MClass400() {
		return M40MClass400;
	}
	public void setM40MClass400(int m40mClass400) {
		M40MClass400 = m40mClass400;
	}
	public int getL5CClass300() {
		return L5CClass300;
	}
	public void setL5CClass300(int l5cClass300) {
		L5CClass300 = l5cClass300;
	}
	public int getM5CClass300() {
		return M5CClass300;
	}
	public void setM5CClass300(int m5cClass300) {
		M5CClass300 = m5cClass300;
	}
	public int getM1MClass300() {
		return M1MClass300;
	}
	public void setM1MClass300(int m1mClass300) {
		M1MClass300 = m1mClass300;
	}
	public int getM2MClass300() {
		return M2MClass300;
	}
	public void setM2MClass300(int m2mClass300) {
		M2MClass300 = m2mClass300;
	}
	public int getM5MClass300() {
		return M5MClass300;
	}
	public void setM5MClass300(int m5mClass300) {
		M5MClass300 = m5mClass300;
	}
	public int getM10MClass300() {
		return M10MClass300;
	}
	public void setM10MClass300(int m10mClass300) {
		M10MClass300 = m10mClass300;
	}
	public int getM20MClass300() {
		return M20MClass300;
	}
	public void setM20MClass300(int m20mClass300) {
		M20MClass300 = m20mClass300;
	}
	public int getM30MClass300() {
		return M30MClass300;
	}
	public void setM30MClass300(int m30mClass300) {
		M30MClass300 = m30mClass300;
	}
	public int getM40MClass300() {
		return M40MClass300;
	}
	public void setM40MClass300(int m40mClass300) {
		M40MClass300 = m40mClass300;
	}
	public int getL5CClass250() {
		return L5CClass250;
	}
	public void setL5CClass250(int l5cClass250) {
		L5CClass250 = l5cClass250;
	}
	public int getM5CClass250() {
		return M5CClass250;
	}
	public void setM5CClass250(int m5cClass250) {
		M5CClass250 = m5cClass250;
	}
	public int getM1MClass250() {
		return M1MClass250;
	}
	public void setM1MClass250(int m1mClass250) {
		M1MClass250 = m1mClass250;
	}
	public int getM2MClass250() {
		return M2MClass250;
	}
	public void setM2MClass250(int m2mClass250) {
		M2MClass250 = m2mClass250;
	}
	public int getM5MClass250() {
		return M5MClass250;
	}
	public void setM5MClass250(int m5mClass250) {
		M5MClass250 = m5mClass250;
	}
	public int getM10MClass250() {
		return M10MClass250;
	}
	public void setM10MClass250(int m10mClass250) {
		M10MClass250 = m10mClass250;
	}
	public int getM20MClass250() {
		return M20MClass250;
	}
	public void setM20MClass250(int m20mClass250) {
		M20MClass250 = m20mClass250;
	}
	public int getM30MClass250() {
		return M30MClass250;
	}
	public void setM30MClass250(int m30mClass250) {
		M30MClass250 = m30mClass250;
	}
	public int getM40MClass250() {
		return M40MClass250;
	}
	public void setM40MClass250(int m40mClass250) {
		M40MClass250 = m40mClass250;
	}
	public int getL5CClass200() {
		return L5CClass200;
	}
	public void setL5CClass200(int l5cClass200) {
		L5CClass200 = l5cClass200;
	}
	public int getM5CClass200() {
		return M5CClass200;
	}
	public void setM5CClass200(int m5cClass200) {
		M5CClass200 = m5cClass200;
	}
	public int getM1MClass200() {
		return M1MClass200;
	}
	public void setM1MClass200(int m1mClass200) {
		M1MClass200 = m1mClass200;
	}
	public int getM2MClass200() {
		return M2MClass200;
	}
	public void setM2MClass200(int m2mClass200) {
		M2MClass200 = m2mClass200;
	}
	public int getM5MClass200() {
		return M5MClass200;
	}
	public void setM5MClass200(int m5mClass200) {
		M5MClass200 = m5mClass200;
	}
	public int getM10MClass200() {
		return M10MClass200;
	}
	public void setM10MClass200(int m10mClass200) {
		M10MClass200 = m10mClass200;
	}
	public int getM20MClass200() {
		return M20MClass200;
	}
	public void setM20MClass200(int m20mClass200) {
		M20MClass200 = m20mClass200;
	}
	public int getM30MClass200() {
		return M30MClass200;
	}
	public void setM30MClass200(int m30mClass200) {
		M30MClass200 = m30mClass200;
	}
	public int getM40MClass200() {
		return M40MClass200;
	}
	public void setM40MClass200(int m40mClass200) {
		M40MClass200 = m40mClass200;
	}
	public int getL5CClass175() {
		return L5CClass175;
	}
	public void setL5CClass175(int l5cClass175) {
		L5CClass175 = l5cClass175;
	}
	public int getM5CClass175() {
		return M5CClass175;
	}
	public void setM5CClass175(int m5cClass175) {
		M5CClass175 = m5cClass175;
	}
	public int getM1MClass175() {
		return M1MClass175;
	}
	public void setM1MClass175(int m1mClass175) {
		M1MClass175 = m1mClass175;
	}
	public int getM2MClass175() {
		return M2MClass175;
	}
	public void setM2MClass175(int m2mClass175) {
		M2MClass175 = m2mClass175;
	}
	public int getM5MClass175() {
		return M5MClass175;
	}
	public void setM5MClass175(int m5mClass175) {
		M5MClass175 = m5mClass175;
	}
	public int getM10MClass175() {
		return M10MClass175;
	}
	public void setM10MClass175(int m10mClass175) {
		M10MClass175 = m10mClass175;
	}
	public int getM20MClass175() {
		return M20MClass175;
	}
	public void setM20MClass175(int m20mClass175) {
		M20MClass175 = m20mClass175;
	}
	public int getM30MClass175() {
		return M30MClass175;
	}
	public void setM30MClass175(int m30mClass175) {
		M30MClass175 = m30mClass175;
	}
	public int getM40MClass175() {
		return M40MClass175;
	}
	public void setM40MClass175(int m40mClass175) {
		M40MClass175 = m40mClass175;
	}
	public int getL5CClass150() {
		return L5CClass150;
	}
	public void setL5CClass150(int l5cClass150) {
		L5CClass150 = l5cClass150;
	}
	public int getM5CClass150() {
		return M5CClass150;
	}
	public void setM5CClass150(int m5cClass150) {
		M5CClass150 = m5cClass150;
	}
	public int getM1MClass150() {
		return M1MClass150;
	}
	public void setM1MClass150(int m1mClass150) {
		M1MClass150 = m1mClass150;
	}
	public int getM2MClass150() {
		return M2MClass150;
	}
	public void setM2MClass150(int m2mClass150) {
		M2MClass150 = m2mClass150;
	}
	public int getM5MClass150() {
		return M5MClass150;
	}
	public void setM5MClass150(int m5mClass150) {
		M5MClass150 = m5mClass150;
	}
	public int getM10MClass150() {
		return M10MClass150;
	}
	public void setM10MClass150(int m10mClass150) {
		M10MClass150 = m10mClass150;
	}
	public int getM20MClass150() {
		return M20MClass150;
	}
	public void setM20MClass150(int m20mClass150) {
		M20MClass150 = m20mClass150;
	}
	public int getM30MClass150() {
		return M30MClass150;
	}
	public void setM30MClass150(int m30mClass150) {
		M30MClass150 = m30mClass150;
	}
	public int getM40MClass150() {
		return M40MClass150;
	}
	public void setM40MClass150(int m40mClass150) {
		M40MClass150 = m40mClass150;
	}
	public int getL5CClass125() {
		return L5CClass125;
	}
	public void setL5CClass125(int l5cClass125) {
		L5CClass125 = l5cClass125;
	}
	public int getM5CClass125() {
		return M5CClass125;
	}
	public void setM5CClass125(int m5cClass125) {
		M5CClass125 = m5cClass125;
	}
	public int getM1MClass125() {
		return M1MClass125;
	}
	public void setM1MClass125(int m1mClass125) {
		M1MClass125 = m1mClass125;
	}
	public int getM2MClass125() {
		return M2MClass125;
	}
	public void setM2MClass125(int m2mClass125) {
		M2MClass125 = m2mClass125;
	}
	public int getM5MClass125() {
		return M5MClass125;
	}
	public void setM5MClass125(int m5mClass125) {
		M5MClass125 = m5mClass125;
	}
	public int getM10MClass125() {
		return M10MClass125;
	}
	public void setM10MClass125(int m10mClass125) {
		M10MClass125 = m10mClass125;
	}
	public int getM20MClass125() {
		return M20MClass125;
	}
	public void setM20MClass125(int m20mClass125) {
		M20MClass125 = m20mClass125;
	}
	public int getM30MClass125() {
		return M30MClass125;
	}
	public void setM30MClass125(int m30mClass125) {
		M30MClass125 = m30mClass125;
	}
	public int getM40MClass125() {
		return M40MClass125;
	}
	public void setM40MClass125(int m40mClass125) {
		M40MClass125 = m40mClass125;
	}
	public int getL5CClass110() {
		return L5CClass110;
	}
	public void setL5CClass110(int l5cClass110) {
		L5CClass110 = l5cClass110;
	}
	public int getM5CClass110() {
		return M5CClass110;
	}
	public void setM5CClass110(int m5cClass110) {
		M5CClass110 = m5cClass110;
	}
	public int getM1MClass110() {
		return M1MClass110;
	}
	public void setM1MClass110(int m1mClass110) {
		M1MClass110 = m1mClass110;
	}
	public int getM2MClass110() {
		return M2MClass110;
	}
	public void setM2MClass110(int m2mClass110) {
		M2MClass110 = m2mClass110;
	}
	public int getM5MClass110() {
		return M5MClass110;
	}
	public void setM5MClass110(int m5mClass110) {
		M5MClass110 = m5mClass110;
	}
	public int getM10MClass110() {
		return M10MClass110;
	}
	public void setM10MClass110(int m10mClass110) {
		M10MClass110 = m10mClass110;
	}
	public int getM20MClass110() {
		return M20MClass110;
	}
	public void setM20MClass110(int m20mClass110) {
		M20MClass110 = m20mClass110;
	}
	public int getM30MClass110() {
		return M30MClass110;
	}
	public void setM30MClass110(int m30mClass110) {
		M30MClass110 = m30mClass110;
	}
	public int getM40MClass110() {
		return M40MClass110;
	}
	public void setM40MClass110(int m40mClass110) {
		M40MClass110 = m40mClass110;
	}
	public int getL5CClass100() {
		return L5CClass100;
	}
	public void setL5CClass100(int l5cClass100) {
		L5CClass100 = l5cClass100;
	}
	public int getM5CClass100() {
		return M5CClass100;
	}
	public void setM5CClass100(int m5cClass100) {
		M5CClass100 = m5cClass100;
	}
	public int getM1MClass100() {
		return M1MClass100;
	}
	public void setM1MClass100(int m1mClass100) {
		M1MClass100 = m1mClass100;
	}
	public int getM2MClass100() {
		return M2MClass100;
	}
	public void setM2MClass100(int m2mClass100) {
		M2MClass100 = m2mClass100;
	}
	public int getM5MClass100() {
		return M5MClass100;
	}
	public void setM5MClass100(int m5mClass100) {
		M5MClass100 = m5mClass100;
	}
	public int getM10MClass100() {
		return M10MClass100;
	}
	public void setM10MClass100(int m10mClass100) {
		M10MClass100 = m10mClass100;
	}
	public int getM20MClass100() {
		return M20MClass100;
	}
	public void setM20MClass100(int m20mClass100) {
		M20MClass100 = m20mClass100;
	}
	public int getM30MClass100() {
		return M30MClass100;
	}
	public void setM30MClass100(int m30mClass100) {
		M30MClass100 = m30mClass100;
	}
	public int getM40MClass100() {
		return M40MClass100;
	}
	public void setM40MClass100(int m40mClass100) {
		M40MClass100 = m40mClass100;
	}
	public int getL5CClass92() {
		return L5CClass92;
	}
	public void setL5CClass92(int l5cClass92) {
		L5CClass92 = l5cClass92;
	}
	public int getM5CClass92() {
		return M5CClass92;
	}
	public void setM5CClass92(int m5cClass92) {
		M5CClass92 = m5cClass92;
	}
	public int getM1MClass92() {
		return M1MClass92;
	}
	public void setM1MClass92(int m1mClass92) {
		M1MClass92 = m1mClass92;
	}
	public int getM2MClass92() {
		return M2MClass92;
	}
	public void setM2MClass92(int m2mClass92) {
		M2MClass92 = m2mClass92;
	}
	public int getM5MClass92() {
		return M5MClass92;
	}
	public void setM5MClass92(int m5mClass92) {
		M5MClass92 = m5mClass92;
	}
	public int getM10MClass92() {
		return M10MClass92;
	}
	public void setM10MClass92(int m10mClass92) {
		M10MClass92 = m10mClass92;
	}
	public int getM20MClass92() {
		return M20MClass92;
	}
	public void setM20MClass92(int m20mClass92) {
		M20MClass92 = m20mClass92;
	}
	public int getM30MClass92() {
		return M30MClass92;
	}
	public void setM30MClass92(int m30mClass92) {
		M30MClass92 = m30mClass92;
	}
	public int getM40MClass92() {
		return M40MClass92;
	}
	public void setM40MClass92(int m40mClass92) {
		M40MClass92 = m40mClass92;
	}
	public int getL5CClass85() {
		return L5CClass85;
	}
	public void setL5CClass85(int l5cClass85) {
		L5CClass85 = l5cClass85;
	}
	public int getM5CClass85() {
		return M5CClass85;
	}
	public void setM5CClass85(int m5cClass85) {
		M5CClass85 = m5cClass85;
	}
	public int getM1MClass85() {
		return M1MClass85;
	}
	public void setM1MClass85(int m1mClass85) {
		M1MClass85 = m1mClass85;
	}
	public int getM2MClass85() {
		return M2MClass85;
	}
	public void setM2MClass85(int m2mClass85) {
		M2MClass85 = m2mClass85;
	}
	public int getM5MClass85() {
		return M5MClass85;
	}
	public void setM5MClass85(int m5mClass85) {
		M5MClass85 = m5mClass85;
	}
	public int getM10MClass85() {
		return M10MClass85;
	}
	public void setM10MClass85(int m10mClass85) {
		M10MClass85 = m10mClass85;
	}
	public int getM20MClass85() {
		return M20MClass85;
	}
	public void setM20MClass85(int m20mClass85) {
		M20MClass85 = m20mClass85;
	}
	public int getM30MClass85() {
		return M30MClass85;
	}
	public void setM30MClass85(int m30mClass85) {
		M30MClass85 = m30mClass85;
	}
	public int getM40MClass85() {
		return M40MClass85;
	}
	public void setM40MClass85(int m40mClass85) {
		M40MClass85 = m40mClass85;
	}
	public int getL5CClass77() {
		return L5CClass77;
	}
	public void setL5CClass77(int l5cClass77) {
		L5CClass77 = l5cClass77;
	}
	public int getM5CClass77() {
		return M5CClass77;
	}
	public void setM5CClass77(int m5cClass77) {
		M5CClass77 = m5cClass77;
	}
	public int getM1MClass77() {
		return M1MClass77;
	}
	public void setM1MClass77(int m1mClass77) {
		M1MClass77 = m1mClass77;
	}
	public int getM2MClass77() {
		return M2MClass77;
	}
	public void setM2MClass77(int m2mClass77) {
		M2MClass77 = m2mClass77;
	}
	public int getM5MClass77() {
		return M5MClass77;
	}
	public void setM5MClass77(int m5mClass77) {
		M5MClass77 = m5mClass77;
	}
	public int getM10MClass77() {
		return M10MClass77;
	}
	public void setM10MClass77(int m10mClass77) {
		M10MClass77 = m10mClass77;
	}
	public int getM20MClass77() {
		return M20MClass77;
	}
	public void setM20MClass77(int m20mClass77) {
		M20MClass77 = m20mClass77;
	}
	public int getM30MClass77() {
		return M30MClass77;
	}
	public void setM30MClass77(int m30mClass77) {
		M30MClass77 = m30mClass77;
	}
	public int getM40MClass77() {
		return M40MClass77;
	}
	public void setM40MClass77(int m40mClass77) {
		M40MClass77 = m40mClass77;
	}
	public int getL5CClass70() {
		return L5CClass70;
	}
	public void setL5CClass70(int l5cClass70) {
		L5CClass70 = l5cClass70;
	}
	public int getM5CClass70() {
		return M5CClass70;
	}
	public void setM5CClass70(int m5cClass70) {
		M5CClass70 = m5cClass70;
	}
	public int getM1MClass70() {
		return M1MClass70;
	}
	public void setM1MClass70(int m1mClass70) {
		M1MClass70 = m1mClass70;
	}
	public int getM2MClass70() {
		return M2MClass70;
	}
	public void setM2MClass70(int m2mClass70) {
		M2MClass70 = m2mClass70;
	}
	public int getM5MClass70() {
		return M5MClass70;
	}
	public void setM5MClass70(int m5mClass70) {
		M5MClass70 = m5mClass70;
	}
	public int getM10MClass70() {
		return M10MClass70;
	}
	public void setM10MClass70(int m10mClass70) {
		M10MClass70 = m10mClass70;
	}
	public int getM20MClass70() {
		return M20MClass70;
	}
	public void setM20MClass70(int m20mClass70) {
		M20MClass70 = m20mClass70;
	}
	public int getM30MClass70() {
		return M30MClass70;
	}
	public void setM30MClass70(int m30mClass70) {
		M30MClass70 = m30mClass70;
	}
	public int getM40MClass70() {
		return M40MClass70;
	}
	public void setM40MClass70(int m40mClass70) {
		M40MClass70 = m40mClass70;
	}
	public int getL5CClass65() {
		return L5CClass65;
	}
	public void setL5CClass65(int l5cClass65) {
		L5CClass65 = l5cClass65;
	}
	public int getM5CClass65() {
		return M5CClass65;
	}
	public void setM5CClass65(int m5cClass65) {
		M5CClass65 = m5cClass65;
	}
	public int getM1MClass65() {
		return M1MClass65;
	}
	public void setM1MClass65(int m1mClass65) {
		M1MClass65 = m1mClass65;
	}
	public int getM2MClass65() {
		return M2MClass65;
	}
	public void setM2MClass65(int m2mClass65) {
		M2MClass65 = m2mClass65;
	}
	public int getM5MClass65() {
		return M5MClass65;
	}
	public void setM5MClass65(int m5mClass65) {
		M5MClass65 = m5mClass65;
	}
	public int getM10MClass65() {
		return M10MClass65;
	}
	public void setM10MClass65(int m10mClass65) {
		M10MClass65 = m10mClass65;
	}
	public int getM20MClass65() {
		return M20MClass65;
	}
	public void setM20MClass65(int m20mClass65) {
		M20MClass65 = m20mClass65;
	}
	public int getM30MClass65() {
		return M30MClass65;
	}
	public void setM30MClass65(int m30mClass65) {
		M30MClass65 = m30mClass65;
	}
	public int getM40MClass65() {
		return M40MClass65;
	}
	public void setM40MClass65(int m40mClass65) {
		M40MClass65 = m40mClass65;
	}
	public int getL5CClass60() {
		return L5CClass60;
	}
	public void setL5CClass60(int l5cClass60) {
		L5CClass60 = l5cClass60;
	}
	public int getM5CClass60() {
		return M5CClass60;
	}
	public void setM5CClass60(int m5cClass60) {
		M5CClass60 = m5cClass60;
	}
	public int getM1MClass60() {
		return M1MClass60;
	}
	public void setM1MClass60(int m1mClass60) {
		M1MClass60 = m1mClass60;
	}
	public int getM2MClass60() {
		return M2MClass60;
	}
	public void setM2MClass60(int m2mClass60) {
		M2MClass60 = m2mClass60;
	}
	public int getM5MClass60() {
		return M5MClass60;
	}
	public void setM5MClass60(int m5mClass60) {
		M5MClass60 = m5mClass60;
	}
	public int getM10MClass60() {
		return M10MClass60;
	}
	public void setM10MClass60(int m10mClass60) {
		M10MClass60 = m10mClass60;
	}
	public int getM20MClass60() {
		return M20MClass60;
	}
	public void setM20MClass60(int m20mClass60) {
		M20MClass60 = m20mClass60;
	}
	public int getM30MClass60() {
		return M30MClass60;
	}
	public void setM30MClass60(int m30mClass60) {
		M30MClass60 = m30mClass60;
	}
	public int getM40MClass60() {
		return M40MClass60;
	}
	public void setM40MClass60(int m40mClass60) {
		M40MClass60 = m40mClass60;
	}
	public int getL5CClass55() {
		return L5CClass55;
	}
	public void setL5CClass55(int l5cClass55) {
		L5CClass55 = l5cClass55;
	}
	public int getM5CClass55() {
		return M5CClass55;
	}
	public void setM5CClass55(int m5cClass55) {
		M5CClass55 = m5cClass55;
	}
	public int getM1MClass55() {
		return M1MClass55;
	}
	public void setM1MClass55(int m1mClass55) {
		M1MClass55 = m1mClass55;
	}
	public int getM2MClass55() {
		return M2MClass55;
	}
	public void setM2MClass55(int m2mClass55) {
		M2MClass55 = m2mClass55;
	}
	public int getM5MClass55() {
		return M5MClass55;
	}
	public void setM5MClass55(int m5mClass55) {
		M5MClass55 = m5mClass55;
	}
	public int getM10MClass55() {
		return M10MClass55;
	}
	public void setM10MClass55(int m10mClass55) {
		M10MClass55 = m10mClass55;
	}
	public int getM20MClass55() {
		return M20MClass55;
	}
	public void setM20MClass55(int m20mClass55) {
		M20MClass55 = m20mClass55;
	}
	public int getM30MClass55() {
		return M30MClass55;
	}
	public void setM30MClass55(int m30mClass55) {
		M30MClass55 = m30mClass55;
	}
	public int getM40MClass55() {
		return M40MClass55;
	}
	public void setM40MClass55(int m40mClass55) {
		M40MClass55 = m40mClass55;
	}
	public int getL5CClass50() {
		return L5CClass50;
	}
	public void setL5CClass50(int l5cClass50) {
		L5CClass50 = l5cClass50;
	}
	public int getM5CClass50() {
		return M5CClass50;
	}
	public void setM5CClass50(int m5cClass50) {
		M5CClass50 = m5cClass50;
	}
	public int getM1MClass50() {
		return M1MClass50;
	}
	public void setM1MClass50(int m1mClass50) {
		M1MClass50 = m1mClass50;
	}
	public int getM2MClass50() {
		return M2MClass50;
	}
	public void setM2MClass50(int m2mClass50) {
		M2MClass50 = m2mClass50;
	}
	public int getM5MClass50() {
		return M5MClass50;
	}
	public void setM5MClass50(int m5mClass50) {
		M5MClass50 = m5mClass50;
	}
	public int getM10MClass50() {
		return M10MClass50;
	}
	public void setM10MClass50(int m10mClass50) {
		M10MClass50 = m10mClass50;
	}
	public int getM20MClass50() {
		return M20MClass50;
	}
	public void setM20MClass50(int m20mClass50) {
		M20MClass50 = m20mClass50;
	}
	public int getM30MClass50() {
		return M30MClass50;
	}
	public void setM30MClass50(int m30mClass50) {
		M30MClass50 = m30mClass50;
	}
	public int getM40MClass50() {
		return M40MClass50;
	}
	public void setM40MClass50(int m40mClass50) {
		M40MClass50 = m40mClass50;
	}
	@Column( name = "AppCode")
     public int AppCode;
     @Column( name = "MinAdjust")
     public int MinAdjust;
     @Column( name = "L5CClass500")
     public int L5CClass500;
     @Column( name = "M5CClass500")
     public int M5CClass500;
     @Column( name = "M1MClass500")
     public int M1MClass500;
     @Column( name = "M2MClass500")
     public int M2MClass500;
     @Column( name = "M5MClass500")
     public int M5MClass500;
     @Column( name = "M10MClass500")
     public int M10MClass500;
     @Column( name = "M20MClass500")
     public int M20MClass500;
     @Column( name = "M30MClass500")
     public int M30MClass500;
     @Column( name = "M40MClass500")
     public int M40MClass500;
     @Column( name = "L5CClass400")
     public int L5CClass400;
     @Column( name = "M5CClass400")
     public int M5CClass400;
     @Column( name = "M1MClass400")
     public int M1MClass400;
     @Column( name = "M2MClass400")
     public int M2MClass400;
     @Column( name = "M5MClass400")
     public int M5MClass400;
     @Column( name = "M10MClass400")
     public int M10MClass400;
     @Column( name = "M20MClass400")
     public int M20MClass400;
     @Column( name = "M30MClass400")
     public int M30MClass400;
     @Column( name = "M40MClass400")
     public int M40MClass400;
     @Column( name = "L5CClass300")
     public int L5CClass300;
     @Column( name = "M5CClass300")
     public int M5CClass300;
     @Column( name = "M1MClass300")
     public int M1MClass300;
     @Column( name = "M2MClass300")
     public int M2MClass300;
     @Column( name = "M5MClass300")
     public int M5MClass300;
     @Column( name = "M10MClass300")
     public int M10MClass300;
     @Column( name = "M20MClass300")
     public int M20MClass300;
     @Column( name = "M30MClass300")
     public int M30MClass300;
     @Column( name = "M40MClass300")
     public int M40MClass300;
     @Column( name = "L5CClass250")
     public int L5CClass250;
     @Column( name = "M5CClass250")
     public int M5CClass250;
     @Column( name = "M1MClass250")
     public int M1MClass250;
     @Column( name = "M2MClass250")
     public int M2MClass250;
     @Column( name = "M5MClass250")
     public int M5MClass250;
     @Column( name = "M10MClass250")
     public int M10MClass250;
     @Column( name = "M20MClass250")
     public int M20MClass250;
     @Column( name = "M30MClass250")
     public int M30MClass250;
     @Column( name = "M40MClass250")
     public int M40MClass250;
     @Column( name = "L5CClass200")
     public int L5CClass200;
     @Column( name = "M5CClass200")
     public int M5CClass200;
     @Column( name = "M1MClass200")
     public int M1MClass200;
     @Column( name = "M2MClass200")
     public int M2MClass200;
     @Column( name = "M5MClass200")
     public int M5MClass200;
     @Column( name = "M10MClass200")
     public int M10MClass200;
     @Column( name = "M20MClass200")
     public int M20MClass200;
     @Column( name = "M30MClass200")
     public int M30MClass200;
     @Column( name = "M40MClass200")
     public int M40MClass200;
     @Column( name = "L5CClass175")
     public int L5CClass175;
     @Column( name = "M5CClass175")
     public int M5CClass175;
     @Column( name = "M1MClass175")
     public int M1MClass175;
     @Column( name = "M2MClass175")
     public int M2MClass175;
     @Column( name = "M5MClass175")
     public int M5MClass175;
     @Column( name = "M10MClass175")
     public int M10MClass175;
     @Column( name = "M20MClass175")
     public int M20MClass175;
     @Column( name = "M30MClass175")
     public int M30MClass175;
     @Column( name = "M40MClass175")
     public int M40MClass175;
     @Column( name = "L5CClass150")
     public int L5CClass150;
     @Column( name = "M5CClass150")
     public int M5CClass150;
     @Column( name = "M1MClass150")
     public int M1MClass150;
     @Column( name = "M2MClass150")
     public int M2MClass150;
     @Column( name = "M5MClass150")
     public int M5MClass150;
     @Column( name = "M10MClass150")
     public int M10MClass150;
     @Column( name = "M20MClass150")
     public int M20MClass150;
     @Column( name = "M30MClass150")
     public int M30MClass150;
     @Column( name = "M40MClass150")
     public int M40MClass150;
     @Column( name = "L5CClass125")
     public int L5CClass125;
     @Column( name = "M5CClass125")
     public int M5CClass125;
     @Column( name = "M1MClass125")
     public int M1MClass125;
     @Column( name = "M2MClass125")
     public int M2MClass125;
     @Column( name = "M5MClass125")
     public int M5MClass125;
     @Column( name = "M10MClass125")
     public int M10MClass125;
     @Column( name = "M20MClass125")
     public int M20MClass125;
     @Column( name = "M30MClass125")
     public int M30MClass125;
     @Column( name = "M40MClass125")
     public int M40MClass125;
     @Column( name = "L5CClass110")
     public int L5CClass110;
     @Column( name = "M5CClass110")
     public int M5CClass110;
     @Column( name = "M1MClass110")
     public int M1MClass110;
     @Column( name = "M2MClass110")
     public int M2MClass110;
     @Column( name = "M5MClass110")
     public int M5MClass110;
     @Column( name = "M10MClass110")
     public int M10MClass110;
     @Column( name = "M20MClass110")
     public int M20MClass110;
     @Column( name = "M30MClass110")
     public int M30MClass110;
     @Column( name = "M40MClass110")
     public int M40MClass110;
     @Column( name = "L5CClass100")
     public int L5CClass100;
     @Column( name = "M5CClass100")
     public int M5CClass100;
     @Column( name = "M1MClass100")
     public int M1MClass100;
     @Column( name = "M2MClass100")
     public int M2MClass100;
     @Column( name = "M5MClass100")
     public int M5MClass100;
     @Column( name = "M10MClass100")
     public int M10MClass100;
     @Column( name = "M20MClass100")
     public int M20MClass100;
     @Column( name = "M30MClass100")
     public int M30MClass100;
     @Column( name = "M40MClass100")
     public int M40MClass100;
     @Column( name = "L5CClass92")
     public int L5CClass92;
     @Column( name = "M5CClass92")
     public int M5CClass92;
     @Column( name = "M1MClass92")
     public int M1MClass92;
     @Column( name = "M2MClass92")
     public int M2MClass92;
     @Column( name = "M5MClass92")
     public int M5MClass92;
     @Column( name = "M10MClass92")
     public int M10MClass92;
     @Column( name = "M20MClass92")
     public int M20MClass92;
     @Column( name = "M30MClass92")
     public int M30MClass92;
     @Column( name = "M40MClass92")
     public int M40MClass92;
     @Column( name = "L5CClass85")
     public int L5CClass85;
     @Column( name = "M5CClass85")
     public int M5CClass85;
     @Column( name = "M1MClass85")
     public int M1MClass85;
     @Column( name = "M2MClass85")
     public int M2MClass85;
     @Column( name = "M5MClass85")
     public int M5MClass85;
     @Column( name = "M10MClass85")
     public int M10MClass85;
     @Column( name = "M20MClass85")
     public int M20MClass85;
     @Column( name = "M30MClass85")
     public int M30MClass85;
     @Column( name = "M40MClass85")
     public int M40MClass85;
     @Column( name = "L5CClass77")
     public int L5CClass77;
     @Column( name = "M5CClass77")
     public int M5CClass77;
     @Column( name = "M1MClass77")
     public int M1MClass77;
     @Column( name = "M2MClass77")
     public int M2MClass77;
     @Column( name = "M5MClass77")
     public int M5MClass77;
     @Column( name = "M10MClass77")
     public int M10MClass77;
     @Column( name = "M20MClass77")
     public int M20MClass77;
     @Column( name = "M30MClass77")
     public int M30MClass77;
     @Column( name = "M40MClass77")
     public int M40MClass77;
     @Column( name = "L5CClass70")
     public int L5CClass70;
     @Column( name = "M5CClass70")
     public int M5CClass70;
     @Column( name = "M1MClass70")
     public int M1MClass70;
     @Column( name = "M2MClass70")
     public int M2MClass70;
     @Column( name = "M5MClass70")
     public int M5MClass70;
     @Column( name = "M10MClass70")
     public int M10MClass70;
     @Column( name = "M20MClass70")
     public int M20MClass70;
     @Column( name = "M30MClass70")
     public int M30MClass70;
     @Column( name = "M40MClass70")
     public int M40MClass70;
     @Column( name = "L5CClass65")
     public int L5CClass65;
     @Column( name = "M5CClass65")
     public int M5CClass65;
     @Column( name = "M1MClass65")
     public int M1MClass65;
     @Column( name = "M2MClass65")
     public int M2MClass65;
     @Column( name = "M5MClass65")
     public int M5MClass65;
     @Column( name = "M10MClass65")
     public int M10MClass65;
     @Column( name = "M20MClass65")
     public int M20MClass65;
     @Column( name = "M30MClass65")
     public int M30MClass65;
     @Column( name = "M40MClass65")
     public int M40MClass65;
     @Column( name = "L5CClass60")
     public int L5CClass60;
     @Column( name = "M5CClass60")
     public int M5CClass60;
     @Column( name = "M1MClass60")
     public int M1MClass60;
     @Column( name = "M2MClass60")
     public int M2MClass60;
     @Column( name = "M5MClass60")
     public int M5MClass60;
     @Column( name = "M10MClass60")
     public int M10MClass60;
     @Column( name = "M20MClass60")
     public int M20MClass60;
     @Column( name = "M30MClass60")
     public int M30MClass60;
     @Column( name = "M40MClass60")
     public int M40MClass60;
     @Column( name = "L5CClass55")
     public int L5CClass55;
     @Column( name = "M5CClass55")
     public int M5CClass55;
     @Column( name = "M1MClass55")
     public int M1MClass55;
     @Column( name = "M2MClass55")
     public int M2MClass55;
     @Column( name = "M5MClass55")
     public int M5MClass55;
     @Column( name = "M10MClass55")
     public int M10MClass55;
     @Column( name = "M20MClass55")
     public int M20MClass55;
     @Column( name = "M30MClass55")
     public int M30MClass55;
     @Column( name = "M40MClass55")
     public int M40MClass55;
     @Column( name = "L5CClass50")
     public int L5CClass50;
     @Column( name = "M5CClass50")
     public int M5CClass50;
     @Column( name = "M1MClass50")
     public int M1MClass50;
     @Column( name = "M2MClass50")
     public int M2MClass50;
     @Column( name = "M5MClass50")
     public int M5MClass50;
     @Column( name = "M10MClass50")
     public int M10MClass50;
     @Column( name = "M20MClass50")
     public int M20MClass50;
     @Column( name = "M30MClass50")
     public int M30MClass50;
     @Column( name = "M40MClass50")
     public int M40MClass50;
}