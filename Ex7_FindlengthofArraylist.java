package javaPractice.collections;

import java.util.ArrayList;

public class Ex7_FindlengthofArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		arr_list.add(11);
		arr_list.add(3);
		arr_list.add(5);
		arr_list.add(4);
		arr_list.add(9);
		System.out.println("size after adding elements: "+arr_list.size());
		arr_list.remove(1);
		arr_list.remove(2);
		
		for(int num : arr_list) {
			System.out.println(num);
		}
		System.out.println("size after removing elements: "+arr_list.size());
		
		
	}

}
