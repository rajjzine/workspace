package javaPractice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExOfArrayList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		//add method for adding elements
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(40);
		list.add(30);
		list.add(5);
		list.add(2);
		
		System.out.println(list);
		
//-------remove method for removing elements
		list.remove(1);
		System.out.println(list);
//------remove method for removing object
		list.remove(new Integer(60));
		System.out.println(list);

		
	}
}
