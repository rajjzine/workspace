package javaPractice.collections;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {
	public static void main(String[] args) {
		int sample_array[] = {10,50,80,70,60,40};
		//String sample_array[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int length_array=sample_array.length;
		System.out.println("the input elements are as follows :");
		for(int i=0;i<length_array;i++) {
			System.out.println(sample_array[i]+ " ");
		}
		System.out.println();
		List converted_list = Arrays.asList(sample_array);
		System.out.println("the converted list is as follow :");
		for(int i=0;i<length_array;i++) {
			System.out.println(sample_array[i]+ " ");
		}
	}

}
