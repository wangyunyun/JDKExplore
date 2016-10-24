package test.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class TestCollection {

	class MyColection<T> implements Collection<T> {

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <E> E[] toArray(E[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(Object e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**
	 * 接口的继承不需要重复写父接口的方法
	 * @author wangxiangyun
	 *
	 * @param <E>
	 */
	interface MyInter<E> extends Collection<E> {
		boolean equals(Object o);
	}
	
	/**
	 * Object[] toArray() 
	 * <T> T[] toArray(T[] a) 要求T与collection本身的类型T一致，否则会抛出 {@link ArrayStoreException}  
	 */
	@Test
	public void testToArray() {
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(12);
		c.add(34);
		
		try {
			String[] array = c.toArray(new String[0]);
			for(String s : array)
				System.out.println(s);
		} catch (ArrayStoreException e) {
			System.err.println("error:" + e.getMessage());
		}
		
		Integer[] A = c.toArray(new Integer[0]);
		for(Integer s : A)
			System.out.println(s);
		
		for(Object s : c.toArray()) {
			if(s instanceof Integer) {
				System.out.println((Integer)s);
			} else {
				System.out.println("not Integer, toString is:" + s.toString());
			}
		}
	}
}
