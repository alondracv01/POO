package Practica;

public abstract class DatosRobot {
	public String nombre;
	public int bateria;
	public String identificacion;
	public String ultimaAccion;
	
	public DatosRobot(String nombre, int bateria, String identificacion, String ultimaAccion){
		this.nombre = nombre;
		this.bateria = bateria;
		this.identificacion = identificacion;
		this.ultimaAccion = ultimaAccion;
	}
	
	public abstract void limpiar();
	
	public void mostrarDatos() {
		System.out.println("\nNombre del robot: "+nombre);
		System.out.println("Nivel de bateria: "+bateria);
		System.out.println("Identificacion: "+identificacion);
		System.out.println("Ultima accion realizada: "+ultimaAccion);
	}
}
