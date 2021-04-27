package EjercicioExtra;
public class cuadrado extends Figura{
	double lado;

	public cuadrado (int lados,double lado){
	super(lados);
	this.lado=lado;
	}

	public double CalcularArea() {
	double area;
	area=(lado*lado);
	return area;
	}
}