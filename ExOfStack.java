package javaPractice.collections;

import java.util.Stack;

public class ExOfStack {
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.push(60);
		list.push(50);
		list.push(99);
		list.push(77);
		list.push(11);
		
		System.out.println(list);
		
		list.pop();
		System.out.println(list);
		
		list.push(44);
		System.out.println(list);
	}

}
