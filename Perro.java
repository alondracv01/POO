package practica6;

public class Perro extends Animal{

	public Perro(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo pedigree");
	}

	public void Ladrar(){
		System.out.println(nombre +" esta ladrando: \"Guau guau\"");
	}
}