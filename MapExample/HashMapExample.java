package MapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		HashMap<String, Integer> h = new HashMap<>();
		h.put("fried rice", 70);
		h.put("noodles", 80);
		hashMap.put("Icecream", 25);
		hashMap.put("Chocolate", 15);
		hashMap.put("lollipop", 10);
		hashMap.putAll(h);
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		if (hashMap.containsKey("fried rice"))
			System.out.println(hashMap.get("fried Rice"));
		if (hashMap.containsValue(10))
			System.out.println(hashMap.remove(70));

		for (Map.Entry<String, Integer> i : hashMap.entrySet()) {
			System.out.println("Key = " + i.getKey() + " Value = " + i.getValue());
		}
		hashMap.clear();
		if (hashMap.isEmpty())
			System.out.println("Empty ");

	}
}
