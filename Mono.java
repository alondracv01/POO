package practica6;

public class Mono extends Animal{

	public Mono(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo frutas");
	}

	public void Chillar(){
		System.out.println(nombre +" esta chillando: \"Ua ua ua\"");
	}
}