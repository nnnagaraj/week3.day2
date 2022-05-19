package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//Week3.day2 Assignment - Remove duplicates in the given text 		
				String text = "We learn java as part of java sessions in java week1";
				
				//Print the given text
				System.out.println("orinigal text :  " + text);
				
		        //Covert the text into List 
				List<String> list1 = Arrays.asList(text.split(" "));
				
				//Load the value from list into Set
				Set<String> set1 = new LinkedHashSet(list1);
				System.out.println("After removing duplicates:" +set1);
				
				//print each values from the Set
				for (String Eachvalue : set1) {
					System.out.print(" " + Eachvalue);
				}
		 	}


}
