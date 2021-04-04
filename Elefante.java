package practica6;

public class Elefante extends Animal{

	public Elefante(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo fruta");
	}

	public void Barritar(){
		System.out.println(nombre +" esta barritando: \"Bruuuuu\"");
	}
}