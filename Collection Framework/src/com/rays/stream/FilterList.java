package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sakshi");
		list.add("Sakshi");
		list.add("Akkhu");
		list.add("Nandu");
		list.add("Rathore");
		list.add("Suraj");
		
		System.out.println(list);
		
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		list.stream().sorted().map(e -> e.toUpperCase()).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
	    list.stream().sorted().map(e -> e.toUpperCase()).distinct().forEach(System.out::println);
        list.stream().filter(e -> e.startsWith("S")).forEach(System.out::println);;
	}

}
