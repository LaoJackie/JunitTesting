import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MysteryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMystery1() {
		Mystery m = new Mystery("Test1");
		assertEquals(2,m.mystery1(10,4));
		assertEquals(4,m.mystery1(28,16));
		assertEquals(8,m.mystery1(-40,32));
		assertEquals(10,m.mystery1(50,90));
		assertEquals(144,m.mystery1(144,288));
		assertEquals(100,m.mystery1(10000,100));
		assertEquals(9,m.mystery1(1800,9));
		assertEquals(950,m.mystery1(2850,47500));
		assertEquals(105000,m.mystery1(525000,210000));
		assertEquals(2,m.mystery1(2,2));
	}
	
	@Test
	public void testMystery2() {
		Mystery m = new Mystery("Test2");
		assertEquals(1,m.mystery2(1,2,-3),0.01);
		assertEquals(.75,m.mystery2(4,5,-6),0.01);
		assertEquals(.71,m.mystery2(6,7,-8),0.01);
		assertEquals(.68,m.mystery2(8,9,-10),0.01);
		assertEquals(.67,m.mystery2(10,11,-12),0.01);
		assertEquals(.62,m.mystery2(89,90,-91),0.01);
		assertEquals(.62,m.mystery2(91,92,-93),0.01);
		assertEquals(.62,m.mystery2(93,94,-95),0.01);
		assertEquals(.63,m.mystery2(95,96,-97),0.01);
		assertEquals(.62,m.mystery2(97,98,-99),0.01);
	}

}
