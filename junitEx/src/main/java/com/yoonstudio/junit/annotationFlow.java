package com.yoonstudio.junit;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class annotationFlow{
	//static method
	@BeforeClass
	public static void doBefore(){
		System.out.println("Starting test....");
	}
	
	@AfterClass
	public static void doAfter(){
		System.out.println("Shutdown test....");
	}

	@Before
	public void initialize(){
		System.out.println("Initialize test....");
	}
	
	@After
	public void finalize(){
		System.out.println("Finalize test....");
	}
	
	@Test 
	public void test1(){
		System.out.println("First test....");
		assertTrue(true);
	}

	@Test 
	public void test2(){
		System.out.println("Second test....");
		assertTrue(true);
	}	
}
