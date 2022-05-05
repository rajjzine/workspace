package javaPractice.collections.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExOfSortedSet {
	public static void main(String[] args) {
		SortedSet<Integer>list= new TreeSet<Integer>();
		list.add(33);
		list.add(55);
		list.add(11);
		list.add(15);
		
		Iterator<Integer> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println(list);
		
		list.remove(11);
		System.out.println(list);
	}

}
