package MapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
		h.put("fried rice", 70);
		h.put("noodles", 80);
		linkedHashMap.put("Icecream", 25);
		linkedHashMap.put("Chocolate", 15);
		linkedHashMap.put("lollipop", 10);
		linkedHashMap.putAll(h);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.size());
		if (linkedHashMap.containsKey("fried rice"))
			System.out.println(linkedHashMap.get("fried rice"));
		if (linkedHashMap.containsValue(10))
			System.out.println(linkedHashMap.remove("lollipop"));

		//for (Map.Entry<String, Integer> i : LinkedHashMap.entrySet()) {
		//	System.out.println("Key = " + i.getKey() + " Value = " + i.getValue());}
		for(String dishName:linkedHashMap.keySet())
			System.out.println("Dish Name = "+dishName);
		for(Integer i:linkedHashMap.values())
			System.out.println("Prices = "+i);
		linkedHashMap.clear();
		if (linkedHashMap.isEmpty())
			System.out.println("Empty ");

	}

}
