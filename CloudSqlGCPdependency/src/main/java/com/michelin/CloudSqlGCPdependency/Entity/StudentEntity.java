package com.michelin.CloudSqlGCPdependency.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {

	@Id
	@GeneratedValue
	private int ID;
	public StudentEntity() {
		
	}
}