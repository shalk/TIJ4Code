package generics.solution.ex29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import static net.mindview.util.Print.*;
import generics.Holder;

public class Ex29 {
	static void f1(Holder<List<?>> holder) {
		print("Calling methods for the Holder: ");
		print("holder: " + holder);
		print("holder.get(): " + holder.get());
		print("Calling holder.set(Arrays.asList(1,2,3)");
		holder.set(Arrays.asList(1,2,3));
		print("holder.get(): " + holder.get());
		int[] ia = {1,2,3};
		print("int[] ia = {1,2,3}");
		print("holder.equals(ia): " + holder.equals(ia));

		List iaList = Arrays.asList(ia);
		print("List iaList = Arrays.asList(ia)");
		print("holder.equals(iaList): " + holder.equals(iaList));

		List<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i < 4; i++) l.add(i);
		print("l = List<Integer>() and add 1,2,3");
		print("holder.equals(l): " + holder.equals(l));
		print();
					
		print("Calling methods for the List: ");
		print("holder.get(): " + holder.get());
		print("holder.get().getClass(): " + holder.get().getClass());
		// Incompatible types:
		// List<? extends Integer> list = holder.get();
		// OK, but can't add anything:
		List<?> list = holder.get();
		print("list: " + list); 
		// list.add(new Object());		
		List list1 = holder.get(); // OK, but:
		// list1.add(new Object()); // Warning: unchecked call to add(E) and
		// UnsupportedOperationException at runtime
		print("list1.getClass(): " + list1.getClass());
		print("list.equals(list1): " + list.equals(list1));
		// list.clear(); // runtime UnsupportedOperationException
 		print("list.contains(1): " + list.contains(1));		
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 1; i < 4; i++) c.add(i);
		print("list.containsAll(c): " + list.containsAll(c));	
		print("list.equals(c): " + list.equals(c));
		print("list = " + list);
		print("c = " + c);
		print("c.getClass(): " + c.getClass()); // c is not a List
		print("list.get(0) = " + list.get(0));
		print("list.hashCode() = " + list.hashCode());
		print("list.indexOf(2) = " + list.indexOf(2));	
		ListIterator li = list.listIterator();
		print("After ListIterator li = list.listIterator():");
		print("li.next() = " + li.next());
		// runtime errors: UnsupportedOperationException:
		// list.remove(0);
		// list.removeAll(c);
		// list.retainAll(c1);
		// list.set(1,4); // compile error: set(int, ?) in list<?> cannot
		// be applied to (int,int)
		print("list.size() = " + list.size());
		print("list.subList(1,2) = " + list.subList(1,2));
		Object[] oa = list.toArray();
		print("After Object[] oa = list.toArray():");
		print("oa = ");
		for(Object o : oa) print(o + " ");
		print(); 
		// Error: runtime error ArrayStoreException:
		// Double[] da = list.toArray(new Double[3]);
		Number[] na = list.toArray(new Number[3]);
		print("After Number[] na = list.toArray(new Number[3]):");
		print("na = ");
		for(Number n : na) print(n + " ");
		print();
	}
	public static void foo1(Holder<List<?>> h) {
		print("get:"+ h.get());
		print("set:");
		h.set(Arrays.asList(1,2,3));
		print("get:"+ h.get());
		int a[] = {1,2,3};
		print("array a:"+Arrays.toString(a));
		List<Integer> b = new ArrayList<Integer>();
		b.addAll(Arrays.asList(1,2,3));
		print("equals a:"+h.equals(a));
		print("equals b:"+h.equals(b));
		h.set(b);
		b.add(100);

		print("Calling methods for the List: ");
		print("holder.get(): " + h.get());
		print("holder.get().getClass(): " + h.get().getClass());	
		List<?> list1 = h.get();
		print("isEmpty():" + list1.isEmpty());
		print("size():" + list1.size());
//		list1.add(4); can not use add()
//		list1.remove(3);
		print("remove(100):" + list1.remove(new Integer(100)));
		print("get(0):" + list1.get(0));
//		list1.set(1, 5);
		print("subList():" + list1.subList(0,2)); 
		ListIterator itr = list1.listIterator();
		printnb("listIterator():");
		while (itr.hasNext()) {
			printnb(itr.next() + " ");
		}
		print();
		print("contain(0):"+list1.contains(0));

		Object[] objs =list1.toArray();
		print("toArray():" + Arrays.toString(objs));
		
		Integer[] nums = list1.toArray(new Integer[0]);
		print("toArray(T[]):" + Arrays.toString(nums));
		
		print("hashCode:" + list1.hashCode());
		print("indexOf(3):" + list1.indexOf(3));
		print("lastIndexOf(3):" + list1.lastIndexOf(3));
	}
	
	public static void foo2(List<Holder<?>> list) {
		Holder<?> h1 = new Holder<>(10);
		Holder<?> h2 = new Holder<>(10);
		Holder<?> h3 = new Holder<>(15);
		Holder<?> h4 = new Holder<>(20);
		print("Holder get():" + h1.get());
//		print("Holder set()" + h1.set());
		print("Holder equals():" + h1.equals(10));
		print("List add()");
		list.add(h1);
		list.add(h2);
		list.add(h3);
		print(list.toString());
		print("List set():" + list.set(0, h4));
		print("List add():" + list.add(h4));
		print("List size():" + list.size());
		print("List remove():" + list.remove(3));
		print("List contain():" + list.contains(h2));
		print("List indexof():" + list.indexOf(h1));
		print("List isEmpty():" + list.isEmpty());
		print("List hashCode():" + list.hashCode());
		
		Holder<?>[] holders1 = list.toArray(new Holder<?>[0]);
		for (Holder<?> h:holders1) {
			print(h.get().toString());
		}

		Object[] holders2 = list.toArray();
		for (Object o: holders2) {
			print(((Holder<?>)o).get().toString());
		}
		
		
	}
	
	public static void main(String[] args) {
		Holder<List<?>> h = new Holder<>();
		List<String> list1 = new ArrayList<String>();
		list1.add("first");
		h.set(list1);
		Ex29.foo1(h);
		List<Holder<?>> list2 = new ArrayList<>();
		Ex29.foo2(list2);
	}
}
