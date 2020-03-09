package _02Ejercicios._03Figuras;

public class Rectangulo extends Figura2D {
	private int alt;
	private int anch;

	public Rectangulo(int posX, int posY, String color, int alt, int anch) {
		super(posX, posY, color);
		this.anch = anch;
		this.alt = alt;
	}

	public int getAlt() {
		return alt;
	}

	public void setAlt(int alt) {
		this.alt = alt;
	}

	public int getAnch() {
		return anch;
	}

	public void setAnch(int anch) {
		this.anch = anch;
	}
	public String toString(){
		return "Rectangulo: " + super.toString()+
				String.format("tamanyo: (%d,%d)", anch,alt);
	}
	public double area(){
		return alt*anch/2;
	}
	public double perimetro(){
		return 2 *(anch+alt);
	}
}