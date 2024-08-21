package com.rays.exception;

import java.util.ArrayList;
import java.util.List;

public class TestListInterface {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(65);
		list.add('A');
		list.add("KGF");
		list.add(null);
		list.add("KGF");
		list.add("Kalki");

		System.out.println("List = " + list);

		System.out.println("test list add method = " + list);

		System.out.println("search index from start = " + list.indexOf(null));

		System.out.println("search index from last = " + list.lastIndexOf('A'));

		System.out.println("search element by index = " + list.get(2));

		System.out.println("search elements by start to end = " + list.subList(1, 6));


		System.out.println(list);
	}

}
