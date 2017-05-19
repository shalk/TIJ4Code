//: exceptions/LostMessage.java
package exceptions.solution.ex18; /* Added by Eclipse.py */

// How an exception can be lost.

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class AnotherException extends Exception {
	public String toString() {
		return "Another Exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	void g() throws AnotherException {
		throw new AnotherException();
	}

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} finally {
				lm.g();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
} /*
   * Output: A trivial exception
   */// :~
