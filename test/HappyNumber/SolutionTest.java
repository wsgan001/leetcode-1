package HappyNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution s = new Solution();
		if (s.isHappy(2))
			fail("not correct");
	}

}
