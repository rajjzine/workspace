package javaPractice.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedLIstOrder {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(66);
		list.add(33);
		list.add(00);
		list.add(99);
		list.add(55);
		System.out.println("before sorting order/n"+list);
		
		Collections.sort(list);
		System.out.println("after sorting order");
		for(int num : list) {
			System.out.println(num);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse sorting order");
		for(int num : list) {
			System.out.println(num);
		}
		
	}

}
