package _02Ejercicios._01Aulas.aula;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;

	public Aula(int codigo, double longitud, double anchura) {

		this.longitud= longitud;
		this.codigo=codigo;
		this.anchura=anchura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	public int capacidad (){

		return (int) (this.anchura * this.longitud / 1.4);
	}
	
	public String toString(){
		
		return "codigo: "+this.codigo +" superficie:  " + (longitud * anchura) +  " " + capacidad() + "alumnos";
	}
}
