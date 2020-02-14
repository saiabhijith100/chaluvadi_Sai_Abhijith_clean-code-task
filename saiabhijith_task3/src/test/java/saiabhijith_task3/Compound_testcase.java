package saiabhijith_task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Compound_testcase {
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		Compound_interst ci= new Compound_interst();
		assertEquals(828.0000000000002,ci.compound_interst(1200,30,2),DELTA);
	}

}
