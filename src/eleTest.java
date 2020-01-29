import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class eleTest {
    ele e;
    @Before
    public void init()
    {
    	e = new ele();
    }
	@Test
	public void test() {
		String m = e.election(18);
		assertEquals("eligible to vote",m);		
	}
	@Test
	public void test1() {
		String m = e.election(17);
		assertEquals("eligible to vote",m);		
	}


}
