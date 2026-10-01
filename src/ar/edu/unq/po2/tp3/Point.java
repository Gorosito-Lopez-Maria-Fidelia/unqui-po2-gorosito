package ar.edu.unq.po2.tp3;

public class Point {
	private int valorEnX ;
	private int valorEnY ;
	
	public Point (int x , int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point () {
		this(0, 0);
	}
	
	public void mover (int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point sumarPuntos (Point punto) {
		int nuevoX = this.getX() + punto.getX();
		int nuevoY = this.getY() + punto.getY();
		return new Point (nuevoX, nuevoY);
	}	
	
	private void setX (int x) {
		valorEnX = x;
	}
	
	private int getX() {
		return this.valorEnX;
	}
	
	private void setY (int y) {
		valorEnY = y;
	}
	
	private int getY() {
		return this.valorEnY;
	}
	

}
