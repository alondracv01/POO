package EjercicioExtra;
public class triangulo extends Figura implements Dibujo, Poligono{

	double base;
	double altura;

	public triangulo(int lados,double base, double altura){
	super(lados);
	this.base= base;
	this.altura=altura;
		
	}

	public double CalcularArea() {
	double area;
	area=(base*altura)/2;
	return area;
	}

	public int ObtenerLados() {
		return lados;
	}

	public void Dibujar() {
		System.out.println("    *");
		System.out.println("   * *");
		System.out.println("  *   *");
		System.out.println(" *     *");
		System.out.println("*********");
	}
}