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
@Table(name = "estes2011v500lane")
public class Estes2011v500Lane implements Serializable{
	@Id
@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "Direction")
     public String Direction;
     @Column( name = "FromLow")
     public String FromLow;
     @Column( name = "FromHigh")
     public String FromHigh;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDirection() {
		return Direction;
	}
	public void setDirection(String direction) {
		Direction = direction;
	}
	public String getFromLow() {
		return FromLow;
	}
	public void setFromLow(String fromLow) {
		FromLow = fromLow;
	}
	public String getFromHigh() {
		return FromHigh;
	}
	public void setFromHigh(String fromHigh) {
		FromHigh = fromHigh;
	}
	public String getToLow() {
		return ToLow;
	}
	public void setToLow(String toLow) {
		ToLow = toLow;
	}
	public String getToHigh() {
		return ToHigh;
	}
	public void setToHigh(String toHigh) {
		ToHigh = toHigh;
	}
	public int getAdjNumber() {
		return AdjNumber;
	}
	public void setAdjNumber(int adjNumber) {
		AdjNumber = adjNumber;
	}
	@Column( name = "ToLow")
     public String ToLow;
     @Column( name = "ToHigh")
     public String ToHigh;
     @Column( name = "AdjNumber")
     public int AdjNumber;
}