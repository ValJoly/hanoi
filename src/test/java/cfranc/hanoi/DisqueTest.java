package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dTall = new Disque(3);

	// @Test
	// public void testCompareTo() {
	//
	// 	assertEquals(-1, dSmall.compareTo(dMedium));
	// 	assertEquals(-1, dMedium.compareTo(dTall));
	// 	assertEquals(-1, dSmall.compareTo(dTall));
	//
	// 	assertEquals(1, dMedium.compareTo(dSmall));
	// 	assertEquals(1, dTall.compareTo(dMedium));
	// 	assertEquals(1, dTall.compareTo(dSmall));
	//
	// 	assertEquals(0, dMedium.compareTo(dMedium));
	// 	assertEquals(0, dTall.compareTo(dTall));
	// 	assertEquals(0, dSmall.compareTo(dSmall));
	//
	// 	This Test is not a good choice due to the white-box test we are running
	// 	we know that we can just use 3 test and 2 discs a big one and a small one
	//
	//	The equal test can be remove based on the rules of the hanoi tower
	//	But in this case we can keep it because there are not much test to right
	// }

	@Test
	public void testCompareTo_SmallerThan_Negative() {

		assertEquals(-1, dSmall.compareTo(dTall));
	}

	@Test
	public void testCompareTo_GreaterThan_Negative() {

		assertEquals(1, dTall.compareTo(dSmall));
	}

	@Test
	public void testCompareTo_Equal_Null() {

		assertEquals(0, dSmall.compareTo(dSmall));
	}

}
