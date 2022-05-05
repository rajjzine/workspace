package javaPractice.collections;

import java.util.ArrayList;

public class Ex4_checkIfElementExists {
	public static void main(String[] args) {
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		arr_list.add(3);
		arr_list.add(17);
		arr_list.add(6);
		arr_list.add(9);
		arr_list.add(7);
		
		if(arr_list.contains(7)) {
			System.out.println("7 was found in the list");
		}else {
			System.out.println("7 was not found in the list");
		}
	}

}
