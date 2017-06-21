//: generics/Mixins.java
package generics.solution.ex37; /* Added by Eclipse.py */

import java.util.*;

interface TimeStamped {
	long getStamp();
}

class TimeStampedImp implements TimeStamped {
	private final long timeStamp;

	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}

	public long getStamp() {
		return timeStamp;
	}
}

interface SerialNumbered {
	long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;

	public long getSerialNumber() {
		return serialNumber;
	}
}

interface Basic {
	public void set(String val);

	public String get();
}

class BasicImp implements Basic {
	private String value;

	public void set(String val) {
		value = val;
	}

	public String get() {
		return value;
	}
}
interface NoteBook{
	public void write(String msg);
	public String read();
}

class NoteBookImp implements NoteBook {
	
	StringBuffer sb = new StringBuffer();
	@Override
	public void write(String msg) {
		System.out.println("write into notebook:" + msg);
		sb.append(msg);
	}

	@Override
	public String read() {
		return sb.toString();
	}
	
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered, NoteBook{
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	private NoteBook notebook = new NoteBookImp();

	public long getStamp() {
		return timeStamp.getStamp();
	}

	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}

	@Override
	public void write(String msg) {
		notebook.write(msg);
	}

	@Override
	public String read() {
		return notebook.read();
	}
}

public class Mixins {
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
		mixin1.write("first line");
		mixin1.write("2nd line");
		mixin2.write("mutiple line");
		System.out.println(mixin1.read());
		System.out.println(mixin2.read());
	}
} /*
   * Output: (Sample) test string 1 1132437151359 1 test string 2 1132437151359
   * 2
   */// :~
