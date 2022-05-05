package javaPractice.collections;

import java.util.Arrays;
import java.util.List;

public class Ex6_convertToarraytolist {
	public static void main(String[] args) {
		
		String cars[]= {"Maruti","BMW","Volvo","Audi","Benz","Tesla"};
		int length_array  = cars.length;
		System.out.println("");
		List converted_list = Arrays.asList(cars);
		System.out.println("converting array to list");
		
		for(int i=0;i<length_array;i++) {
			System.out.println(cars[i]+ " ");
		}
	}

}
