package com.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(2,4,6,5,9);
		Set<Integer> set = new HashSet<>();
		
		//Even Numbers
		List<Integer> evenNum = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("evenNum: "+evenNum);
		
		//Odd Numbers
		List<Integer> oddNum = l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("oddNum: "+oddNum);
		
		//Multiply each Number by 2
		List<Integer> mulbytwo = l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("mulbytwo: "+mulbytwo);
		
		//Count
		long count = l.stream().count();
		System.out.println("count of elements in list: "+count);
		
		//Count by Condition
		long c = l.stream().filter(i->i>=5).count();
		System.out.println("Count by Condition: "+c);

		//Sorting
		List<Integer> sort = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: "+sort);
		
		//Sorting in reverse order
		List<Integer> reverseSort = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse Sort: "+reverseSort);
		
		//Sorting list of Strings
		List<String> lstr = Arrays.asList("Nani","Surendra","Mallidi","Vamsi","Ashish");
		List<String> sortedString  = lstr.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted String: "+sortedString);
		
		//Sorting list of Strings in reverse order
		List<String> reverseSortedString = lstr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverseSortedString: "+reverseSortedString);
		
		//String starts with
		List<String> startsWithS = lstr.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println("startsWithS: "+startsWithS);
		
		//Maximum element in a list
		int max = l.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
		System.out.println("Maximum element in a list: "+max);
		
		//Minimum element in a list
		int min = l.stream().sorted().findFirst().orElse(null);
		System.out.println("Minimum element in a list: "+min);
		
		//For each
		//l.stream().forEach(i->System.out.println(i));
		
		//Sum of even numbers
		long evenSum = l.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		System.out.println("Sum of even numbers: "+evenSum);
		
		//Sum of odd numbers
		long oddSum = l.stream().filter(i->i%2!=0).mapToInt(i->i).sum();
		System.out.println("Sum of odd numbers: "+oddSum);
		
		//Average
		double avg = l.stream().mapToInt(i->i).average().getAsDouble();
		System.out.println("Average: "+avg);
		
		//Distinct elements
		List<Integer> distinct = l.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Elements: "+distinct); 
		
		//Duplicate elements
		List<Integer> duplicate = l.stream().filter(i->!set.add(i)).collect(Collectors.toList());
		System.out.println("Duplicate Elements: "+duplicate);
		
		//Using Partition by function
		Map<Boolean, List<Integer>> m  = l.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(m);
		
	}

}
