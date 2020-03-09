package _02Ejercicios._03Figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;

	public Figura(int posX, int posY, String color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString(){
		return String.format(" primetro: %f - Area: %f - color: %s - pos: (%d,%d)", perimetro(), area(), color,posX,posY);
	}
	public abstract double area();
	// quier que este en la clae pero no se implementarlo, las subclases lo tienen
	public abstract double perimetro();
}
