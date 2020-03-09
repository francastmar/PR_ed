package _02Ejercicios._02Juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta {

	public JuegoEnVenta(String t, String f, int a, int p, int c) {
		super(t, f, a,c,p);

	}

	public boolean vender() {
	    return reducirCopias();
	}


@Override

	public String toString() {
		return super.toString() + "\ncopias: " + copias + "\nprecio: " + precio;
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

}
