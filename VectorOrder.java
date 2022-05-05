package javaPractice.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorOrder {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(88);
		list.add(33);
		list.add(77);
		list.add(00);
		list.add(55);
		System.out.println("befor sorting order\n"+list);
		
		Collections.sort(list);
		System.out.println("after sorting order");
		for(int number:list) {
			System.out.println(number);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse sorting order");
		for(int number : list) {
			System.out.println(number);
		}
	}

}
