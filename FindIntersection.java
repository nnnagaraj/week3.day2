package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		Integer[] array1 = new Integer[] { 3, 2, 11, 4, 6, 7 };
		Integer[] array2 = new Integer[] { 1, 2, 8, 4, 9, 7 };

		//convert array to list	and print both the lists	
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		
		System.out.println("List1 :" + list1);
		System.out.println("List2 :" + list2);

		//convert the list1 into set
		Set<Integer> set1 = new HashSet(list1);

		set1.retainAll(list2);

		//print set1		
		System.out.println("Intersection of array1 and array2 :" +set1);


	}
}
