package _02Ejercicios._02Juegos;

public class Juego {

	protected String titulo;
	protected String fabricante;
	protected int anyo;

	public Juego(String t, String f, int a) {
		this.titulo = t;
		this.fabricante = f;
		this.anyo = a;
	}

	public String toString() {
		return "\ntitulo: " + titulo + "\nfabricante: " + fabricante + "\naño: " + anyo;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Juego))
			return false;

		Juego j = (Juego) o;

		if (this.titulo.equals(j.titulo) 
				&& this.fabricante.equals(j.fabricante) 
				&& this.anyo == j.anyo) {
			return true;
		} else {
			return false;
		}

	}

	public int compareTo(Juego j) {
		if (this.titulo.compareTo(j.titulo) < 0)
			return -1;
		else if (this.titulo.compareTo(j.titulo) > 0)
			return 1;
		else if (this.fabricante.compareTo(j.fabricante) < 0)
			return -1;
		else if (this.fabricante.compareTo(j.fabricante) > 0)
			return 1;
		else if (this.anyo < j.anyo)
			return -1;
		else if (this.anyo > j.anyo)
			return -1;
		else
			return 0;
	}
}