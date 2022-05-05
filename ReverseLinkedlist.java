package javaPractice.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedlist {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(88);
		list.add(66);
		list.add(33);
		list.add(11);
		list.add(99);
		System.out.println("before reverse order");
		for(int num : list) {
		System.out.println(num);
		}
		Collections.reverse(list);
		System.out.println("after revese order");
		for(int num : list) {
		System.out.println(num);
		}
	}

}
