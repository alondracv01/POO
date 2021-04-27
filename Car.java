package Ejercicios;

public class Car implements Safety{
	String model;
	int mileage;
	double speed;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void start() {
		if(checarCinturones())
			System.out.println(model+" esta corriendo");
		else
			System.out.println("Hubo un problema arrancando "+model);
	}
	
	public void accelerate() {
		System.out.println("Acelerando");
		speed++;
	}
	
	public boolean checarCinturones() {
		System.out.println("Los cinturones estan funcionando");
		return true;
	}
	
	public void bloquearCinturones() {
		System.out.println("Se bloquearon los cinturones");
	}
}
