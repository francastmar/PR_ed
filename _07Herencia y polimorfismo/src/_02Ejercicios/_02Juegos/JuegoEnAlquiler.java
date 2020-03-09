package _02Ejercicios._02Juegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta {

	protected int precio;
	protected int copias;
	protected int dias;

	public JuegoEnAlquiler(String t, String f, int a, int c, int p, int d) {
		super(t, f, a, c, p);
		this.dias = d;
	}

	public boolean alquilar() {
    return reducirCopias();

	}

	public int devolver() {
		if (this.copias <= 0) {
			copias++;
		}
		return copias;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String toString() {
		return  super.toString() + "\ncopias: " + copias + "\nprecio: " + precio
				+ "\ndias alquilado: " + dias;
	}

}