import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		Prime p = new Prime();
		boolean m = p.check(5);
		assertTrue(m);
	}

}
