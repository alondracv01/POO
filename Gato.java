package practica6;

public class Gato extends Animal{

	public Gato(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
	System.out.println(nombre +" esta comiendo whiskas");
	}
	
	public void Maullar(){
		System.out.println(nombre +" esta maullando: \"Miau miau\"");
	}
}