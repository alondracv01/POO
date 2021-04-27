package Practica;

public class RobotCuchillos extends DatosRobot implements AccionesRobotCuchillos{
	public RobotCuchillos(String nombre, int bateria, String identificacion, String ultimaAccion) {
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

	public void limpiar() {
		System.out.println(nombre + " limpio sus cuchillos");
	}
	
}
