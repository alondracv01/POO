package practica;
import java.util.Scanner;
public class Lanzador {
	public static void main(String[] args) {
		int opc;
		Pajaro pajaro1 = new Pajaro("Red", "Cardenal", "Rojo", "Masculino", "Mediano", "Mediano");
		Pajaro pajaro2 = new Pajaro("Bomb", "Cuervo", "Negro", "Masculino", "Mediano-Grande", "Fuerte");
		Pajaro pajaro3 = new Pajaro("Chuck", "Canario", "Amarillo", "Masculino", "Mediano", "Mediano");
		Pajaro[] arregloPajaros = new Pajaro[] {pajaro1, pajaro2, pajaro3};
		Red red = new Red();
		TheBlues theBlues = new TheBlues();
		Chuck chuck = new Chuck();
		Matilda matilda = new Matilda();
		Silver silver = new Silver();
		Bomb bomb = new Bomb();
		Terence terence = new Terence();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arregloPajaros.length; i++)
		{
			System.out.println("Pajaro "+(i+1));
			System.out.println("	Nombre: "+arregloPajaros[i].getNombre());
			System.out.println("	Tipo: "+arregloPajaros[i].getTipo());
			System.out.println("	Color: "+arregloPajaros[i].getColor());
			System.out.println("	Sexo: "+arregloPajaros[i].getSexo());
			System.out.println("	Tamano: "+arregloPajaros[i].getTamano());
			System.out.println("	Alcance: "+arregloPajaros[i].getAlcance()+"\n");
		}
		do {
			System.out.println("\n\n\nMenu");
			System.out.println("1. Mostrar informacion de pajaros");
			System.out.println("2. Lanzar a Red");
			System.out.println("3. Lanzar a The Blues");
			System.out.println("4. Lanzar a Chuck");
			System.out.println("5. Lanzar a Matilda");
			System.out.println("6. Lanzar a Silver");
			System.out.println("7. Lanzar a Bomb");
			System.out.println("8. Lanzar a Terence");
			System.out.println("9. Salir");
			System.out.print("Ingrese una opcion: ");
			opc = sc.nextInt();
			
			switch(opc){
			case 1:
				red.imprimir();
				theBlues.imprimir();
				chuck.imprimir();
				matilda.imprimir();
				silver.imprimir();
				bomb.imprimir();
				terence.imprimir();
				break;
			case 2:
				for(int i=0; i<=50; i++)
					System.out.println();
				red.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				red.Gritar();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 3:
				for(int i=0; i<=50; i++)
					System.out.println();
				theBlues.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				theBlues.Dividir();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 4:
				for(int i=0; i<=50; i++)
					System.out.println();
				chuck.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				chuck.Velocidad();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 5:
				for(int i=0; i<=50; i++)
					System.out.println();
				matilda.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				matilda.Huevo();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 6:
				for(int i=0; i<=50; i++)
					System.out.println();
				silver.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				silver.Bucle();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 7:
				for(int i=0; i<=50; i++)
					System.out.println();
				bomb.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				bomb.Explotar();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 8:
				for(int i=0; i<=50; i++)
					System.out.println();
				terence.lanzar();
				System.out.print("\n\nPresione enter para activar el poder\n\n\n");
				sc.nextLine();
				sc.nextLine();
				terence.Fuerza();
				System.out.print("\n\nPresione enter para mostrar el menu");
				sc.nextLine();
				for(int i=0; i<=50; i++)
					System.out.println();
				break;
			case 9:
				break;
			default:
				
			}
		}while(opc!=9);
		sc.close();
	}
}
