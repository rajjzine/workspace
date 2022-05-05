package javaPractice.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3_IterateHashset {
	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<String>();
		
		hashset.add("Mango");
		hashset.add("Banana");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("WaterMelan");
//------- By using Iterator
		Iterator<String> itr = hashset.iterator();
		System.out.println("Hashset contains : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//------- By using for each loop
		for(String name : hashset) {
			System.out.println(name);
		}
	}

}
