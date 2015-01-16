package hello;

import java.util.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		
		//hs.add("A");
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		
		System.out.println(hs);
		
		TreeSet<String> tSet = new TreeSet<String>();
		
		tSet.addAll(hs);
		System.out.println(tSet);
		
		Iterator<String> itr = tSet.iterator();
		
		String elem;
		while(itr.hasNext()) {
			elem = itr.next();
			System.out.println(elem);
		}

	}

}
