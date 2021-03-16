package ejercicios;

public class Perro extends Animal {
	String raza;
	
	public Perro(String nombre, int edad, String raza)
	{
		super(nombre, edad);
		setRaza(raza);
	}
	
	public void setRaza(String raza)
	{
		this.raza = raza;
	}
	
	public String getRaza()
	{
		return raza;
	}
}
