//: exceptions/Human.java
package exceptions.solution.ex30; /* Added by Eclipse.py */


class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

class WrapCheckedException1 {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new Sneeze();
			case 1:
				throw new Annoyance();
			case 2:
				throw new RuntimeException("Where am I?");
			default:
				return;
			}
		} catch (Exception e) { // Adapt to unchecked:
			throw new RuntimeException(e);
		}
	}
}

public class Human {
	public static void main(String[] args) {
		// Catch the exact type:
		WrapCheckedException1 wce = new WrapCheckedException1();
		for (int i = 0; i < 3; i++) {
			try {
				wce.throwRuntimeException(i);
			} catch (RuntimeException e) {
				try {
					throw e.getCause();
				} catch (Sneeze e2) {
					System.out.println("sneeze");
				} catch (Annoyance e2) {
					System.out.println("annoyance");
				} catch (Throwable e2) {
					System.out.println("throwable");
				}
			}
		}
	}
} /*
   * Output: Caught Sneeze Caught Annoyance
   */// :~
