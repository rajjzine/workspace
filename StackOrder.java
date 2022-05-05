package javaPractice.collections;

import java.util.Collections;
import java.util.Stack;

public class StackOrder {
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.push(99);
		list.push(30);
		list.push(66);
		list.push(44);
		list.push(9);
		System.out.println("befor sorting order\n"+list);
		
		Collections.sort(list);
		System.out.println("After sorting order");
		for(int number:list) {
		System.out.println(number);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sorting order");
		for(int number:list) {
			System.out.println(number);
		}
	}

}
