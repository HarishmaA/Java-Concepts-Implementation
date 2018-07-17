package CollectionExample;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(5);
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		linkedHashSet.add(6);
		linkedHashSet.add(0);
		linkedHashSet.addAll(arrayList);
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet);
		if (linkedHashSet.contains(3))
			linkedHashSet.remove(3);
		System.out.println(linkedHashSet);
		linkedHashSet.clear();
		if (linkedHashSet.isEmpty()) {
			System.out.println(linkedHashSet.size());
		}
	}

}
