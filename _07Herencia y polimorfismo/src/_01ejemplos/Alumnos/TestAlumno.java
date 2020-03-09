package _01ejemplos.Alumnos;

public class TestAlumno {
public static void main(String[] args) {
	// a pesar de que en alumno solo tenemos el num expediente tambien podemos usar el dni e nombre
	Alumno a = new Alumno("Miguel","36598748T", 66555);
	System.out.println(a);
	
	Persona p = new Persona ("Miguel","36598748T");
	System.out.println(p.toString());
	}
}
