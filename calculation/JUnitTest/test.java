package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		calc1 calcu_mounth1 = new calc1( 1000,  1, 5);
			calc1 calcu_mounth2 = new calc1( 5000,  0.2, 5);
			calc1 calcu_mounth3 = new calc1( 10,  0.01, 1);
			calc1 calcu_mounth4 = new calc1( 10101,  0.10101, 101);
			assertSame(calcu_mounth1,calcu_mounth4);
			assertSame(calcu_mounth2,calcu_mounth3);
			

	}

}
