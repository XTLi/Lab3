package primeFactorization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorizationTest {

	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}
	
	@Test
	public void test_1() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}


}
