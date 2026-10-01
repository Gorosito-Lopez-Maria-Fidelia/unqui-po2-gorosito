package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class multioperadorTest {
	private multioperador operador;
	private ArrayList<Integer> lista;
	
	@BeforeEach
	void setUp() {
		operador = new multioperador();
		lista = new ArrayList<>();
		lista.add(3);
		lista.add(7);
		lista.add(9);
		lista.add(2);
		lista.add(1);
		
	}

	@Test
	void testSumar() {
		assertEquals(22, operador.sumar(lista));
	}

	@Test
	void testMultiplicar() {
		assertEquals(378,operador.multiplicar(lista));
	}

	@Test
	void testRestar() {
		assertEquals(-16,operador.restar(lista));
	}

}
