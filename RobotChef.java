package Practica;

public class RobotChef extends DatosRobot implements AccionesRobotCuchillos, AccionesRobotCalentador{

	public RobotChef(String nombre, int bateria, String identificacion, String ultimaAccion) {
		super(nombre, bateria, identificacion, ultimaAccion);
	}

	public boolean prepararVerduras() {
		if(ultimaAccion.equals("Nada")||ultimaAccion.equals("Preparacion de carne")) {
			System.out.println(nombre + " corto y preparo las verduras");
			bateria--;
			return true;
		}
		else {
			if(ultimaAccion.equals("Preparacion de verduras"))
				System.out.println("Ya se prepararon las verduras");
			else
				System.out.println("Ya se prepararon los ingredientes");
			return false;
		}
	}

	public boolean prepararCarne() {
		if(ultimaAccion.equals("Nada")||ultimaAccion.equals("Preparacion de verduras")) {
			System.out.println(nombre + " corto y preparo la carne");
			bateria--;
			return true;
		}
		else {
			if(ultimaAccion.equals("Preparacion de carne"))
				System.out.println("Ya se prepararo la carne");
			else
				System.out.println("Ya se prepararon los ingredientes");
			return false;
		}
	}

	public boolean encenderCalentador() {
		if(ultimaAccion.equals("Preparacion de verduras")||ultimaAccion.equals("Preparacion de carne")) {
			System.out.println(nombre + " encendio el calentador");
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
			System.out.println(nombre + " apago el calentador");
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
		System.out.println(nombre + " limpio sus manos mecanicas");
	}
	
	public boolean servir() {
		if(ultimaAccion.equals("Apagar calentador")) {
			System.out.println(nombre + " sirvio el platillo");
			bateria--;
			return true;
		}
		else {
			System.out.println("Aun no se termina de cocinar el platillo");
			return false;
		}
	}

	public boolean entregar() {
		if(ultimaAccion.equals("Platillo servido")) {
			System.out.println(nombre + " entrego el platillo");
			bateria--;
			return true;
		}
		else {
			System.out.println("Aun no se sirve el platillo");
			return false;
		}
	}
}
