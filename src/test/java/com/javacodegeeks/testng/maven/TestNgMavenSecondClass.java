package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.BooleanValue;
import com.agiletestware.bumblebee.annotations.Bumblebee;

@Bumblebee(testlab = "Root\\TestBumblebee", testset = "TestBumblebee", testplan = "Subject\\TestBumblebee")
public class TestNgMavenSecondClass {

	@Test
	public void oneMoreTest() {
		System.out.println("This is a TestNG-Maven based test");
	}
}
