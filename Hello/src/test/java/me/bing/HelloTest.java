package me.bing;
import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("World");
		assertEquals("Hello World!",results);		
	}	
}