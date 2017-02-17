package com.yoonstudio.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private String parameterName;
	private String paremeterValue;
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{"Parameter1", "Value1"},
				{"Parameter2", "Value2"},
				{"Parameter3", "Value3"},
				{"Parameter4", "Value4"},
				{"Parameter5", "Value5"},
				{"Parameter6", "Value6"},
				{"Parameter7", "Value7"}
				
		});
	}

	public ParameterizedTest(String parameterName, String paremeterValue){
		System.out.println("Test case is started");
		this.parameterName = parameterName;
		this.paremeterValue = paremeterValue;
	}
	
	@Test
	public void printParameters(){
		System.out.println("Parameyer Name : " + parameterName + ", Parameter Value : " + paremeterValue);
		assertTrue(true);
	}

}
