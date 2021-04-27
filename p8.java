package EjercicioExtra;
public class p8{
	public static void main (String [] args){
	
		triangulo t1 = new triangulo (3,5,3);
		cuadrado c1 =  new cuadrado(4,6);
		
		//Figura f1 =  new Figura (4);
		
		System.out.println("Area cuadrado: "+c1.CalcularArea());
		System.out.println("\nArea triangulo: "+t1.CalcularArea());
		System.out.println("Numero de lados del triangulo: "+t1.ObtenerLados());
		t1.Dibujar();
	}
}