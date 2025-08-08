package io;
import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		
		List<String> movies = 
				Arrays.asList("Kubera","Bahubali","Kingdon","Bussiness Man","Hanuman","robot");
		movies.forEach(System.out::println);
		movies.forEach(movie ->
		System.out.println(movie));
	
	}
	

}
