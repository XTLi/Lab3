package primeGeneration;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PrimeGenerationTest {
	private Integer inputNum;
	private List<Integer> generateList;
	
	@Before
	public void initialize() {
	}
	
	public PrimeGenerationTest(int inputNum, List<Integer> generateList) {
		this.inputNum = inputNum;
		this.generateList = generateList;
	}
	
	private static List<Integer> list(Integer...integers) {
		// TODO Auto-generated method stub
		return Arrays.asList(integers);
	}
	
	@Parameterized.Parameters
	public static Collection generateNum() {
		return Arrays.asList(new Object[][] {
				{1, list()},
				{2,list()},
				{3,list(2)},
				{4,list(2,3)},
				{6,list(2,3,5)},
				{8,list(2,3,5,7)},
		});
	} 
	
	@Test
	public void testPrimeGen() {
		assertEquals(generateList, PrimeGeneration.generate(inputNum));
	}

}
