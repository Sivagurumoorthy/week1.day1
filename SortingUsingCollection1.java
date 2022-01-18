package week1.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection1 {

	public static void main(String[] args) {
// Declare a string
		
		String[] input = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
// Convert Array into List
		
		List<String> companies = Arrays.asList(input);
		
// get the length
		int size = companies.size();
		int length = input.length;
		
//sort Arrays
		Collections.sort(companies);
		Arrays.sort(input);
		
//Iterate in the Reverse Order
		
		for (int i = size-1; i >= 0; i--) {
			
			System.out.print (companies.get(i) + " ");
			
		}
		
		for(int i = input.length-1; i >=0; i--) {
			
			System.out.print(input[i] +" ");
			
		}
		

	}

}
