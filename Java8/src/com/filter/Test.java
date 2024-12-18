package com.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(2,3,4,5,1);
        System.out.println(l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

	}

}
