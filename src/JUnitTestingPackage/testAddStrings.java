package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction test = new jUnitFunction();
		String result = test.addStrings("Hello ", "World");
		assertEquals("Hello World", result);
	}

}
