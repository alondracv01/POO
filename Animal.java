package ejercicios;

public class Animal {
	String nombre;
	int edad;
	
	public Animal(String nombre, int edad)
	{
		setNombre(nombre);
		setEdad(edad);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public int getEdad()
	{
		return edad;
	}
}
