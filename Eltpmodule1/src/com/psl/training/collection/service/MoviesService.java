package com.psl.training.collection.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.psl.training.collection.bean.Movies;

public class MoviesService {
	
	List<Movies> movieList =  new ArrayList<>();
	
	public void MovieService() {
		movieList.add(new Movies("Avengers","English",Date.valueOf("2013-10-8"),"aved","avep",2));
		movieList.add(new Movies("PK","Hindi",Date.valueOf("2012-3-4"),"AB","BC",4));
		movieList.add(new Movies("Parasite","Korean",Date.valueOf("2015-9-4"),"pard","parp",1));
		movieList.add(new Movies("XYZ","Hindi",Date.valueOf("2017-2-1"),"ABx","BCx",3));
	}

	public List<Movies> getMovieList() {
		return movieList;
	}

}
