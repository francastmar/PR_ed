package _02Ejercicios._01Aulas.aula;

public class informatica extends Aula{
	
private int ordenadores;

public informatica(int codigo,double anchura, double longitud, int ordenadores){
	
	super(codigo, longitud, anchura);
	this.ordenadores=ordenadores;
}

@Override

public int capacidad (){

	return 2*ordenadores;
}
public String toString(){
	
	return " aula informatica: " + super.toString();
}


 
}
