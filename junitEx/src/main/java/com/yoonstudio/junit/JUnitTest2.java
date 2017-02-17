package com.yoonstudio.junit;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest2 {
	public static long startTime = 0;
	public static long endTime = 0;
	
	@BeforeClass
	public static void doBefore(){
		startTime = System.currentTimeMillis();
		System.out.println("Starting test....");
	}
	
	@AfterClass
	public static void doAfter(){
		endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Shutdown test. Elaspsed time is " + (elapsedTime/1000) + " seconds");
	}
	
	@Test(timeout = 10000)
	public void calculateFirst() throws Exception {
		Thread.sleep(20000);
		System.out.println("Calculate First~");
		assertTrue(true);
	}
	

}
