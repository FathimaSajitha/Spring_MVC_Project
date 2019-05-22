package com.sgic.library.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sgic.library.model.Classification;

@Repository
public class ClassificationDaoImpl implements ClassificationDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}

	public Classification addClassification(Classification classification) {
		 hibernateTemplate.save(classification);
		 return null;
	}

	public List<Classification> ListAllClassification() {
		List<Classification> list =new ArrayList<Classification>();
		list = hibernateTemplate.loadAll(Classification.class);
		return list;
	}

}
