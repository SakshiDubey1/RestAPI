package com.SampleCode1.SampleCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper= new StringHelper();

	@Test
	public void testtruncate_AInFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testtruncate_ANoWhere() { 
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testtruncate_AInLast2Position() {
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
		assertEquals("BCDA",helper.truncateAInFirst2Positions("BCDA"));
	}
	@Test
	public void testtruncate_whenEnteredNull() {
		assertEquals("",helper.truncateAInFirst2Positions(""));
	}
}
