package ProyectoJuego;

import java.util.Scanner;

public class HundirLaFlota {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Donde se muestra el menu del juego.
		 */
		int opcion = 0;

		do {
			System.out.println("####HUNDIR A LA FLOTA####");
			System.out.println("-------------------------");
			System.out.println("1. Jugar");
			System.out.println("0. Salir del Juego");
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
		/*
		 * El usuario elige la opcion que desea.
		 */
		int num = 0;
		do {
			System.out.println();
			System.out.println("Elegir opcion: ");
			num = tec.nextInt();

			if (num == 1) {
				System.out.println("Vamos a Jugar!");
				System.out.println();
			} else if (num == 0) {
				System.out.println("Has Salido del juego");
			} else {
				System.out.println("Te has equivocado vuelve a elegir una opcion");
			}
		} while (num < 0);
		return num;
	}

	public static void nuevaPartida() {

		int[][] jugador1 = new int[10][10];
		int[][] jugador2 = new int[10][10];

		int[][] d1 = new int[10][10];
		int[][] d2 = new int[10][10];

		int turno = 1;
		
		mostrarTablero1(jugador1, turno, turno);
		System.out.println("\n");
		mostrarTablero2(jugador2, turno, turno);
	
		do {
			if (turno == 1) {
			
				disparos1(d1);
				realizarJugada();
				disparos1(d1);
				
			} else {
			
				disparos2(d2);
				realizarJugada();

			}
			if (turno == 1) {
				turno = 2;
			} else {
				turno = 1;
			}
		} while (calcularGanador(jugador1, jugador2) == false);

	}

	private static boolean calcularGanador(int[][] jugador1, int[][] jugador2) {

	if(jugador1[10][10]!=1){
		System.out.println("J1 Pierde, Gana J2");
		return true;
	
	}else{
		System.out.println("J2 Pierde, Gana J1");
		return false;
		}
	}
	private static int introducirColumna1(int fila1) {

		System.out.println("Jugador 1 Introduce tus coordenadas de columna: ");
		fila1 = tec.nextInt();
		return fila1;
	}
	private static int introducirFila1(int columna1) {
	

		System.out.println("Jugador 1 Introduce tus coordenadas de fila: ");
		columna1 = tec.nextInt();
		return columna1;
		
	}
	
	private static int introducirColumna2(int columna2) {
		int fila2;
		System.out.println("Jugador 2 Introduce tus coordenadas de la fila: ");
		fila2 = tec.nextInt();
		return fila2;
	}
	private static int introducirFila2(int fila2) {
		int columna2;

		System.out.println("Jugador 2 Introduce tus coordenadas de la columna: ");
		columna2 = tec.nextInt();
		return columna2;
		
	}

	public static void mostrarTablero1(int[][] jugador1, int fila1,int columna1) {
		
	 fila1= introducirFila1(fila1);
	 columna1= introducirColumna1(columna1);
	
		System.out.println("");
		System.out.println("JUGADOR 1");
		for (int i = 0; i < jugador1.length; i++) {
			System.out.println("");
			for (int j = 0; j < jugador1.length; j++) {
				if (i + 1 == columna1) {
					if (j + 1 == fila1) {
						jugador1[i][j] = 1;
					}
				} else {
					jugador1[i][j] = 0;
				}
				System.out.print(jugador1[i][j] + " ");
				}
			}
		}
	public static void mostrarTablero2(int[][] jugador2, int fila2, int columna2) {
		
		 fila2 = introducirFila2(fila2);
		 columna2= introducirColumna2(columna2);
	 
		System.out.println();
		// Tablero jugador 2
		System.out.println("");
		System.out.println("JUGADOR 2");
		for (int i = 0; i < jugador2.length; i++) {
			System.out.println("");
			for (int j = 0; j < jugador2.length; j++) {
				if (i + 1 == columna2) {
					if (j + 1 == fila2) {
						jugador2[i][j] = 1;
					}
				} else {
					jugador2[i][j] = 0;
				}
				System.out.print(jugador2[i][j] + " ");
			}
		}
	}

	public static void disparos1(int[][] d1) {
		System.out.println();
		System.out.println("\nDISPAROS J1: ");
		for (int i = 0; i < d1.length; i++) {
			System.out.println("");
			for (int j = 0; j < d1.length; j++) {
				System.out.print(d1[i][j] + " ");
			}
		}
	}

	public static void disparos2(int[][] d2) {
		System.out.println();
		System.out.println("\nDISPAROS J2: ");
		for (int i = 0; i < d2.length; i++) {
			for (int j = 0; j < d2.length; j++) {
				System.out.print(d2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void realizarJugada() {

		int fila1, fila2 = 0, columna1, columna2 = 0;

		boolean gana1 = false;
		boolean gana2 = false;

		System.out.println("");
		while (gana1 == false && gana2 == false) {
			System.out.println("");
			System.out.println("Jugador 1 Introduce tus coordenadas de disparo: ");
			fila1 = tec.nextInt();
			columna1 = tec.nextInt();
			if (columna1 == columna2 && fila1 == fila2) {
				gana1 = true;
			} else {
				System.out.println("AGUA!!!!!!");
				System.out.println();
				System.out.println("Jugador 2 Introduce tus coordenadas de disparo: ");
				System.out.println();
				fila2 = tec.nextInt();
				columna2 = tec.nextInt();
				if (columna2 == columna1 && fila2 == fila1) {
					gana2 = true;
				} else {
					System.out.println("");
					System.out.println("AGUA!!!!!!");
				}
			}
		}

		// Aqui con el boolean se sabe si ha ganado el jugador 1 o el jugador 2
		if (gana1 == true) {
			System.out.println("GANA JUGADOR 1!!!!!!! ");
		}
		if (gana2 == true) {
			System.out.println("GANA JUGADOR 2!!!!!!!");
		}
	}
}