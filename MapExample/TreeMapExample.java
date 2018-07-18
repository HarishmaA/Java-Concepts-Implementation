package MapExample;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		TreeMap<String, Integer> h = new TreeMap<>();
		h.put("fried rice", 70);
		h.put("noodles", 80);
		treeMap.put("Icecream", 25);
		treeMap.put("Chocolate", 15);
		treeMap.put("lollipop", 10);
		treeMap.putAll(h);
		System.out.println(treeMap);
		System.out.println(treeMap.size());
		if (treeMap.containsKey("fried rice"))
			System.out.println(treeMap.get("fried rice"));
		if (treeMap.containsValue(10))
			System.out.println(treeMap.remove("lollipop"));

		//for (Map.Entry<String, Integer> i : treeMap.entrySet()) {
		//	System.out.println("Key = " + i.getKey() + " Value = " + i.getValue());
		//}
		treeMap.forEach((k,v)->System.out.println("Key = "+k+"  Value = "+v));
		treeMap.clear();
		if (treeMap.isEmpty())
			System.out.println("Empty ");

	}

}
