package ejercicios;
import java.util.Random;
public class Ejercicios {
	public static void main(String[] args) {
		//Ejercicio 1
		int[] integerArray1 = {1,20,3,44,5,60,7,88,9,100};
		//Ejercicio 2
		int[] integerArray2;
		Random gen = new Random();
		//Ejercicio 3
		Animal perro = new Animal("Daisy", 4);
		Animal gato  = new Animal("Tom", 3);
		Animal pez = new Animal("Tiburoncin", 1);
		Animal[] arreglo1 = {perro, gato, pez};
		Animal[] arreglo2 = {new Animal("Sam", 5), new Animal("Kinino", 2), new Animal("Nemo", 2)};
		//Ejercicio 5
		Pez pez1 = new Pez("Dory", 2, "Cirujano Azul");
		
		//Ejercicio 1
		System.out.println("EJERCICIO 1");
		System.out.println("Elemento en la posicion 5 del arreglo: "+integerArray1[5]);
		 
		//Ejercicio 2
		System.out.println("\nEJERCICIO 2");
		integerArray2 = new int[5];
		 
		System.out.print("Elementos del arreglo en ceros: {");
		for(int i=0; i<5; i++)
		{
			if(i!=4)
				System.out.print(integerArray2[i]+",");
			else
				System.out.println(integerArray2[i]+"}");
		}
		 
		for (int x=0;x<integerArray2.length;x++)
			integerArray2[x] = (int) (gen.nextDouble()*20);
		 
		System.out.print("Elementos del arreglo con numeros aleatorios: {");
		for(int i=0; i<5; i++)
		{
			if(i!=4)
				System.out.print(integerArray2[i]+",");
			else
				System.out.println(integerArray2[i]+"}");
		}
		 
		//Ejercicio 3
		System.out.println("\nEJERCICIO 3");
		System.out.println("Elementos del arreglo 1 de animales");
		for (int j = 0; j<arreglo1.length; j++)
		{
			System.out.println("	Nombre: "+arreglo1[j].nombre);
			System.out.println("	Edad: "+arreglo1[j].edad+"\n");
		}
		 
		System.out.println("Elementos del arreglo 2 de animales");
		for (int j = 0; j<arreglo2.length; j++)
		{
			System.out.println("	Nombre: "+arreglo2[j].nombre);
			System.out.println("	Edad: "+arreglo2[j].edad+"\n");
		}
		 
		//Ejercicio 5
		System.out.println("\nEJERCICIO 5");
		System.out.println("Elementos del objeto tipo Pez");
		System.out.println("	Nombre: "+pez1.getNombre());
		System.out.println("	Edad: "+pez1.getEdad());
		System.out.println("	Edad: "+pez1.getClase());
	}
}
