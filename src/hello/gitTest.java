package hello;

import java.util.*;

public class gitTest {
	
	private static List<String> arlst;
	private static List<Integer> arrlst;
	private static LinkedList<String> lklst;

	public static void main(String[] args) {
		// arrayList
		arlst = new ArrayList<String>();
		arrlst = new ArrayList<Integer>();
		//linkedList
		lklst = new LinkedList<String>();
		
		arlst.add("Kim");
		arlst.add("Seok");
		arlst.add("Hwan");
		
		System.out.println(arlst);
		System.out.println(arlst.get(1));
		
		arlst.remove(0);
		
		System.out.println(arlst);
		
		arrlst.add(new Integer(0));
		arrlst.add(new Integer(0));
		arrlst.add(new Integer(0));
		arrlst.add(2);
		
		System.out.println(arrlst);
		
		// get the array
		Object arr[] = arrlst.toArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("i is " + i + " = " + arr[i]);
		}
		System.out.println("");
		
		arr = arlst.toArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("i is " + i + " = " + arr[i]);
		}
		
		if (arr[1].toString() == "Hwan") {
			System.out.println("arr[1] is String !");
		}
		
		lklst.add("kim");
		lklst.add("seok");
		lklst.add("hwan");
		
		System.out.println("");
		System.out.println(lklst);
		
		lklst.removeLast();
		
		System.out.println(lklst);
	}

}
