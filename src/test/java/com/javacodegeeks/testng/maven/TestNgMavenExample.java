package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.BooleanValue;
import com.agiletestware.bumblebee.annotations.Bumblebee;

@Bumblebee(testlab = "Root\\TestBumblebee2", testset = "TestBumblebee2", testplan = "Subject\\TestBumblebee2")
public class TestNgMavenExample {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
}
