package rays.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(1);
		hashSet.add(10);
		hashSet.add(3);
		hashSet.add(7);
		hashSet.add(2);
		hashSet.add(9);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(8);

		Set<Integer> treeSet = new TreeSet<>(hashSet);

		Set<Integer> linkedHashSet = new LinkedHashSet<>(hashSet);

		System.out.println("HashSet elements:");
		Iterator<Integer> hashSetIterator = hashSet.iterator();
		while (hashSetIterator.hasNext()) {
			System.out.print(hashSetIterator.next() + " ");
		}
		System.out.println();

		System.out.println("TreeSet elements:");
		Iterator<Integer> treeSetIterator = treeSet.iterator();
		while (treeSetIterator.hasNext()) {
			System.out.print(treeSetIterator.next() + " ");
		}
		System.out.println();

		System.out.println("LinkedHashSet elements:");
		Iterator<Integer> linkedHashSetIterator = linkedHashSet.iterator();
		while (linkedHashSetIterator.hasNext()) {
			System.out.print(linkedHashSetIterator.next() + " ");
		}
		System.out.println();
	}
}
