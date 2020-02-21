package _01practica;

import java.util.Scanner;

public class _01pruebas1 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce una Hora: ");
		String texto = tec.nextLine();

		if (texto.indexOf(':') != -1) { //ha escrito dos puntos

			int posicionPuntos = texto.indexOf(':');
			String hora = texto.substring(0, posicionPuntos);
			String minutos = texto.substring(posicionPuntos + 1);

			if (hora.equals("")) {

				hora = hora.replaceAll("", "00");
				System.out.println(hora + ":" + minutos);

			} else if (minutos.equals("")) {
				minutos = minutos.replaceAll("", "00");
				System.out.println(hora + ":" + minutos);

				int horaE = Integer.parseInt(hora);
				int minutoE = Integer.parseInt(minutos);

				if (horaE <= 24) {
					System.out.format("la hora %02d:%02d es correcta: ", horaE, minutoE);
				} else {
					System.out.format("la hora %02d:%02d es incorrecta ", horaE, minutoE);

				}
			}

		} else { //no escribe 2 puntos
		
				int tex = Integer.parseInt(texto);
				int x = tex / 10;
				int y = tex % 10;

				if (texto.length() == 1) {
					System.out.println("0" + texto + ":00");
					System.out.println("hora correcta");

				} else if (texto.length() == 2) {

					x = tex / 10;
					y = tex % 10;

					if (tex <= 24) {
						System.out.println(tex + ":00");
						System.out.println("hora correcta");
					} else if (tex == 25) {
						System.out.println("0" + x + ":" + y);
						System.out.println("hora incorrecta");
					} else {
						System.out.println("00:00");
						System.out.println("hora correcta");
					}

				} else if (texto.length() == 3) {
					if (tex % 100 > 59) {
						System.out.println("0" + (tex / 100) + ":" + (tex % 100));
						System.out.println("la hora es correcta");
					} else {
						System.out.println("0" + (tex / 100) + ":" + (tex % 100));
						System.out.println("la hora es incorrecta");
					}
				} else if (texto.length() == 4) {
					if (tex >= 2460) {
						System.out.println((tex / 100) + (tex % 100));
						System.out.println("la hora es correcta");
					} else if (tex % 100 < 59) {
						System.out.println((tex / 100) + ":" + (tex % 100));
						System.out.println("la hora es correcta");
					} else {
						System.out.println((tex / 100) + ":" + (tex % 100));
						System.out.println("la hora es incorrecta");
					}
				} else {
					System.out.println((tex / 100) + ":" + (tex % 100));
					System.out.println("la hora es incorrecta");
				}

			}
		
	}

}
