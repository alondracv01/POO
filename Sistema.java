package Practica;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		String cliente;
		int opc, opc2;
		Banco ban = new Banco();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Menu");
			System.out.println("1. Crear nueva cuenta");
			System.out.println("2. Ingresar a cuenta");
			System.out.println("3. Salir");
			System.out.print("Ingrese un numero de opcion: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println();
				ban.nuevaCuenta();
				break;
			case 2:
				System.out.println();
				cliente = ban.VerificarUsuario();
				if(!(cliente.equals(""))) {
					do {
						System.out.println("	Menu");
						System.out.println("	1. Consulta de saldo");
						System.out.println("	2. Deposito");
						System.out.println("	3. Retiro");
						System.out.println("	4. Salir");
						System.out.print("	Ingrese un numero de opcion: ");
						opc2 = sc.nextInt();
						
						switch(opc2){
						case 1:
							System.out.println();
							ban.ConsultaSaldo(cliente);
							break;
						case 2:
							System.out.println();
							ban.Depositar(cliente, CapturaEntrada.capturarFloat("Cantidad a depositar"));
							break;
						case 3:
							System.out.println();
							ban.Retirar(cliente, CapturaEntrada.capturarFloat("Cantidad a retirar"));
							break;
						case 4:
							System.out.println();
							break;
						default:
							System.out.println();
							System.out.println("Opcion ingresada no valida\n");
							break;
						}
					}while(opc2!=4);
				}
				break;
			case 3:
				break;
			default:
				System.out.println();
				System.out.println("Opcion ingresada no valida\n");
				break;
			}
		}while(opc!=3);
		sc.close();
	}
	
}
