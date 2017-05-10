//: holding/NonCollectionSequence.java
package holding.solution.ex32; /* Added by Eclipse.py */

import typeinfo.pets.*;
import java.util.*;

import holding.InterfaceVsIterator;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
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

	public Iterable<Pet> reversed() {
		return new Iterable<Pet>(){
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>(){
					private int current = pets.length - 1;
					@Override
					public boolean hasNext() {
						return current >= 0;
					}
					@Override
					public Pet next() {
						return	pets[current--];
					}
					
				};
			}
		};
	}

	public Iterable<Pet> randomnized() {
		return new Iterable<Pet>(){
			@Override
			public Iterator<Pet> iterator(){
				return new Iterator<Pet>(){
					private List<Pet> rpets = new ArrayList<Pet>(Arrays.asList(pets)); 
//					private List<Pet> rpets = Arrays.asList(pets); 
					{ 
						Collections.shuffle(rpets);
						
					}
					private int index = 0;
					@Override
					public boolean hasNext() {
						return index < rpets.size();
					}

					@Override
					public Pet next() {
						// TODO Auto-generated method stub
						return rpets.get(index++);
					}
					
				};
				
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		for (Pet a : nc) {
			System.out.print(a.id() + ":" + a + " ");
		}
		System.out.println();
		for (Pet a : nc.reversed()) {
			System.out.print(a.id() + ":" + a + " ");
		}
		System.out.println();
		for (Pet a : nc.randomnized()) {
			System.out.print(a.id() + ":" + a + " ");
		}
		System.out.println();
		for (Pet a : nc) {
			System.out.print(a.id() + ":" + a + " ");
		}
		System.out.println();
	}
} /*
   * Output: 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
   */// :~
