package com.yoonstudio.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class JUnitTest {
	static Set<JUnitTest> testObject = new HashSet<JUnitTest>();
	
	@Test public void test1(){
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
	}

	@Test public void test2(){
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
	}
	
	@Test public void test3(){
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
	}
	
}
