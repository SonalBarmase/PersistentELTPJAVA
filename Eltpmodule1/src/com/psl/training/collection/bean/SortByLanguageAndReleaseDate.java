package com.psl.training.collection.bean;

import java.util.Comparator;

public class SortByLanguageAndReleaseDate implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		int i = o1.getLanguage().compareTo(o2.getLanguage());
				if(i==0) {
					i = o1.getReleaseDate().compareTo(o2.getReleaseDate());
				}
		return i;
	}
	
	

}
