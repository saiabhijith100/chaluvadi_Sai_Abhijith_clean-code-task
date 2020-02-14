package saiabhijith_task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Area_for_construction_test {
private static double DELTA=1e-15;
	@Test
	public void test() {
		Area_for_construction ar=new Area_for_construction();
		String t="standardmaterials";
		if(t=="Standardmaterial") {
			assertEquals(12000,ar.standardmaterials("standardmaterials",10),DELTA);
		}
		assertEquals(15000,ar.abovestandardmaterial("abovestandardmaterial",10),DELTA);
	}

}
