package _02Ejercicios._03Figuras;

public class Circulo extends Figura2D {
	private int radio;

	public Circulo(int posX, int posY, String color,int radio) {
		super(posX, posY, color);
		this.radio = radio;

	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	public String toString(){
		return "Circulo: " + super.toString()+
				String.format(" - Radio: %d", radio);
	}
	public double area(){
		return 2+Math.PI* radio*radio;
	}
	public double perimetro(){
		return 2 *Math.PI*radio;
	}

}
