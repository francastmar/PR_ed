package _02Ejercicios._02Juegos;
//clase abstracta es una clase que no se pueden crear objetos entonces se define como abstracta
// es solo para compartir codigo con otras, solo tiene sentido si es para heredar de ella.

//se puede crear tambien un metodo abstracto, 
//en la clase que esta definido el metodo no tiene implementacion
//solo se declara la cabecera, no tiene codigo

public abstract class JuegoAlquilerVenta extends Juego {

	protected int precio;
	protected int copias;


	public JuegoAlquilerVenta(String t, String f, int a, int copias, int precio) {
		super(t, f, a);
		this.precio=precio;
		this.copias=copias;
	}

	@Override
	public String toString() {
		return super.toString() + "\ncopias: " + copias + "\nprecio: " + precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}
	public boolean reducirCopias(){
		if(copias>0){
			copias--;
			return true;
		}else{
			return false;
		}
	}


}