package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(78);
		list.add(36);
		list.add(10);
		list.add(66);
		list.add(30);
		
		System.out.println("before reverse arraylist");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("after reverse arraylist");
		System.out.println(list);
		
	}

}
