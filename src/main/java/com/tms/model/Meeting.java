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
	private Assignment discourse;
	private Assignment findSpiritualJewels;
	private Assignment bibleReading;
	private Assignment firstVisit;
	private Assignment revisit;
	private Assignment bibleStudy;
	
	
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
	

	public Assignment getDiscourse() {
		return discourse;
	}
	public void setDiscourse(Assignment discourse) {
		this.discourse = discourse;
	}
	
	
	public Assignment getFindSpiritualJewels() {
		return findSpiritualJewels;
	}
	public void setFindSpiritualJewels(Assignment findSpiritualJewels) {
		this.findSpiritualJewels = findSpiritualJewels;
	}
	
	
	public Assignment getBibleReading() {
		return bibleReading;
	}
	public void setBibleReading(Assignment bibleReading) {
		this.bibleReading = bibleReading;
	}
	
	
	public Assignment getFirstVisit() {
		return firstVisit;
	}
	public void setFirstVisit(Assignment firstVisit) {
		this.firstVisit = firstVisit;
	}
	
	
	public Assignment getRevisit() {
		return revisit;
	}
	public void setRevisit(Assignment revisit) {
		this.revisit = revisit;
	}
	
	public Assignment getBibleStudy() {
		return bibleStudy;
	}
	public void setBibleStudy(Assignment bibleStudy) {
		this.bibleStudy = bibleStudy;
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
