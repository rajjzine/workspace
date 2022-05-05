package javaPractice.collections;

import java.util.LinkedList;

public class ExOfLinkedlist {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(20);
		list.add(80);
		list.add(9);
		list.add(30);
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println("Remove element");
		for(int num : list) {
		System.out.println(num);	
		}
		
		list.remove(new Integer(45));
		System.out.println("Remove object");
		for(int num : list) {
		System.out.println(num);
		}
	}

}
