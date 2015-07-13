package com.tms.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-07-11T21:54:07.197-0300")
@StaticMetamodel(Meeting.class)
public class Meeting_ {
	public static volatile SingularAttribute<Meeting, Long> id;
	public static volatile SingularAttribute<Meeting, Date> date;
	public static volatile SingularAttribute<Meeting, Studant> bibleReading;
	public static volatile SingularAttribute<Meeting, Studant> numberOne;
	public static volatile SingularAttribute<Meeting, Studant> numberTwo;
	public static volatile SingularAttribute<Meeting, Studant> helperNumberTwo;
	public static volatile SingularAttribute<Meeting, Studant> numberThree;
	public static volatile SingularAttribute<Meeting, Studant> helperNumberThree;
}
