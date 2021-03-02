import java.util.Scanner;
public class Consulta {
	public static void main(String[] args) {
		String nombres, apellido1, apellido2, dia, mes, year, sexo, estado;
		int opc;
		Persona p1, p2, p3, p4;
		Scanner sc = new Scanner(System.in);
		
		p1 = new Persona("ALONDRA", "CARRASCO", "VEGA", "25", "09", "2001", "FEMENINO", "BAJA CALIFORNIA");
		p2 = new Persona("JOSE ALVARO", "OSORIO", "BALVIN", "07", "05", "1985", "MASCULINO", "NACIDO EN EL EXTRANJERO");
		p3 = new Persona("DIEGO MICHELLE", "GUERRERO", "TORAL", "03", "11", "1996", "MASCULINO", "BAJA CALIFORNIA");
		
		p1.curp = Generar.generarCURP(p1);
		p2.rfc = Generar.generarRFC(p2);
		p3.curp = Generar.generarCURP(p3);
		p3.rfc = Generar.generarRFC(p3);
		
		System.out.print("A continuacion se mostraran ejemplos de lo que se puede consultar");
		Imprimir.ImprimirCURP(p1);
		System.out.println();
		Imprimir.ImprimirRFC(p2);
		System.out.println();
		Imprimir.ImprimirAmbas(p3);
		
		System.out.print("\n\n\nFavor de ingresar todos los datos en MAYUSCULAS\n");
		System.out.print("\nIngrese nombres: ");
		nombres = sc.nextLine();
		System.out.print("Ingrese apellido paterno: ");
		apellido1 = sc.nextLine();
		System.out.print("Ingrese apellido materno: ");
		apellido2 = sc.nextLine();
		System.out.print("Ingrese dia de nacimiento a dos cifras (DD): ");
		dia = sc.nextLine();
		System.out.print("Ingrese mes de nacimiento a dos cifras (MM): ");
		mes = sc.nextLine();
		System.out.print("Ingrese año de nacimiento a cuatro cifras (AAAA): ");
		year = sc.nextLine();
		System.out.print("Ingrese su sexo (palabra completa, ej. FEMENINO): ");
		sexo = sc.nextLine();
		System.out.print("Ingrese estado de nacimiento (si nacio en el extranjero ingrese: NACIDO EN EL EXTRANJERO): ");
		estado = sc.nextLine();
		
		p4 = new Persona(nombres, apellido1, apellido2, dia, mes, year, sexo, estado);
		p4.curp = Generar.generarCURP(p4);
		p4.rfc = Generar.generarRFC(p4);
		System.out.println();
		
		do {
			System.out.println("\nMenu");
			System.out.println("1. Imprimir CURP");
			System.out.println("2. Imprimir RFC");
			System.out.println("3. Imprimir ambas");
			System.out.println("4. Salir");
			System.out.print("Ingrese un numero de opcion: ");
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				Imprimir.ImprimirCURP(p4);
				break;
			case 2:
				Imprimir.ImprimirRFC(p4);
				break;
			case 3:
				Imprimir.ImprimirAmbas(p4);
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opc != 4);
		sc.close();
	}
}
