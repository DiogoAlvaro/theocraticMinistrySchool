package com.tms.model;

import com.tms.constants.StudantGenre;
import com.tms.constants.StudantType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-18T14:32:42.313-0300")
@StaticMetamodel(Studant.class)
public class Studant_ {
	public static volatile SingularAttribute<Studant, Long> id;
	public static volatile SingularAttribute<Studant, String> name;
	public static volatile SingularAttribute<Studant, StudantGenre> genre;
	public static volatile SingularAttribute<Studant, StudantType> type;
	public static volatile SingularAttribute<Studant, Boolean> active;
	public static volatile SingularAttribute<Studant, Boolean> dicourse;
	public static volatile SingularAttribute<Studant, Boolean> findSpiritualJewels;
	public static volatile SingularAttribute<Studant, Boolean> bibleReading;
	public static volatile SingularAttribute<Studant, Boolean> firstVisit;
	public static volatile SingularAttribute<Studant, Boolean> revisit;
	public static volatile SingularAttribute<Studant, Boolean> bibleStudy;
}
