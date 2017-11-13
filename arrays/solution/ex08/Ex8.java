//: arrays/ArrayOfGenericType.java
package arrays.solution.ex08; /* Added by Eclipse.py */
// Arrays of generic types won't compile.

class ArrayOfGenericType<T> {
  T[] array; // OK
//  @SuppressWarnings("unchecked")
  @SuppressWarnings("unchecked")
public ArrayOfGenericType(int size) {
    //! array = new T[size]; // Illegal
    array = (T[])new Object[size]; // "unchecked" Warning
  }
  // Illegal:
  //! public <U> U[] makeArray() { return new U[10]; }
} ///:~

class Apple {
	
}
public class Ex8 {
	public static void main(String[] args) {
		ArrayOfGenericType<String> s1 = new ArrayOfGenericType<>(10);
//		s1.array[0] = 10;
//		s1.array[1] = 1.0;
		//error runtime
		s1.array[2] = new String("aa");
//		s1.array[3] = new Apple();
		ArrayOfGenericType<Object> o1 = new ArrayOfGenericType<>(10);
		o1.array[0] = 10;
		o1.array[1] = 1.0;
		o1.array[2] = "msg";
		o1.array[3] = new Apple();

	}
}
