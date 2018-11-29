package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test4 {

	@Test
	public void test() {
		 calculation.calc1 calcu_mounth1 = new calculation.calc1( 1001,  1, 5);
		 calculation.calc1 calcu_mounth2 = new calculation.calc1( 121,  1, 5);
		 calculation.calc1 calcu_mounth3 = new calculation.calc1( 1001,  0.1, 3);
		 calculation.calc1 calcu_mounth4 = new calculation.calc1( 102,  0.7, 6);
			boolean differentValuesOneResult;
			
			if(calcu_mounth4 == calcu_mounth2)
			{
				differentValuesOneResult = true;
			}
		    
			else differentValuesOneResult = false;
			
			
			assertTrue(differentValuesOneResult);

	}

}
