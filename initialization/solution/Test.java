package initialization.solution;
import static net.mindview.util.Print.*;
class Book {
	Book(){
		print("book create");
	}
	Book(String name){
		print("book [" + name + "] created" );
	}
	Book(String name,String tag){
		print("book [" + name + "] created with tag:" + tag);
	}
}
class BookStore {
	String name;
	Book book1 = new Book("book1");
	static Book book2 = new Book("book2","static");
	BookStore(){
		print("BookStore create");
	}
	BookStore(String s){
		name = s;
		print("bookstore [" + name + "] create");
	}
}
class BigBookStore {
	static BookStore bs1 = new BookStore("BookStore1");
	static BookStore bs2 = new BookStore("BookStore2");
	BigBookStore(){
		print("BigBookStore create");
	}
}

class MagicBook extends Book {
	Book basebook1 = new Book();
	static Book basebook2 = new Book("basebook2","static");
	MagicBook(){
		print("magicbook create");
	}
}
enum Color {
    BLUE,
    RED,
    GREEN
}

public class Test {
	
	public static void main(String[] args){
		BigBookStore bbs = new BigBookStore();
		MagicBook mb = new MagicBook();
		int[] a1 = {1,2,3};
		int[] a2 = new int[]{1,2,3};
		int[] a3 = new int[5];
		String[] a4 = new String[]{
				"1","3",new String(),
		};
		for(int i : a3){
			System.out.print(i);
		}
	       Color a = Color.BLUE;
	       System.out.println(a.ordinal());
	       for(Color s : Color.values()){
	           System.out.println(s);
	        }   
	}
}
