package javaPractice.collections;

import java.util.HashMap;

public class Ex8_addelementstoHashmap {
	public static void main(String[] args) {
		HashMap<String,String> hashmap	= new HashMap<String,String>();
		hashmap.put("1", "raaaj");
		hashmap.put("2", "taaaj");
		hashmap.put("3", "vaibooo");
		hashmap.put("4", "ganu");
		hashmap.put("5", "pandu");
		
		System.out.println(hashmap);
		System.out.println(hashmap.size());
		System.out.println(hashmap.isEmpty());
	}

}
