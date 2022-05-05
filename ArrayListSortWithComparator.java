package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortWithComparator {
	public static void main(String[] args) {
		ArrayList<Student1> arr_list = new ArrayList<Student1>();
		arr_list.add(new Student1("Raaj",111,23));
		arr_list.add(new Student1("Pandu",333,30));
		arr_list.add(new Student1("Ganu",222,20));
		
		System.out.println("Student Name sorting: ");
		Collections.sort(arr_list,Student1.StudRollno);
		
		for(Student1 str: arr_list) {
			System.out.println(str);
		}
		
		//System.out.println("");
		
		
	}

}
