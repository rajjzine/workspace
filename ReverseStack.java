package javaPractice.collections;

import java.util.Collections;
import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.add(99);
		list.add(30);
		list.add(66);
		list.add(44);
		list.add(9);
		System.out.println("before reverse order\n"+list);
		
		Collections.reverse(list);
		System.out.println("after reverse order");
		for(int number : list) {
			System.out.println(number);
		}
	}

}
