package week3.day2.assignments;

import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		// int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// Sort the array
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		Integer[] num = new Integer[] { 1, 3, 2, 4, 6, 7 };

		// convert array to list
		List<Integer> list = Arrays.asList(num);

		// sort list
		list.sort(null);

		// find missing element using loop
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(i + 1)) {
				continue;
			}

			else {
				System.out.println("Missing element in given array is: " + (i + 1));
				break;
			}

		}
	}
}
