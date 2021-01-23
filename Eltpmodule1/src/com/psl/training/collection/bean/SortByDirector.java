package com.psl.training.collection.bean;

import java.util.Comparator;

public class SortByDirector implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		return o1.getDirector().compareTo(o2.getDirector());
	}
	
	

}
