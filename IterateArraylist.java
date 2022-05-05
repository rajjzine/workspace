package javaPractice.collections;

import java.util.ArrayList;

public class IterateArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list	= new ArrayList<Integer>();
		list.add(3);
		list.add(17);
		list.add(6);
		list.add(9);
		list.add(7);
		System.out.println("Using for loop");
		
		for(int numbers : list) {
			System.out.println(numbers);
		}
	}

}
