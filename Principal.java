package practica6;

public class Principal {
	public static void main(String[] args) {
		int opc;
		Zoo zoo = new Zoo();
		Veterinario veterinario = new Veterinario("Arturo Lopez", 2000);
		
		do {
			System.out.println("\nMenu");
			System.out.println("1. Agregar animal");
			System.out.println("2. Eliminar animal");
			System.out.println("3. Mostrar todos los animales");
			System.out.println("4. Mostrar un animal");
			System.out.println("5. Vacunar a los animales");
			System.out.println("6. Revisar a los animales");
			System.out.println("7. Tomar muestra de sangre a los animales");
			System.out.println("8. Sedar a los animales");
			System.out.println("9. Salir");
			opc = CapturaEntrada.capturarEntero("Numero de accion que desea realizar");
			
			switch(opc) {
			case 1:
				zoo.agregarAnimal();
				break;
			case 2:
				zoo.eliminarAnimal();
				break;
			case 3:
				zoo.mostrarAnimales();
				break;
			case 4:
				zoo.mostrarAnimal();
				break;
			case 5:
				for(int i=0; i<zoo.animales.size(); i++) {
					veterinario.vacunar(zoo.animales.get(i));
				}
				break;
			case 6:
				for(int i=0; i<zoo.animales.size(); i++) {
					veterinario.revisar(zoo.animales.get(i));
				}
				break;
			case 7:
				for(int i=0; i<zoo.animales.size(); i++) {
					veterinario.tomarMuestra(zoo.animales.get(i));
				}
				break;
			case 8:
				for(int i=0; i<zoo.animales.size(); i++) {
					veterinario.sedar(zoo.animales.get(i));
				}
				break;
			case 9:
				break;
			default:
				System.out.println("\nOpcion no valida");
			}
		}while(opc != 9);
	}
}
