package practica6;

public class Tigre extends Animal{

	public Tigre(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo carne");
	}

	public void Rugir(){
		System.out.println(nombre +" esta rugiendo: \"Grrrrrrrr\"");
	}
}