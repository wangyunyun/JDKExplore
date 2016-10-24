package test.java.util;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class TestAbstractCollection {

	AbstractCollection<String> col = new ArrayList<String>();

	@Test
	public void test() {
		
	}
	
	class MyCollection<E> extends AbstractCollection<E> {

		// iterator 相当于整个collection的存储，就是 ArrayList，LinkedList等会实现具体的存储
		@Override
		public Iterator<E> iterator() {
			return null;
		}

		@Override
		public int size() {
			return 0;
		}
		
	}
}
