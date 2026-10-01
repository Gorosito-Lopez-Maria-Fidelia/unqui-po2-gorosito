package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class multioperador {
	
	public int sumar(ArrayList<Integer> numeros) {
		if (numeros == null || numeros.isEmpty()) {
			throw new IllegalArgumentException("La lista no puede ser nula ni estar vacía.");
		}
		int total = 0;
		for (int n : numeros) {
			total+= n;
		}
		return total;
	}
	
	
	public int multiplicar(ArrayList <Integer> numeros) {
		if(numeros == null || numeros.isEmpty()) {
			throw new IllegalArgumentException("La lista no puede ser nula ni estar vacía.");
		}
		int total = 1;
		for (int n : numeros) {
			total = total * n;
		}
		return total;
	}
	
	public int restar(ArrayList <Integer> numeros) {
		if (numeros == null || numeros.isEmpty()) {
			throw new IllegalArgumentException("La lista no puede ser nula ni estar vacía.");
		}
		int total = numeros.get(0);
		for(int i = 1 ; i< numeros.size() ; i++) {
			total -= numeros.get(i);
		}
		return total;
	}
	
}
