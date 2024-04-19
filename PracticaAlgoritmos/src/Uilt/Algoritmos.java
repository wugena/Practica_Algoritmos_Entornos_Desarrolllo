package Uilt;

public abstract class Algoritmos {
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int fibonacci (int numero ) {
        if(numero<= 1) {
        	return numero;
        }else {
        	int a= 0;
        	int b= 1;
        	for(int i = 2;i<numero ; i++) {
        		int tempo = a + b ;
        		a =b;
        		b= tempo;
        	}
            return b;
        }
    }
	

	/**
	 * Recibe un número entero y devuelve el factorial de dicho número.

	 * @param Factorial para saber el factoral
	 * @return devuelve funcio factorial si introduce el numero te devulve el funcion
	 */
	 public static int factorial (int numero) {
		 int Factorial = 1;
	        for(int i =1; i<=numero ; i++) {
	        	Factorial *=i;
	        }		 
	        return Factorial;
	    }
	 /**
	  * primos Recibe un número entero y devuelve true o false 
	  * en función de si es primo o no.
	  * @param primos para averiguar el entre 0 si queda resto o si si queda resto 
	  * no es nun numero primo si es divisibre entre cero da error
	  * @return Devuleve si es verdadero o falso el numero 
	  */

	 
	 public static boolean  esPrimos (int primos) {
		 boolean Esprimos  ; 
	        if(primos /2 == 0) {
	        	Esprimos=false;
	        }else
	        	Esprimos=true;
		 return Esprimos;
		 
	    }


}
