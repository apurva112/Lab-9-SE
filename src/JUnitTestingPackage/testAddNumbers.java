package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction test = new jUnitFunction();
		int result = test.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
