package practica6;

public class Jirafa extends Animal{

	public Jirafa(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
		super(nombre, edad, sexo, vacunado, sedado);
	}
	
	@Override
	public void Comer(){
		System.out.println(nombre +" esta comiendo hojas");
	}

	public void Zumbar(){
		System.out.println(nombre +" esta zumbando: \"Gruuuu\"");
	}
}