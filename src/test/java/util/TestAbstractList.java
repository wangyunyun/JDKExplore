package test.java.util;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.Test;

public class TestAbstractList {

	@Test
	public void testListIterator() {
		AbstractList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		
		ListIterator<String> listIterator = al.listIterator();
//		listIterator.remove();
		listIterator.add("forth");
//		listIterator.set("five");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
	}
}
