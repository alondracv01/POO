package practica6;
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
    
    public static double capturarDouble(String msg)
    {
    	double cap;
        Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		cap = sc.nextDouble();
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
    
    public static boolean capturarBoolean(String msg)
    {
    	boolean cap;
        Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		cap = sc.nextBoolean();
		return cap;
    }
}//Fin clase CapturaEntrada