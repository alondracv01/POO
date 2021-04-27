package Ejercicios;

public class Gato extends Animal{

	public Gato(String nombre, int edad, String sexo){
		super(nombre, edad, sexo);
	}
	
	public void eat(){
	System.out.println(nombre +" esta comiendo whiskas");
	}
	
	public void sleep(){
		System.out.println(nombre +" esta durmiendo");
	}
}