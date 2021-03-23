package Practica;
import java.util.Scanner;

public class CapturaEntrada
{
    public static int capturarEntero(String msg)
    {
    	int cap;
        Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		cap = sc.nextInt();
		return cap;
		
    }
    
    public static float capturarFloat(String msg)
    {
    	float cap;
        Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		cap = sc.nextFloat();
		return cap;
    }
    
    public static String capturarString(String msg)
    {
    	String cap;
        Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		cap = sc.nextLine();
		return cap;
    }
}//Fin clase CapturaEntrada