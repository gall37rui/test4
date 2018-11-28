package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		calculation.calc1 calcu_mounth = new calculation.calc1( 1000,  1, 5);
		assertEquals(252.66,calcu_mounth.mes_plateg,0.01);
		calculation.calc1 calcu_mounth1 = new calculation.calc1( 50000,  0.2, 5);
			assertEquals(10505.50,calcu_mounth1.mes_plateg,0.01);
			calculation.calc1 calcu_mounth2 = new calculation.calc1( 10,  0.1, 1);
			  assertEquals(10.08,calcu_mounth2.mes_plateg,0.01);
			  calculation.calc1 calcu_mounth3 = new calculation.calc1( 10101,  0.10101, 101);
			    assertEquals(148.87,calcu_mounth3.mes_plateg,0.01);

	}

}
