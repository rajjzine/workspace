package javaPractice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Aex_IterateHashmap {
	public static void main(String[] args) {
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("1", "raaj");
		hashmap.put("2", "taaj");
		hashmap.put("3", "vaibhoo");
//	System.out.println("Iterating using foreach loop");
//		for(String key : hashmap.keySet()) {
//			System.out.println("key: "+ key +" value: "+ hashmap.get(key));
//		}
		
	System.out.println("iterating using keyset iterator");
		Set<String> KeySet = hashmap.keySet();
		Iterator<String> KeySetIterator = KeySet.iterator();
		while(KeySetIterator.hasNext()) {
			String key = KeySetIterator.next();
			System.out.println("key: " + key + " value: " + hashmap.get(key));
		}
		
	System.out.println("iterating using entrySet() and for each");
		Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
		for(Map.Entry entry : entrySet) {
			System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
		}
		
	System.out.println("iterating using entryset() with iterator");
		Set<Map.Entry<String, String>> entry1 = hashmap.entrySet();
		Iterator<Map.Entry<String,String>> entrySetIterator = entry1.iterator();
		while(entrySetIterator.hasNext()) {
			Map.Entry entry = entrySetIterator.next();
			System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
		}
	}

}
