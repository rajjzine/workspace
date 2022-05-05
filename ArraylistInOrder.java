package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistInOrder {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(56);
		list.add(78);
		list.add(10);
		list.add(33);
		list.add(1);
		list.add(9);
		
		System.out.println("before sorting order");
		for(int num : list) {
		System.out.println(num);
		}
		
		Collections.sort(list);
		System.out.println("after sorting order");
		for(int num : list) {
		System.out.println(num);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("in reverse sorting order");
		for(int num : list) {
		System.out.println(num);
		}
	}

}
