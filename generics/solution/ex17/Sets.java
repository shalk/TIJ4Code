//: net/mindview/util/Sets.java
package generics.solution.ex17;

import static generics.watercolors.Watercolors.BRILLIANT_RED;
import static generics.watercolors.Watercolors.BURNT_UMBER;
import static generics.watercolors.Watercolors.CERULEAN_BLUE_HUE;
import static generics.watercolors.Watercolors.VIRIDIAN_HUE;
import static net.mindview.util.Print.print;

import java.util.*;

import generics.watercolors.Watercolors;

public class Sets {

	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		if (EnumSet.class.isInstance(a)) {
			Set<T> result = ((EnumSet) a).clone();
			result.addAll(b);
			return result;
		}
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}

	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		if (EnumSet.class.isInstance(a)){
			Set<T> result = ((EnumSet)a).clone();
			result.retainAll(b);
			return result;
		}
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}

	// Subtract subset from superset:
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
		if (EnumSet.class.isInstance(superset)) {
			Set<T> result = ((EnumSet)superset).clone();
			result.remove(subset);
			return result;
		}

		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}

	// Reflexive--everything not in the intersection:
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}
	public static void main(String[] args) {
		Set<Watercolors> set1 =
			EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		Set<Watercolors> set2 =
			EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		print("set1: " + set1);
		print("set2: " + set2);
		print("union(set1, set2): " + union(set1, set2));
		Set<Watercolors> subset = intersection(set1, set2);
		print("intersection(set1, set2): " + subset);
		print("difference(set1, set2): " + 
			difference(set1, set2));
		print("difference(set2, subset): " + 
			difference(set2, subset));
		print("complement(set1, set2): " + 
			complement(set1, set2));
	}
} /// :~
