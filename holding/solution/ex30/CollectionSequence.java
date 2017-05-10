//: holding/CollectionSequence.java
package holding.solution.ex30; /* Added by Eclipse.py */

import typeinfo.pets.*;
import java.util.*;

import holding.InterfaceVsIterator;

public class CollectionSequence implements Collection<Pet> {
	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
		String[] aa = (String[])list.toArray( new String[0]);
		System.out.println(aa[0]);
		System.out.println(aa[1]);
		System.out.println(aa[2]);
		System.out.println(aa.length);
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for(int i = 0; i < pets.length ; i++){
			if(pets[i] == o){
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return pets;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(Pet e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}
} /*
   * Output: 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 0:Rat
   * 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
   */// :~
