package com.psl.training.collection.test;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.psl.training.collection.bean.*;
import com.psl.training.collection.service.MoviesService;

public class MoviesTest {

	public static void main(String[] args) {
		
		MoviesService ms = new MoviesService();
		ms.MovieService();
		List<Movies> movieList = ms.getMovieList();
		Collections.sort(movieList);
		System.out.println("Sorting Movies According to Language using Comparable");
		System.out.println("------------------------------------");
		for (Movies movies : movieList) {
			System.out.println(movies.toString());
		}
		
		System.out.println("\nSorting Movies According to Director");
		System.out.println("------------------------------------");
		Set<Movies> sortByDirector=new TreeSet<>(new SortByDirector());
		sortByDirector.addAll(movieList);
		for (Movies m : sortByDirector) {
			System.out.println(m);
		}
		
		System.out.println("\nSorting Movies According to Language by comparator");
		System.out.println("------------------------------------");
		Set<Movies> sortByLanguage=new TreeSet<>(new SortByLanguage());
		sortByLanguage.addAll(movieList);
		for (Movies m : sortByLanguage) {
			System.out.println(m);
		}
		
		System.out.println("\nSorting Movies According to Duration by comparator");
		System.out.println("------------------------------------");
		Set<Movies> sortByDuration=new TreeSet<>(new SortByDuration());
		sortByDuration.addAll(movieList);
		for (Movies m : sortByDuration) {
			System.out.println(m);
		}
		
		System.out.println("\nSorting Movies According to language and release date by comparator");
		System.out.println("------------------------------------");
		Set<Movies> sortByLangAndDate=new TreeSet<>(new SortByLanguageAndReleaseDate());
		sortByLangAndDate.addAll(movieList);
		for (Movies m : sortByLangAndDate) {
			System.out.println(m);
		}
				
	}
	
}
