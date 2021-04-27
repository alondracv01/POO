package Ejercicios;

public class Principal {
	public static void main(String[] args) {
	//Ejercicio 1
	//No se puede compilar porque se crea un objeto de una clase abstracta
		//Animal animal = new Animal("Daisy", 5, "Hembra");
	
	//Ejercicio 2
		Perro perro1 = new Perro("Daisy", 5, "Hembra");
		Perro perro2 = new Perro("Sam", 6, "Macho");
		Gato gato = new Gato("Don gato", 3, "Macho");
		Animal[] animales = new Animal[] {perro1, gato, perro2};
	//Ejercicio 3
		Car carro = new Car("Toyota");
	//Ejercicio 4
		Safety c = new Car("Ferrari");
		
	//Ejercicio 2
		/*Con la instruccion "for" funciona bien, se imprimen los atributos 
		 correctos de cada uno y en el metodo se imprime lo que se esperaba*/
		for(int i=0; i<animales.length; i++) {
			System.out.println("\nNombre del animal "+(i+1)+": "+animales[i].nombre);
			System.out.println("Edad del animal "+(i+1)+": "+animales[i].edad);
			System.out.println("Genero del animal "+(i+1)+": "+animales[i].sexo);
			animales[i].eat();
		}
		
		//Al realizar las intrucciones una por una funciona de la misma manera
		System.out.println("\nNombre del animal "+1+": "+animales[0].nombre);
		System.out.println("Edad del animal "+1+": "+animales[0].edad);
		System.out.println("Genero del animal "+1+": "+animales[0].sexo);
		animales[0].eat();
		
		System.out.println("\nNombre del animal "+2+": "+animales[1].nombre);
		System.out.println("Edad del animal "+2+": "+animales[1].edad);
		System.out.println("Genero del animal "+2+": "+animales[1].sexo);
		animales[1].eat();
		
		System.out.println("\nNombre del animal "+3+": "+animales[2].nombre);
		System.out.println("Edad del animal "+3+": "+animales[2].edad);
		System.out.println("Genero del animal "+3+": "+animales[2].sexo);
		animales[2].eat();
		
	//Ejercicio 3
		System.out.println("\n");
		carro.start();
		carro.bloquearCinturones();
		carro.accelerate();
	//Ejercicio 4
		c.checarCinturones();
		//La siguiente linea esta incorrecta
		//c.start();
		//Para poder utilizar el metodo start() el objeto debe ser de tipo Car
		
	}
}
