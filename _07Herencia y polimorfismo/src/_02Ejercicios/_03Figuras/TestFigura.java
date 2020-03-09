package _02Ejercicios._03Figuras;

import java.util.ArrayList;

public class TestFigura {

	public static void main(String[] args) {
		ArrayList<Figura> ListaFiguras = new ArrayList<>();
		ListaFiguras.add(new Circulo(10,10,"AZUL",20));
		ListaFiguras.add(new Rectangulo(10,10,"AMARILLO",20, 40));
		ListaFiguras.add(new Circulo(10,20,"VERDE",24));
		ListaFiguras.add(new Rectangulo(10,10,"ROJO",20,36));
		ListaFiguras.add(new Cuadrado(10,10,"ROJO",20));

		for(Figura f: ListaFiguras){
			System.out.println(f);
			
			
		}
	}

}
