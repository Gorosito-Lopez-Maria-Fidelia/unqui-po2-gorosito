package ar.edu.unq.po2.tp3;

import ar.edu.unq.po2.pruebaInicial.Punto;

public class Rectangulo {
	private Punto punto;
	private int base;
	private int altura;
	
	public int getAltura() {
		return this.altura;
	}
	
	private void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	public int getBase(){
		return this.base;
	}
	
	public Punto getPunto() {
		return this.punto;
	}
	private Rectangulo(Punto punto,int base, int altura) {
		this.setPunto(punto);
		this.setBase(base);
		this.setAltura(altura);
	}
	
	private void setBase(int base) {
		if(base > 0) {
			throw new IllegalArgumentException("La base debe ser mayor a 0");
			}
		this.base = base;
	}
	
	private void setAltura(int altura) {
		if(altura <=  0){
			throw new IllegalArgumentException("La altura debe ser mayor a 0");
		}
		this.altura = altura;		
	}

	public int area() {
		return base * altura;
	}
	
	public int perimetro() {
		return base*2 + altura*2;
	}
	
	public boolean esHorizontal() {
		return base > altura;
	}
	
	public boolean esVertical() {
		return altura > base;
	}
	
	
}
