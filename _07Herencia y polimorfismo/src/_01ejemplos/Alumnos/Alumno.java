package _01ejemplos.Alumnos;

public class Alumno extends Persona {
	// se usa la palabra reservada extends + la clase
	// a la que hace referencia, dices que alumno es una persona
	// alumno pasa a tener los atributos de la clase persona

	// los constructores no se heredan

	public Alumno(String dni, String nombre, int numExpediente) {
		// llamar al constructor de la clase persona se utiliza la palabra
		// reservada super
		super(dni, nombre);
		this.numExpediente = numExpediente;
	}

	private int numExpediente;

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String toString() {
// reescritura parcial
		//return "alumno con nº de expediente " + numExpediente;
		
		// reescritura total
		return super.toString() + "   " + numExpediente;
	}

}
