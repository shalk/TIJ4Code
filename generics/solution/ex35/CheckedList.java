//: generics/CheckedList.java
package generics.solution.ex35; /* Added by Eclipse.py */

// Using Collection.checkedList().
//import typeinfo.pets.*;

import generics.coffee.*;
import java.util.*;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Mocha());
	}

	public static void main(String[] args) {
		List<Latte> lattes1 = new ArrayList<Latte>();
		oldStyleMethod(lattes1); // Quietly accepts a Mocha
		
		List<Latte> lattes2 = Collections.checkedList(new ArrayList<Latte>(), Latte.class);
		lattes2.add(new Latte());
		try {
			oldStyleMethod(lattes2);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

		List<Coffee> coffee1  = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
		coffee1.add(new Latte());
		coffee1.add(new Mocha());
		try {
			oldStyleMethod(coffee1);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
} /*
   * Output: java.lang.ClassCastException: Attempt to insert class
   * typeinfo.pets.Cat element into collection with element type class
   * typeinfo.pets.Dog
   */// :~
