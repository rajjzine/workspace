package javaPractice.collections;

import java.util.Collections;
import java.util.Vector;

public class ReverseVector {
	public static void main(String[] args) {
		Vector<Integer> list=new Vector<Integer>();
		list.add(77);
		list.add(30);
		list.add(55);
		list.add(22);
		list.add(9);
		
		System.out.println("before reverse order\n"+list);
		
		Collections.reverse(list);
		System.out.println("after reverse order\n"+list);
		
	}

}
