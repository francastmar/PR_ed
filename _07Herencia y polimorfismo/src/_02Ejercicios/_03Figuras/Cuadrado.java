package _02Ejercicios._03Figuras;

public class Cuadrado extends Figura2D {
	private int lado;

	public Cuadrado(int posX, int posY, String color, int lado) {
		super(posX, posY, color);
		this.lado = lado;
	}

	public int getAnch() {
		return lado;
	}

	public void setAnch(int anch) {
		this.lado = lado;
	}

	public String toString() {
		return "Cuadrado: " + super.toString() + String.format("tamanyo: (%d,%d)", lado, lado);
	}

	public double area() {
		return lado*lado;
	}

	public double perimetro() {
		return lado*4;
	}

}