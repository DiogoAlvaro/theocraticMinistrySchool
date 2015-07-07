package com.tms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="meeting")
public class Meeting implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date date;
	private Studant bibleReading;
	private Studant numberOne;
	private Studant numberTwo;
	private Studant helperNumberTwo;
	private Studant numberThree;
	private Studant helperNumberThree;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Studant getBibleReading() {
		return bibleReading;
	}
	public void setBibleReading(Studant bibleReading) {
		this.bibleReading = bibleReading;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Studant getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(Studant numberOne) {
		this.numberOne = numberOne;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Studant getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(Studant numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	@ManyToOne(optional=true)
	@JoinColumn
	public Studant getHelperNumberTwo() {
		return helperNumberTwo;
	}
	public void setHelperNumberTwo(Studant helperNumberTwo) {
		this.helperNumberTwo = helperNumberTwo;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Studant getNumberThree() {
		return numberThree;
	}
	public void setNumberThree(Studant numberThree) {
		this.numberThree = numberThree;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Studant getHelperNumberThree() {
		return helperNumberThree;
	}
	public void setHelperNumberThree(Studant helperNumberThree) {
		this.helperNumberThree = helperNumberThree;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Meeting))
			return false;
		Meeting other = (Meeting) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
