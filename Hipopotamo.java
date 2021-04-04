package practica6;

public class Hipopotamo extends Animal{

	public Hipopotamo(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo pasto");
	}

	public void Roncar(){
		System.out.println(nombre +" esta roncando: \"Burp\"");
	}
}