package practica;

public class Bomb extends Pajaro {
	public Bomb()
	{
		super("Bomb", "Cuervo", "Negro", "Masculino", "Mediano-Grande", "Fuerte");
	}
	public void Explotar(){
		System.out.println("Bomb exploto");
	}
}
