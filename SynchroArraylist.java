package javaPractice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchroArraylist {
	public static void main(String[] args) {
		List<String> syn_list = Collections.synchronizedList(new ArrayList<String>());
		syn_list.add("learn");
		syn_list.add("practice");
		syn_list.add("solve");
		syn_list.add("interview");
		
		synchronized(syn_list)
		{
			Iterator it = syn_list.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
	}

}
