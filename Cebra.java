package practica6;

public class Cebra extends Animal{

	public Cebra(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo hierbas y hojas");
	}

	public void Relinchar(){
		System.out.println(nombre +" esta relinchando: \"Hiaa Hiaa\"");
	}
}