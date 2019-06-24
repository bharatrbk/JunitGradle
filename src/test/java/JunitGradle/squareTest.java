package JunitGradle;


import static org.junit.Assert.*;

import org.junit.Test;


public class squareTest {

	@Test //which marks methods that are to be run as tests.
	public void test2() {
		JunitTesting test2 = new JunitTesting();
		int output = test2.square(5);
		assertEquals(25, output);
		
	}

}
