package test.java.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestArrayList {

	@Test
	public void addAll() {
		List<String> source = new ArrayList<String>();
		List<String> toAdd = new ArrayList<String>();
		source.addAll(toAdd);
		
		List<Integer> list = new ArrayList<>();
		source.toArray(list.toArray());
	}
}
