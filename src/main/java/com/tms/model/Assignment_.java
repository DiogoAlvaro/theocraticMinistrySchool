package com.tms.model;

import com.tms.constants.AssignmentLocal;
import com.tms.constants.AssignmentType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-22T09:47:49.145-0300")
@StaticMetamodel(Assignment.class)
public class Assignment_ {
	public static volatile SingularAttribute<Assignment, Integer> id;
	public static volatile SingularAttribute<Assignment, AssignmentType> type;
	public static volatile SingularAttribute<Assignment, Studant> studant;
	public static volatile SingularAttribute<Assignment, Studant> helper;
	public static volatile SingularAttribute<Assignment, String> sourceMatters;
	public static volatile SingularAttribute<Assignment, AssignmentLocal> local;
	public static volatile SingularAttribute<Assignment, Short> studyNumber;
}
