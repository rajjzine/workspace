package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Aex_sortArraylistdesorder {
	public static void main(String[] args) {
		ArrayList<String> arr_list = new ArrayList<String>();
		arr_list.add("Apple");
		arr_list.add("Banana");
		arr_list.add("Mango");
		
		System.out.println("Array list Before Sorting");
		for(String str : arr_list) {
			System.out.println(str);
		}
		
		Collections.sort(arr_list, Collections.reverseOrder());
		System.out.println("After sorting");
		for(String str:arr_list) {
			System.out.println(str);
		}
	}

}
