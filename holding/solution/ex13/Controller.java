//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package holding.solution.ex13;

import java.util.*;

public class Controller {
	// A class from java.util to hold Event objects:
	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {
		while (eventList.size() > 0) {
			// Make a copy so you're not modifying the list
			// while you're selecting the elements in it:
			Iterator<Event> it = new LinkedList<Event>(eventList).iterator();
			while (it.hasNext()) {
				Event e = it.next();
				if (e.ready()) {
					System.out.println(e);
				    System.out.println(e.delayTime);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
} /// :~
