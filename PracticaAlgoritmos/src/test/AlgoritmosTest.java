package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Uilt.Algoritmos;

class AlgoritmosTest {
	
	
	
	

	
	@Test
	void fibonacci () {
		Algoritmos algoritmos;
		int fibonacciesprada= 1;
		int fibonacciResultado = Algoritmos.fibonacci(1);
		assertEquals(fibonacciesprada,fibonacciResultado);

		
	}
	@Test
	void factorial () {
		Algoritmos algoritmos;
		int Factorialesprada= 6;
		int factorialResultado = Algoritmos.factorial(3);
		assertEquals(Factorialesprada,factorialResultado);
	}
	@Test
	void esPrimos () {
		Algoritmos algoritmos;
		boolean EsPrimosesprada= true;
		boolean EsPrimosResultado = Algoritmos.esPrimos(4);
		assertEquals(EsPrimosesprada,EsPrimosResultado);
	}
	}


