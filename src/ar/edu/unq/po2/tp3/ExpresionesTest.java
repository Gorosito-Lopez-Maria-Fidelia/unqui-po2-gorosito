package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

class ExpresionesTest {

	@Test
	void test() {
		String a = "abc";
		String s = a;
		//String t;
		
		System.out.println("la longitud de s es:  " + s.length());
		//System.out.println("la longitud de t es:  " + t.length());
		System.out.println("1 + a =  " + 1+a);
		System.out.println("Todo a ahora es mayus =  " + a.toUpperCase());
		System.out.println("Donde esta la r =  " + "Libertad".indexOf("r"));
		System.out.println("Solo 2 y 4 =  " + "Quilmes".substring(2,4));
		System.out.println("3abc empieza con a? " + (a.length() + a).startsWith("a"));
		System.out.println("a y s son iguales? " + (a ==s) );
		System.out.println("1 y 3 de a son iguales a bc? " + (a.substring(1,3).equals("bc") ) );

	}

}
