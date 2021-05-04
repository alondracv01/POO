public class Jugador {
	private int NumUniforme;
	private String Nombre;
	private int PuntosAnotados;
	private String Posicion;
	private double Estatura;
	
	public Jugador(int NumUniforme, String Nombre, int PuntosAnotados, String Posicion, double Estatura) {
		this.NumUniforme = NumUniforme;
		this.Nombre = Nombre;
		this.PuntosAnotados = PuntosAnotados;
		this.Posicion = Posicion;
		this.Estatura = Estatura;
	}
	
	public void setNumUniforme(int NumUniforme) {
		this.NumUniforme = NumUniforme;
	}
	
	public int getNumUniforme() {
		return NumUniforme;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setPuntosAnotados(int PuntosAnotados) {
		this.PuntosAnotados = PuntosAnotados;
	}
	
	public int getPuntosAnotados() {
		return PuntosAnotados;
	}
	
	public void setPosicion(String Posicion) {
		this.Posicion = Posicion;
	}
	
	public String getPosicion() {
		return Posicion;
	}
	
	public void setEstatura(double Estatura) {
		this.Estatura = Estatura;
	}
	
	public double getEstatura() {
		return Estatura;
	}
}
