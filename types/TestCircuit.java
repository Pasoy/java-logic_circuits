import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCircuit {
	
	private Bit a, b, c;

	@Before
	public void setUp() throws Exception {
		a = new Bit(true);
		b = new Bit(false);
		c = new Bit(false);
	}

	@Test
	public void test() {
		assertEquals(true, new Or(new Not(new And(a, b)), new Or(a, c)).truthValue());
	}

}
