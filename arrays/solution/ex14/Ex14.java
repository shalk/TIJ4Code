package arrays.solution.ex14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class Ex14 {

	// array should be initailized 
	public static <T>  T[] array(T[] a, Generator<T> gen){
		ArrayList<T> list = new ArrayList<T>();
		for (int i = 0 ; i < a.length; i++) {
			list.add(gen.next());
		}
		return list.toArray(a);
	}
	
	@SuppressWarnings({ "unchecked" })
	public static <T> T[] array(Class<T> type,  Generator<T> gen, int size) {
		T[] a = (T[]) Array.newInstance(type, size);
		return array(a, gen);
	}
	
	public static class Converter {
		public int[] convert(Integer[] a){
			return null;
		}
		public Integer[] convert(int[] a){
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] a1 = Ex14.array(Integer.class, new CountingGenerator.Integer(), 10);
		Short[] a2 = Ex14.array(Short.class, new CountingGenerator.Short(), 10);
		Long[] a3 = Ex14.array(Long.class, new CountingGenerator.Long(), 10);
		Float[] a4 = Ex14.array(Float.class, new CountingGenerator.Float(), 10);
		Double[] a5 = Ex14.array(Double.class, new CountingGenerator.Double(), 10);
		Byte[] a6 = Ex14.array(Byte.class, new CountingGenerator.Byte(), 10);
		Character[] a7 = Ex14.array(Character.class, new CountingGenerator.Character(), 10);
		Boolean[] a8 = Ex14.array(Boolean.class, new CountingGenerator.Boolean(), 10);
		int b1[] = ConvertTo.primitive(a1);
		short b2[] = ConvertTo.primitive(a2);
		long b3[] = ConvertTo.primitive(a3);
		float b4[] = ConvertTo.primitive(a4);
		double b5[] = ConvertTo.primitive(a5);
		byte b6[] = ConvertTo.primitive(a6);
		char b7[] = ConvertTo.primitive(a7);
		boolean b8[] = ConvertTo.primitive(a8);
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		System.out.println(Arrays.toString(b4));
		System.out.println(Arrays.toString(b5));
		System.out.println(Arrays.toString(b6));
		System.out.println(Arrays.toString(b7));
		System.out.println(Arrays.toString(b8));
	}
}
