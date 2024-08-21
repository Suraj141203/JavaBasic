package rays.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teststudent {
	public static void main(String[] args) {
		
		List <Student> l = new ArrayList<Student>();
		
		l.add(new Student ("Suraj" , 20));
		l.add(new Student ("Yadav" , 19));
		l.add(new Student ("aniket", 17));
		l.add(new Student ("rohit", 18));
		l.add(new Student ("Himanshu" , 16));
		
		Collections .sort(l);
		for(Student i:l) {
			System.out.println(i);
		}
	
	}
	
	}
