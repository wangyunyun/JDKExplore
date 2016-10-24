package test.java.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class TestList {

	static List<String> static_list = new ArrayList<String>();
	
	static {
		static_list.add("1 string");
		static_list.add("2 string");
	}
	
	@Test
	public void test() {
		
		Comparator<String> compare = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		};
		
		static_list.sort(compare);
		System.out.print(static_list);
		
		System.out.println(static_list.subList(1, 2));
	}
}
