package practica;

import java.io.Serializable;

public class Alumno implements Serializable{
	private String nombre;
	private String matricula;
	private int[] calificaciones;
	private double promedio = 0;
	
	public Alumno(String nombre, String matricula, int[] calificaciones) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.calificaciones = calificaciones;
		calcularPromedio();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int[] getCalificaciones() {
		return calificaciones;
	}
	
	public double getPromedio() {
		return promedio;
	}
	
	public void calcularPromedio() {
		int cantCalif = calificaciones.length;
		int sum = 0;
		for(int i=0; i<cantCalif; i++) {
			sum += calificaciones[i];
		}
		try {
			promedio = (double)sum/cantCalif;
		}catch(ArithmeticException e){
			System.out.println("No existen calificaciones");
			System.out.println("Por lo que se creo un error: "+e);
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Matricula: "+matricula);
		for(int i=0; i<calificaciones.length;i++)
			System.out.println("Calificacion "+(i+1)+": "+calificaciones[i]);
		System.out.println("Promedio: "+promedio+"\n");	
	}
}
