package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesinArray {
	public static void main(String[] args) {
		//int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		// get the length of the array
		// declare an int variable named count
		// iterate from 0 to the array length-1 (outer loop starts here)
		// assign 0 to count
		// iterate from i to the length of the array by adding 1 to it (inner loop
		// starts here)
		// compare both the loop variables & check they're equal
		// increase the count if both the arrays are equal
		// Out of the inner loop, check and print the first array variable if count is
		// more than 0
		Integer[] text = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		List<Integer> list1 = Arrays.asList(text);
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList();

		for (int i = 0; i <= list1.size() - 1; i++) {
			if (list2.contains(list1.get(i))) {
				System.out.println(list1.get(i));
			} 
			else {
			list2.add(list1.get(i));
			}
		}
	}

}
