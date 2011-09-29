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
@Table(name = "estes2011v500matrix")
public class Estes2011v500Matrix implements Serializable{
	@Id
	@Column(name = "ID", updatable = false, nullable = false)
private Long id;
     @Column( name = "Origin")
     public String Origin;
     @Column( name = "Destination")
     public String Destination;
     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getRBN() {
		return RBN;
	}
	public void setRBN(int rBN) {
		RBN = rBN;
	}
	@Column( name = "RBN")
     public int RBN;
}