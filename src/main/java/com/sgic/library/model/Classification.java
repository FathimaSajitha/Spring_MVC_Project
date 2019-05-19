package com.sgic.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="mvc_project", name="classification")
public class Classification {
	@Id
	@GeneratedValue
	
	@Column(name="classification_id")
	private int classificationId;
	@Column(name="classification_name")
	private String classificationName;
	
	public int getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}
	public String getClassificationName() {
		return classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	
	
}
