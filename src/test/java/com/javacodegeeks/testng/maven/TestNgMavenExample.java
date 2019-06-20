package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.BooleanValue;
import com.agiletestware.bumblebee.annotations.Bumblebee;


public class TestNgMavenExample {
@Bumblebee(testname= "Tesng code", testlab = "Root\\TestBumblebee", testset = "TestBumblebee", testplan = "Subject\\TestBumblebee")
	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
}
