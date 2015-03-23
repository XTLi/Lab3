package primeFactorization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorizationTest {

	private List<Integer> list(Integer...integers) {
		// TODO Auto-generated method stub
		return Arrays.asList(integers);
	}
	
	@Test
	public void test_1() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}

	@Test
	public void test_2() throws Exception {
		assertEquals(list(2), PrimeFactorization.generate(2));
	}

}
