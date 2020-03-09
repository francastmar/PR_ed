package _02Ejercicios._03Figuras;

public abstract class Figura3D extends Figura {

	private int posZ;

	public Figura3D(int posX, int posY, int posZ, String color) {
		super(posY, posY, color);
		this.posZ = posZ;
	}

	public int getPosZ() {
		return posZ;
	}

	public void setPosZ(int posZ) {
		this.posZ = posZ;
	}

}
