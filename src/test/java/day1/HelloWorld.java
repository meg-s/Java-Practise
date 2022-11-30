package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {
	public String printHello(String firstName, String lastName) {
		return "Hello "+firstName+lastName;
	}
	
	@Test
	public void Test1() {
		//HelloWorld hello = new HelloWorld();
		System.out.println(printHello("Megha ", "Sreejith"));
		Assert.assertTrue(true);

	}

}
