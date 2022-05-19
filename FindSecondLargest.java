package week3.day2.assignments;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		// Here is the input
		//int[] data = {3,2,11,4,6,7};
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		Integer[] num = new Integer[] { 3, 2, 11, 4, 6, 7 };

		//convert array to list, sort list and print list values		
		List<Integer> list = Arrays.asList(num);
		System.out.println("Before Sort: " +list);
		list.sort(null);		
		System.out.println(list);

		//get the second largest value and print it	
		Integer secondLargest = list.get(list.size() - 2);		
		System.out.println("Second largest value : " +secondLargest);
		
	}

}
