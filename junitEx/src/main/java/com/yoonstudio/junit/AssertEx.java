package com.yoonstudio.junit;

import junit.framework.Assert;

import org.junit.Test;

public class AssertEx {
	@Test
	public void testAssertArrayEquals(){
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		Assert.assertEquals("failure - byte arrays not same", expected, actual);
		
	}
	
	@Test 
	public void testAssertEquals(){
		Assert.assertEquals("failure - byte arrays not same", "text", "text");
	}

}
