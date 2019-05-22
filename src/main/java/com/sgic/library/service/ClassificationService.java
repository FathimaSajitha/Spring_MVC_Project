package com.sgic.library.service;



import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationService {
	public abstract Classification createClassification (Classification classification);
	public List<Classification> ListClassification();
	
}
