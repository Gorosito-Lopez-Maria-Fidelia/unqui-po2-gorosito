package ar.edu.unq.po2.tp3;
import java.util.ArrayList;


public class Counter {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public Integer cantPares() {
		int contador = 0;
		for (Integer numero : numeros ) {
			if (numero % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public Integer cantImpares() {
		int contador = 0;
		for(Integer numero : numeros) {
			if(numero % 2 != 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public Integer cantMultiplosDe(Integer n) {
		int contador = 0;
		for(Integer numero : numeros) {
			if(numero % n == 0) {
				contador++;
			}
		}
		return contador;
	}

	public void addNumber(Integer numero) {
		this.numeros.add(numero);
	}
}
