package practica6;

import java.util.ArrayList;

public class Zoo {
	ArrayList <Animal> animales = new ArrayList<Animal>();
	
	public void agregarAnimal() {
		int tipo;
		Animal nuevo = new Animal("", 0, "", false, false);
		System.out.println("\n1. Cebra");
		System.out.println("2. Elefante");
		System.out.println("3. Hipopotamo");
		System.out.println("4. Jirafa");
		System.out.println("5. Leon");
		System.out.println("6. Mono");
		System.out.println("7. Oso");
		System.out.println("8. Tigre");
		tipo = CapturaEntrada.capturarEntero("Tipo de animal que quiere agregar");
		switch(tipo) {
		case 1:
			nuevo = new Cebra(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 2:
			nuevo = new Elefante(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 3:
			nuevo = new Hipopotamo(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 4:
			nuevo = new Jirafa(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 5:
			nuevo = new Leon(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 6:
			nuevo = new Mono(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 7:
			nuevo = new Oso(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		case 8:
			nuevo = new Tigre(CapturaEntrada.capturarString("\nNombre"), CapturaEntrada.capturarEntero("Edad"), CapturaEntrada.capturarString("Sexo"), 
					CapturaEntrada.capturarBoolean("Esta vacunado?"), CapturaEntrada.capturarBoolean("Esta sedado?"));
			break;
		default:
			System.out.println("Opcion no valida");
		}
		animales.add(nuevo);
	}
	
	public void eliminarAnimal() {
		String nombre;
		int indice = -1;
		nombre = CapturaEntrada.capturarString("\nNombre del animal que desea eliminar");
		for(int i=0; i<animales.size(); i++) {
			if(nombre.equals(animales.get(i).getNombre())){
				indice = i;
				break;
			}
		}
		if (indice != -1) {
			animales.remove(indice);
			System.out.println("\nSe elimino el animal");
		}
		else
			System.out.println("\nNo se encontro al animal");
	}
	
	public void mostrarAnimales() {
		if(!animales.isEmpty()) {
			System.out.println("\nAnimales en el zoologico: \n");
			for(int i=0; i<animales.size(); i++) {
				System.out.println("Nombre:" + animales.get(i).getNombre());
				System.out.println("Edad:" + animales.get(i).getEdad());
				System.out.println("Sexo:" + animales.get(i).getSexo());
				System.out.println("Esta vacunado?" + animales.get(i).getVacunado());
				System.out.println("Esta sedado?" + animales.get(i).getSedado() + "\n");
			}
		}
		else
			System.out.println("\nNo existten animales aun");
	}
	
	public void mostrarAnimal() {
		String nombre;
		int tipo;
				
		System.out.println("\n1. Cebra");
		System.out.println("2. Elefante");
		System.out.println("3. Hipopotamo");
		System.out.println("4. Jirafa");
		System.out.println("5. Leon");
		System.out.println("6. Mono");
		System.out.println("7. Oso");
		System.out.println("8. Tigre");
		tipo = CapturaEntrada.capturarEntero("Tipo de animal que quiere ver");
		
		nombre = CapturaEntrada.capturarString("\nNombre del animal que desea ver");
		for(int i=0; i<animales.size(); i++) {
			if(nombre.equals(animales.get(i).getNombre())){
				System.out.println("Nombre:" + animales.get(i).getNombre());
				System.out.println("Edad:" + animales.get(i).getEdad());
				System.out.println("Sexo:" + animales.get(i).getSexo());
				System.out.println("Esta vacunado?" + animales.get(i).getVacunado());
				System.out.println("Esta sedado?" + animales.get(i).getSedado() + "\n");
				switch(tipo) {
				case 1:
					((Cebra)animales.get(i)).Relinchar();
					break;
				case 2:
					((Elefante)animales.get(i)).Barritar();
					break;
				case 3:
					((Hipopotamo)animales.get(i)).Roncar();
					break;
				case 4:
					((Jirafa)animales.get(i)).Zumbar();
					break;
				case 5:
					((Leon)animales.get(i)).Rugir();
					break;
				case 6:
					((Mono)animales.get(i)).Chillar();
					break;
				case 7:
					((Oso)animales.get(i)).Grunir();
					break;
				case 8:
					((Tigre)animales.get(i)).Rugir();
					break;
				}
			}
		}
		
	}
}
