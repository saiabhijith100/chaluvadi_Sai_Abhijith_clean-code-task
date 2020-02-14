package saiabhijith_task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Simple_InterstTest {
	private static final double DELTA=1e-15;
	@Test
	public void testSimpleinterst() {
		Simple_Interst si=new Simple_Interst();
		assertEquals(800,si.simpleinterst(2000,10,4),DELTA);
	}
	

}
