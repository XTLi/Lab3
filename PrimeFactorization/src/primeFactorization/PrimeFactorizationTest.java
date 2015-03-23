package primeFactorization;

import static org.junit.Assert.*;
import static primeFactorization.PrimeFactorization.generate;

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
		assertEquals(list(), generate(1));
	}

	@Test
	public void test_2() throws Exception {
		assertEquals(list(2), generate(2));
	}

	@Test
	public void test_3() throws Exception {
		assertEquals(list(3), generate(3));
	}
	
	@Test
	public void test_4() throws Exception {
		assertEquals(list(2,2), generate(4));
	}
	
	@Test
	public void test_6() throws Exception {
		assertEquals(list(2,3), generate(6));
	}
	
	@Test
	public void test_8() throws Exception {
		assertEquals(list(2,2,2), generate(8));
	}
	
	@Test
	public void test_9() throws Exception {
		assertEquals(list(3,3), generate(9));
	}
	
	@Test
	public void test_325115() throws Exception {
		assertEquals(list(5,7,7,1327), generate(325115));
	}
}
