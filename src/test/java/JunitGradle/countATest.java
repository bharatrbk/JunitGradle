package JunitGradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countATest {

	@Test
	public void test1() {
	JunitTesting test1 = new JunitTesting();
	int output = test1.countA("alpha");
	assertEquals(2, output);
	}
	
	

}


