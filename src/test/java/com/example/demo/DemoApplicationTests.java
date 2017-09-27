package com.example.demo;

import liquibase.util.SystemUtils;
import org.junit.Test;

public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Java version " + SystemUtils.JAVA_VERSION_FLOAT);
	}

}
