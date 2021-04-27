package Practica;

public class RobotCalentador extends DatosRobot implements AccionesRobotCalentador {
	public RobotCalentador(String nombre, int bateria, String identificacion, String ultimaAccion) {
		super(nombre, bateria, identificacion, ultimaAccion);
	}

	public boolean encenderCalentador() {
		if(ultimaAccion.equals("Preparacion de verduras")||ultimaAccion.equals("Preparacion de carne")) {
			System.out.println(nombre + " encendio sus manos");
			bateria--;
			return true;
		}
		else {
			if (ultimaAccion.equals("Nada"))
				System.out.println("Aun no se preparan los ingredientes");
			else {
				if(ultimaAccion.equals("Encendido de calentador")||ultimaAccion.equals("Subir temperatura"))
					System.out.println("El calentador ya esta encendido");
				else
					System.out.println("Ya no se puede encender el calentador");
			}
			return false;	
		}
	}

	public boolean apagarCalentador() {
		if(ultimaAccion.equals("Encendido de calentador")||ultimaAccion.equals("Subir temperatura")) {
			System.out.println(nombre + " apago sus manos");
			return true;
		}
		else {
			System.out.println("El calentador esta apagado");
			return false;
		}
	}

	public boolean subirTemperatura() {
		if(ultimaAccion.equals("Encendido de calentador")) {
			System.out.println(nombre + " subio la temperatura de sus manos");
			bateria--;
			return true;
		}
		else {
			System.out.println("Aun no se enciende el calentador");
			return false;
		}
	}

	public void limpiar() {
		System.out.println(nombre + " limpio sus manos");
	}
}
