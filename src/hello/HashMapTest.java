package hello;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("Kim", new Double(554.54));
		map.put("Han", new Double(5473.2));
		map.put("Sang", new Double(287.1));
		map.put("Sun",new Double(19.2));
		
		System.out.println(map);
		
		Set<?> set = map.entrySet();
		
		Iterator<?> i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		double bonus = map.get("Kim").doubleValue();
		map.put("Kim", new Double(bonus + 1000));
		System.out.println("Kim's new deposit : " + map.get("Kim"));
	}

}
