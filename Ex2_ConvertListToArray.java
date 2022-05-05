package javaPractice.collections;

import java.util.ArrayList;

public class Ex2_ConvertListToArray {
	public static void main(String[] args) {
		ArrayList<String> arr_list	= new ArrayList<String>();
		arr_list.add("Apple");
		arr_list.add("Banana");
		arr_list.add("Mango");
		arr_list.add("Pear");
//------- by using get()
		String array[] = new String[arr_list.size()];
		for(int j=0;j<arr_list.size();j++){
			array[j] = arr_list.get(j);
		}
		
		for(String names : array){
			System.out.println(names);
		}
//--------- by using toArray
		String citinames[] = arr_list.toArray(new String[arr_list.size()]);
		for(String names : citinames) {
			System.out.println(names);
		}
		
		
	}

}
