package practica6;

public class Oso extends Animal{

	public Oso(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo frutos y bayas");
	}

	public void Grunir(){
		System.out.println(nombre +" esta gruñendo: \"Grrr grrr\"");
	}
}