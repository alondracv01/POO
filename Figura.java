package EjercicioExtra;
public abstract class Figura {

	public int lados;

	public Figura (int lados){
		this.lados = lados;
	}

	public abstract double CalcularArea();

}