package javaPractice.collections;

import java.util.Vector;

public class ExOfVector {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(99);
		list.add(22);
		list.add(30);
		list.add(10);
		list.add(5);
		list.add(100);
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(10);
		System.out.println(list);
	}

}
