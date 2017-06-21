//: generics/MultipleInterfaceVariants.java
package generics.solution.ex31; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)

interface Payable {
	void test();
}

class Employee implements Payable {

	@Override
	public void test() {
		
	}}

class Hourly extends Employee
  implements Payable {} ///:~
