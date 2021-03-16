package ejercicios;

public class Pez extends Animal{
	String clase;
	
	public Pez(String nombre, int edad, String clase)
	{
		super(nombre, edad);
		setClase(clase);
	}
	
	public void setClase(String clase)
	{
		this.clase = clase;
	}
	
	public String getClase()
	{
		return clase;
	}
}
