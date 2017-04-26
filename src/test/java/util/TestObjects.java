package test.java.util;

import java.util.Objects;

import org.junit.Test;

import junit.framework.Assert;

public class TestObjects {

//	@Test
	public void equals() {
		String[] a = new String[]{"a", "b"};
		String[] b = new String[]{"a", "b"};
		
		Assert.assertTrue(Objects.deepEquals(a, b));
		Assert.assertFalse(Objects.equals(a, b));
	}
	
	
	@Test
	public void testHashCode() {
		String a = "12";
		System.out.println(Objects.hashCode(a));
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals("null String", Objects.toString(null, "null String"));
	}
	
	@Test
	public void testRequireNoNull() {
		Objects.requireNonNull(null);
	}
	
	
}
