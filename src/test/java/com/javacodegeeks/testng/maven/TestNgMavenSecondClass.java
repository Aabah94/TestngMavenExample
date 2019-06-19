package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.BooleanValue;
import com.agiletestware.bumblebee.annotations.Bumblebee;

@Bumblebee(testlab = "Root\\TestBumblebee2", testset = "TestBumblebee2", testplan = "Subject\\TestBumblebee2")
public class TestNgMavenSecondClass {

	@Test
	public void oneMoreTest() {
		System.out.println("This is a TestNG-Maven based test");
	}
}
