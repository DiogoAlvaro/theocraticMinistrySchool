package com.tms.model;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-07-11T21:54:07.200-0300")
@StaticMetamodel(Studant.class)
public class Studant_ {
	public static volatile SingularAttribute<Studant, Long> id;
	public static volatile SingularAttribute<Studant, String> name;
	public static volatile SingularAttribute<Studant, StudantGenre> genre;
	public static volatile SingularAttribute<Studant, StudantType> type;
	public static volatile SingularAttribute<Studant, Boolean> active;
	public static volatile SingularAttribute<Studant, Boolean> readingHighlights;
	public static volatile SingularAttribute<Studant, Date> lastHighlights;
	public static volatile SingularAttribute<Studant, Boolean> numberOne;
	public static volatile SingularAttribute<Studant, Date> lastNumberOne;
	public static volatile SingularAttribute<Studant, Boolean> numberTwo;
	public static volatile SingularAttribute<Studant, Date> lastNumberTwo;
	public static volatile SingularAttribute<Studant, Boolean> numberThree;
	public static volatile SingularAttribute<Studant, Date> lastNumberThree;
	public static volatile SingularAttribute<Studant, Boolean> helper;
	public static volatile SingularAttribute<Studant, Date> lastHelper;
}
