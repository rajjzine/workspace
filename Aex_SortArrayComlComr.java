package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Aex_SortArrayComlComr {
	public static void main(String[] args) {
		ArrayList<Student> arr_list = new ArrayList<Student>();
		arr_list.add(new Student("Raaj",111,23));
		arr_list.add(new Student("Raam",222,29));
		arr_list.add(new Student("Ronaldo",333,31));
		
		Collections.sort(arr_list);
		
		for(Student str : arr_list) {
			System.out.println(str);
		}
		
	}

}
