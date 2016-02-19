package com.tms.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-18T14:53:17.171-0300")
@StaticMetamodel(Meeting.class)
public class Meeting_ {
	public static volatile SingularAttribute<Meeting, Long> id;
	public static volatile SingularAttribute<Meeting, Date> date;
	public static volatile SingularAttribute<Meeting, Assignment> discourse;
	public static volatile SingularAttribute<Meeting, Assignment> findSpiritualJewels;
	public static volatile SingularAttribute<Meeting, Assignment> bibleReading;
	public static volatile SingularAttribute<Meeting, Assignment> firstVisit;
	public static volatile SingularAttribute<Meeting, Assignment> revisit;
	public static volatile SingularAttribute<Meeting, Assignment> bibleStudy;
}
