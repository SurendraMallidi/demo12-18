package com.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		String s = "vamsi surendra";
		String s1="Madam";
		
		//Count vowels in s string
		long vowels = s.chars().mapToObj(i->(char)i).filter(c->c=='a' || c=='e' || c=='i'||c=='o'||c=='u').count();
		System.out.println(vowels);
		
		//Palindrome String
		 boolean str = new StringBuilder(s1.replaceAll("\\s+", "").toLowerCase())
				 .reverse().toString().
				 equals(s1.replaceAll("\\s+","").toLowerCase());
		 System.out.println(str); 
		 
		 //Frequency of each Character in a string
		 Map<Object, Long> frequencyMap = s.chars().mapToObj(c->(char)c).filter(c->c!=' ').
		 collect(Collectors.groupingBy(c->c,Collectors.counting()));
		 System.out.println(frequencyMap);
		 
		 
		//Hi 
		
	}

}
