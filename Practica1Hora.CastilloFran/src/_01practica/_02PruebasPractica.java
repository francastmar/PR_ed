package _01practica;

import java.util.Scanner;

public class _02PruebasPractica {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce una Hora: ");
		String texto = tec.nextLine();
		
	

		if (texto.indexOf(':') == 1){
			
			int tex = Integer.parseInt(texto);
			
			if (texto.indexOf(':') == 1){
			System.out.println("0" + texto + ":00");
			System.out.println("hora correcta0");	
			
		}else if (texto.length() == 2){
			int x = tex / 10;
			int y =tex % 10;
		
		if (tex <= 24){
			System.out.println(tex+":00");
			System.out.println("hora correcta");
		}else if (tex <= 24){
			System.out.println(tex + ":00");	
		}else if(tex == 25){
			System.out.println("0" + x+":"+y);
			System.out.println("hora incorrecta");
			}else{
				System.out.println("00:00");
				System.out.println("hora correcta");
			}

		} else if(texto.length() == 3){
			if(tex %100 < 59) {
				System.out.println("0" + (tex/100) + ":" + (tex % 100));
				System.out.println("la hora es correcta");
				}else{
					System.out.format("%02:%02d %n", (tex/100), (tex%100));
					System.out.println("hora correcta");
		}

	
				}
			}
		}
}
