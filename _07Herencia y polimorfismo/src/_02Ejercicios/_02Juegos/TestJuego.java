package _02Ejercicios._02Juegos;

public class TestJuego {

	public static void main(String[] args) {

		Juego j = new Juego("Titulo1", "Fab1", 2000);

		JuegoEnAlquiler ja = new JuegoEnAlquiler("Titulo2", "Fab2", 2000, 10, 5, 5);

		JuegoEnVenta jv = new JuegoEnVenta("Titulo3", "Fab3", 2000, 10, 5);

		
		System.out.println(j);
		System.out.println("--------------");
		ja.reducirCopias();
		ja.reducirCopias();
		ja.reducirCopias();
		System.out.println(ja);
		System.out.println("--------------");
		System.out.println(jv);
		


	}
}
