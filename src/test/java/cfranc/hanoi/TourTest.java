package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {


	Disque d1 = new Disque(1);
	Disque d2 = new Disque(2);

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourPleine_FLASE() {

		Tour _TourPleine = new Tour(1);
		_TourPleine.empiler(d2);

		boolean expected = false;
		boolean acrtual = _TourPleine.empiler(d1);

		assertEquals(expected, acrtual);
	}

	@Test
	/**
	 *
	 */
	public void testStack_isEmpty(){

		Tour tEmpty = new Tour();

		boolean expected = true;
		boolean actual = tEmpty.disques.isEmpty();

		assertEquals(expected, actual);

	}

	@Test
	/**
	 *
	 */
	public void testStack_() {

	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourNonVideDiscPlusPetit_TRUE() {

		Tour _TourPleine = new Tour(3);
		_TourPleine.empiler(d2);

		boolean expected = true;
		boolean acrtual = _TourPleine.empiler(d1);

		assertEquals(expected, acrtual);
	}



}
