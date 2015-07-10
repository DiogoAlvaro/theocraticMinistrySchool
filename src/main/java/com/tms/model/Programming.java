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
@Table(name="programming")
public class Programming implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date initialDate;
	private Meeting meetingOne;
	private Meeting meetingTwo;
	private Meeting meetingThree;
	private Meeting meetingFour;
	private Meeting meetingFive;
	private Meeting meetingSix;
	private Meeting meetingSeven;
	private Meeting meetingEight;
	private Meeting meetingNine;
	
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
	public Date getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingOne() {
		return meetingOne;
	}
	public void setMeetingOne(Meeting meetingOne) {
		this.meetingOne = meetingOne;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingTwo() {
		return meetingTwo;
	}
	public void setMeetingTwo(Meeting meetingTwo) {
		this.meetingTwo = meetingTwo;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingThree() {
		return meetingThree;
	}
	public void setMeetingThree(Meeting meetingThree) {
		this.meetingThree = meetingThree;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingFour() {
		return meetingFour;
	}
	public void setMeetingFour(Meeting meetingFour) {
		this.meetingFour = meetingFour;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingFive() {
		return meetingFive;
	}
	public void setMeetingFive(Meeting meetingFive) {
		this.meetingFive = meetingFive;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingSix() {
		return meetingSix;
	}
	public void setMeetingSix(Meeting meetingSix) {
		this.meetingSix = meetingSix;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingSeven() {
		return meetingSeven;
	}
	public void setMeetingSeven(Meeting meetingSeven) {
		this.meetingSeven = meetingSeven;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingEight() {
		return meetingEight;
	}
	public void setMeetingEight(Meeting meetingEight) {
		this.meetingEight = meetingEight;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn
	public Meeting getMeetingNine() {
		return meetingNine;
	}
	public void setMeetingNine(Meeting meetingNine) {
		this.meetingNine = meetingNine;
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
		if (!(obj instanceof Programming))
			return false;
		Programming other = (Programming) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
