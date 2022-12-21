package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		// array need to provide size at the time of creation 

		// collection framework 
		// Collection - interface (List, Set, Queue)
		// Collections - class
		// basic nature
		// duplicates
		// Set allow natural sorting (TreeSet) but list doesn't allow natural sorting
		// Natural - at the time of insertion, Comparable - natural
		// Customized                          Comparator - Customized


		List<String> ls=new ArrayList<String>();
		Set<String> set1=new TreeSet<String>();
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		//int counter = 0;
		while(running) {
			System.out.println("Enter Data to add");
			String str = scan.next();

			if(str.equalsIgnoreCase("exit")) {
				running = false;
			}
			ls.add(str);
			set1.add(str);
			//		 ar[counter] = str;
			// counter++;
			System.out.print("List = ");
			for(String s  :ls) {System.out.print(s+",");}
			System.out.println();
			System.out.print("Set = ");
			for(String s  :set1) {System.out.print(s+",");}
			System.out.println();
		}


		Collections.sort(ls);
		System.out.print("List = ");
//		for(String s  :ls) {System.out.print(s+",");}
//		System.out.println();
		
		// Iterator
		
		Iterator iter = ls.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());		
		}

	}
}

class Human{
	int age;
	String name;
	double weight;
}

