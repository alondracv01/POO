package Ejercicios;

public class Perro extends Animal{

	public Perro(String nombre, int edad, String sexo){
		super(nombre, edad, sexo);
	}
	
	public void eat(){
		System.out.println(nombre +" esta comiendo pedigree");
	}

	public void sleep(){
		System.out.println(nombre +" esta acostado en su cama");
	}
}