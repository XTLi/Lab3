package primeGeneration;

import java.util.ArrayList;
import java.util.List;

public class PrimeGeneration {

	public static List<Integer> generate(Integer inputNum) {
		// TODO Auto-generated method stub
		List<Integer> generatePrimes = new ArrayList<Integer>();
		if(inputNum > 2)
		{
			int i = 2;
			while(i < inputNum)
			{
				if(primeCheck(i) == true)
				{
					generatePrimes.add(i);
				}
				i ++;
			}
		}
		return generatePrimes;
	}

	private static boolean primeCheck(Integer candidate) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= (candidate / 2); i++) {
	         if (candidate % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
}
