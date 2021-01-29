package com.cg.studentcoursesystem.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
private static EntityManagerFactory entityManagerFactory;
	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory==null) {
			entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		}
		return entityManagerFactory;
	}
	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		
		DBUtil.entityManagerFactory = entityManagerFactory;
	}
}
