package Practica;
import java.util.Scanner;

public class Cocina {

	public static void main(String[] args) {
		RobotChef robotchef = new RobotChef("Chef", 100, "001", "Nada");
		RobotCalentador robotcalentador = new RobotCalentador("Calen", 100, "003", "Nada");
		RobotCuchillos robotcuchillos = new RobotCuchillos("Ninja", 100, "002", "Nada");
		int opc = -1, opc2 = -1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\nMenu robots");
			System.out.println("1. Robot chef");
			System.out.println("2. Robot cortador");
			System.out.println("3. Robot calentador");
			System.out.println("4. Salir");
			System.out.print("Ingrese el numero de robot que quiere controlar: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				do {
					System.out.println("\nMenu robot chef");
					System.out.println("1. Preparar verduras");
					System.out.println("2. Preparar carne");
					System.out.println("3. Encender calentador");
					System.out.println("4. Subir temperatura");
					System.out.println("5. Apagar calentador");
					System.out.println("6. Servir platillo");
					System.out.println("7. Entregar platillo");
					System.out.println("8. Limpieza de robot");
					System.out.println("9. Mostrar datos del robot");
					System.out.println("0. Cambiar de robot");
					System.out.print("Ingrese el numero de accion que quiere realizar: ");
					opc2 = sc.nextInt();
					switch(opc2) {
					case 1:
						if(robotchef.prepararVerduras()) {
							robotchef.ultimaAccion = "Preparacion de verduras";
							robotcalentador.ultimaAccion = "Preparacion de verduras";
							robotcuchillos.ultimaAccion = "Preparacion de verduras";
						}
						break;
					case 2:
						if(robotchef.prepararCarne()) {
							robotchef.ultimaAccion = "Preparacion de carne";
							robotcalentador.ultimaAccion = "Preparacion de carne";
							robotcuchillos.ultimaAccion = "Preparacion de carne";
						}
						break;
					case 3:
						if(robotchef.encenderCalentador()) {
							robotchef.ultimaAccion = "Encendido de calentador";
							robotcalentador.ultimaAccion = "Encendido de calentador";
							robotcuchillos.ultimaAccion = "Encendido de calentador";
						}
						break;
					case 4:
						if(robotchef.subirTemperatura()) {
							robotchef.ultimaAccion = "Subir temperatura";
							robotcalentador.ultimaAccion = "Subir temperatura";
							robotcuchillos.ultimaAccion = "Subir temperatura";
						}
						break;
					case 5:
						if(robotchef.apagarCalentador()) {
							robotchef.ultimaAccion = "Apagar calentador";
							robotcalentador.ultimaAccion = "Apagar calentador";
							robotcuchillos.ultimaAccion = "Apagar calentador";
						}
						break;
					case 6:
						if(robotchef.servir()) {
							robotchef.ultimaAccion = "Platillo servido";
							robotcalentador.ultimaAccion = "Platillo servido";
							robotcuchillos.ultimaAccion = "Platillo servido";
						}
						break;
					case 7:
						if(robotchef.entregar()) {
							robotchef.ultimaAccion = "Platillo entregado";
							robotcalentador.ultimaAccion = "Platillo entregado";
							robotcuchillos.ultimaAccion = "Platillo entregado";
							System.out.println("\n\n¡Hurra! El plato estaba delicioso");
						}
						break;
					case 8:
						robotchef.limpiar();
						break;
					case 9:
						robotchef.mostrarDatos();
						break;
					case 0:
						break;
					default:
						System.out.println("Opcion no valida");
						break;
					}
				}while(opc2!=0);
				break;
			case 2:
				do {
					System.out.println("\nMenu robot cortador");
					System.out.println("1. Preparar verduras");
					System.out.println("2. Preparar carne");
					System.out.println("3. Limpieza de robot");
					System.out.println("4. Mostrar datos del robot");
					System.out.println("5. Cambiar de robot");
					System.out.print("Ingrese el numero de accion que quiere realizar: ");
					opc2 = sc.nextInt();
					switch(opc2) {
					case 1:
						if(robotcuchillos.prepararVerduras()) {
							robotchef.ultimaAccion = "Preparacion de verduras";
							robotcalentador.ultimaAccion = "Preparacion de verduras";
							robotcuchillos.ultimaAccion = "Preparacion de verduras";
						}
						break;
					case 2:
						if(robotcuchillos.prepararCarne()) {
							robotchef.ultimaAccion = "Preparacion de carne";
							robotcalentador.ultimaAccion = "Preparacion de carne";
							robotcuchillos.ultimaAccion = "Preparacion de carne";
						}
						break;
					case 3:
						robotcuchillos.limpiar();
						break;
					case 4:
						robotcuchillos.mostrarDatos();
						break;
					case 5:
						break;
					default:
						System.out.println("Opcion no valida");
						break;
					}
				}while(opc2!=5);
				break;
			case 3:
				do {
					System.out.println("\nMenu robot calentador");
					System.out.println("1. Encender calentador");
					System.out.println("2. Subir temperatura");
					System.out.println("3. Apagar calentador");
					System.out.println("4. Limpieza de robot");
					System.out.println("5. Mostrar datos del robot");
					System.out.println("6. Cambiar de robot");
					System.out.print("Ingrese el numero de accion que quiere realizar: ");
					opc2 = sc.nextInt();
					switch(opc2) {
					case 1:
						if(robotcalentador.encenderCalentador()) {
							robotchef.ultimaAccion = "Encendido de calentador";
							robotcalentador.ultimaAccion = "Encendido de calentador";
							robotcuchillos.ultimaAccion = "Encendido de calentador";
						}
						break;
					case 2:
						if(robotcalentador.subirTemperatura()) {
							robotchef.ultimaAccion = "Subir temperatura";
							robotcalentador.ultimaAccion = "Subir temperatura";
							robotcuchillos.ultimaAccion = "Subir temperatura";
						}
						break;
					case 3:
						if(robotcalentador.apagarCalentador()) {
							robotchef.ultimaAccion = "Apagar calentador";
							robotcalentador.ultimaAccion = "Apagar calentador";
							robotcuchillos.ultimaAccion = "Apagar calentador";
						}
						break;
					case 4:
						robotcalentador.limpiar();
						break;
					case 5:
						robotcalentador.mostrarDatos();
						break;
					case 6:
						break;
					default:
						System.out.println("Opcion no valida");
						break;
					}
				}while(opc2!=6);
				break;
			case 4:
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opc!=4);
		
		sc.close();
	}
}
