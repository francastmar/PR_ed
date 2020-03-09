package PruebasJuego;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		do {
			System.out.println("#### HUNDIR A LA FLOTA ####");
			System.out.println("--------------------------");
			System.out.println("1.Jugar");
			System.out.println("0.Salir del juego");

			opcion = opcionMenu();
			switch (opcion) {
			case 0:
				break;
			case 1:
				nuevaPartida();
				break;
			}
		} while (opcion != 0);
	}

	public static int opcionMenu() {
		// El usuario elige la opcion que desea.
		int num = 0;
		do {
			System.out.println();
			System.out.println("Elegir opcion: ");
			num = tec.nextInt();

			if (num == 1) {
				System.out.println("Vamos a Jugar!!!");
				System.out.println();
			} else if (num == 0) {
				System.out.println("Has salido del juego.");
			} else {
				System.out.println("Te has equivocado vuelve a elegir una opcion.");
			}
		} while (num < 0);
		return num;
	}

	public static void nuevaPartida() {
		int[][] jugador1 = new int[10][10];
		int[][] jugador2 = new int[10][10];
		
		int[][] disparos1 = new int[10][10];
		int[][] disparos2 = new int[10][10];
		
		boolean gana1 = false;
		boolean gana2 = false;

		int filaBarco1 = 0;
		int filaBarco2 = 0;
		
		int filaDisparo1=0;
		int filaDisparo2=0;
		
		int columnaD1 = 0;
		int columnaD2 = 0;
		
		int columna1 = 0;
		int columna2 = 0;
		// Javi hemos decidido poner nosotros los barcos ya que siempre seria la
		// misma partida de la otra manera que lo teniamos.

			System.out.println("Jugador 1 Introduce tus coordenadas para colocar el barco: ");
			filaBarco1 = tec.nextInt();
			columna1 = tec.nextInt();
						
			System.out.println("Jugador 2 Introduce tus coordenadas para colocar el barco: ");
			filaBarco2 = tec.nextInt();
			columna2 = tec.nextInt();
			
		// Tablero jugador 1
		System.out.println("");
		System.out.println("JUGADOR 1");
		for (int i = 0; i < jugador1.length; i++) {
			System.out.println("");
			for (int j = 0; j < jugador1.length; j++) {
				if (i+1== columna1) {
					if (j+1 == filaBarco1) {
						jugador1[i][j] = 1;
					}
				} else {
					jugador1[i][j] = 0;
				}
				System.out.print(jugador1[i][j] + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("\nDISPAROS J1: ");
		for (int i = 0; i < disparos1.length; i++) {
			System.out.println("");
			for (int j = 0; j < disparos1.length; j++) {
				System.out.print(disparos1[i][j] + " ");
			}
		}
		System.out.println();
		// Tablero jugador 2
		System.out.println("");
		System.out.println("JUGADOR 2");
		for (int i = 0; i < jugador2.length; i++) {
			System.out.println("");
			for (int j = 0; j < jugador2.length; j++) {
				if (i+1 == columna2) {
					if (j+1 == filaBarco2) {
						jugador2[i][j] = 1;
					}
				} else {
					jugador2[i][j] = 0;
				}
				System.out.print(jugador2[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("\nDISPAROS J2: ");
		for (int i = 0; i < disparos2.length; i++) {
			System.out.println("");
			for (int j = 0; j < disparos2.length; j++) {
				System.out.print(disparos2[i][j] + " ");
			}
		}
		System.out.println("");
		while(gana1 == false && gana2 == false){
			System.out.println("");
			System.out.println("Jugador 1 Introduce tus coordenadas de disparo: ");
			filaDisparo1 = tec.nextInt();
			columnaD1 = tec.nextInt();
			
			if(columna1 == columna2 && filaDisparo1 == filaDisparo2){
				gana1 = true;
			}else{
				System.out.println("AGUA!!!!!!");
				System.out.println();
				System.out.println("Jugador 2 Introduce tus coordenadas de disparo: ");
				System.out.println();
				filaDisparo2 = tec.nextInt();
				columnaD2 = tec.nextInt();
				if(columnaD2 == columnaD1 && filaDisparo2 == filaDisparo1){
					gana2 = true;
				}else{
					System.out.println("");
					System.out.println("AGUA!!!!!!");
				}
			}
		}
		
		//Aqui con el boolean se sabe si ha ganado el jugador 1 o el jugador 2
		if(gana1 == true){
			System.out.println("GANA JUGADOR 1!!!!!!! ");
		}
		if(gana2 == true){
			System.out.println("GANA JUGADOR 2!!!!!!!");
		}
	}

}