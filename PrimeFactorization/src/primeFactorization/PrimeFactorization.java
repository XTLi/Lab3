package primeFactorization;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static List<Integer> generate(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i % 2 == 0)
		{
			primes.add(2);
			i /= 2;
		}
		
		if (i > 1)
		{
			primes.add(i);
		}
		return primes;
	}

}
