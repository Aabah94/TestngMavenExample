package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.BooleanValue;
import com.agiletestware.bumblebee.annotations.Bumblebee;

@Bumblebee(testlab = "Root\\TestBumblebee", testset = "TestBumblebee", testplan = "Subject\\TestBumblebee", testphase = "Funtional")
public class TestNgMavenExample {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}
}
