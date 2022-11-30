package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Movie;

// Service에서 로직(알고리즘)을 구현. 비즈니스 구역(비즈니스 로직)
// 반드시 어노테이션이 있어야 @Autowired 가능.
@Service
public class ApiService {
	
	
	/**
	 * @Since : 2022. 11. 23.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<Movie>
	 * @Comment : 영화 만들기
	 */
	public List<Movie> makeMovies() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie movie = new Movie();
		System.out.println(movie);
		movie.setGenre("Animation, Comedy, Horror");
		movie.setYear("2000–2016");
		movie.setRuntime("21 min");
		movie.setTitle("Happy Tree Friends");
		
		Movie movie2 = new Movie();
		System.out.println(movie2);
		movie2.setGenre("Animation, Adventure, Comedy");
		movie2.setYear("2004–2009");
		movie2.setRuntime("30 min");
		movie2.setTitle("Foster's Home for Imaginary Friends");
		
		Movie movie3 = new Movie();
		System.out.println(movie);
		movie3.setGenre("Animation, Drama, SF");
		movie3.setYear("2021");
		movie3.setRuntime("155 min");
		movie3.setTitle("Evangelion: 3.0+1.0 Thrice Upon a Time");
		
		list.add(movie);
		list.add(movie2);
		list.add(movie3);
		
		return list;
	}
}
