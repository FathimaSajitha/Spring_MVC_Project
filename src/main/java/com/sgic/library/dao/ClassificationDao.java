package com.sgic.library.dao;



import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationDao {
	public abstract Classification addClassification (Classification classification);
	public List <Classification> ListAllClassification();
}
