package CollectionExample;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExamples {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(5);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(0);
		// adding ArrayList to TreeSet
		treeSet.addAll(arrayList);
		System.out.println(treeSet.size());
		System.out.println(treeSet);
		if (treeSet.contains(3))
			treeSet.remove(3);
		System.out.println(treeSet);
		treeSet.clear();
		if (treeSet.isEmpty()) {
			System.out.println(treeSet.size());
		}
	}
}
