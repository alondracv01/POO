package practica6;

public class Ejercicios {
	public static void main(String[] args) {
		//Ejercicio 1
		Animal pez = new Animal("Tiburoncin", 2, "Macho", false, false);
		Perro perro = new Perro("Daisy", 5, "Hembra", true, false);
		Gato gato = new Gato("Kinino", 3, "Macho", false, false);
		
		//Ejercicio 2
		Animal animal = new Perro("Sam", 5, "Macho", true, true);
		
		//Ejercicio 3
		Animal [] animalArray = new Animal[3];
		animalArray[0] = new Animal("Pez", 1, "Macho", false, false);
		animalArray[1] = new Perro("Gochis", 4, "Macho", true, false);
		animalArray[2] = new Gato("Don Gato", 2, "Macho", false, false);
		
		//Ejercicio 1
		pez.Comer();
		pez.Dormir();
		
		perro.Comer();
		perro.Dormir();
		
		gato.Comer();
		gato.Dormir();
		
		//Ejercicio 2
		animal.Comer();
		animal.Dormir();
		//La siguiente linea no es valida porque es un metodo exclusivo de Perro
		//animal.Ladrar();
		
		//Ejercicio 3
		for(Animal a: animalArray) {
			a.Comer();
		}
		
		//Ejercicio 4
		for(Animal a: animalArray) {
			a.Comer();
			
			if (a instanceof Perro) {
				((Perro)a).Ladrar();
			}
		}
	}
}
