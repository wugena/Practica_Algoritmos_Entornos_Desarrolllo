package app;

import java.util.Random;

import Uilt.Algoritmos;

public class Principal {

	public static void main(String[] args) {
	     Random rand = new Random();
	     /**
	      * 
	      */
	     	int[] numeros = new int[5];
	        for (int i = 0; i < 5; i++) {
	            numeros[i] = rand.nextInt(10) + 1;
	        }
	        /**
	         * crea 5  array de cada metodo 
	         */
	
	        int[] resultadoFibonacci = new int[5];
	        int[] resultadoFactorial = new int[5];
	        boolean[] resultadoPrimos = new boolean[5];
	        /**
	         *
	         */
	      
	        for (int i = 0; i < 5; i++) {
	            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
	            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
	            resultadoPrimos[i] = Algoritmos.esPrimos(numeros[i]);
	        }
	        }
	}