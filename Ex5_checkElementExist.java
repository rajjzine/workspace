package javaPractice.collections;

import java.util.HashSet;

public class Ex5_checkElementExist {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(3);
		hashset.add(17);
		hashset.add(6);
		hashset.add(9);
		hashset.add(7);
		
		if(hashset.contains(6)) {
			System.out.println("6 was found in the list");
		}else {
			System.out.println("6 is not found in the list");
		}
	}

}
