package Ejercicios;
public abstract class Animal{
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	public Animal(String nombre, int edad, String sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public abstract void eat();
	public abstract void sleep();
}