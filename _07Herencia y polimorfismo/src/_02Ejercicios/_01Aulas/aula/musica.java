package _02Ejercicios._01Aulas.aula;

public class musica extends Aula {
	
private boolean piano;

public musica(int codigo,double anchura, double longitud, boolean piano){
	
	super(codigo, longitud, anchura);
	this.piano= piano;
}

public int capacidad(){

//reescritura total
//if(piano){
//	return (int) (this.getAnchura() * this.getLongitud() / 1.4) -2;
//}else{
//	return (int) (this.getAnchura() * this.getLongitud() / 1.4) ;
//}
	
if(piano){
	return super.capacidad() -2;
}else{
	return super.capacidad();
}


}

public String toString(){
	
	return " aula musica: " + super.toString();
}
}
