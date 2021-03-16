package practica;

public class Pajaro {
	String nombre, tipo, color, sexo, tamano, alcance;

	public Pajaro(String nombre, String tipo, String color, String sexo, String tamano, String alcance) {
		setNombre(nombre);
		setTipo(tipo);
		setColor(color);
		setSexo(sexo);
		setTamano(tamano);
		setAlcance(alcance);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public void setTamano(String tamano)
	{
		this.tamano = tamano;
	}
	public void setAlcance(String alcance)
	{
		this.alcance = alcance;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public String getTipo()
	{
		return tipo;
	}
	public String getColor()
	{
		return color;
	}
	public String getSexo()
	{
		return sexo;
	}
	public String getTamano()
	{
		return tamano;
	}
	public String getAlcance()
	{
		return alcance;
	}
	
	public void lanzar() 
	{
		System.out.println("Se lanzo a "+getNombre());
	}
	
	public void imprimir()
	{
		System.out.println("\n"+getNombre());
		System.out.println("	Tipo: "+getTipo());
		System.out.println("	Color: "+getColor());
		System.out.println("	Sexo: "+getSexo());
		System.out.println("	Tamano: "+getTamano());
		System.out.println("	Alcance: "+getAlcance()+"\n");
	}
}
