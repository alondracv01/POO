import java.util.Scanner;
public class Equipo {
	private String NombreEquipo;
	private String Division;
	private String Entrenador;
	private int TorneosParticipados;
	private int TorneosGanados;
	private int TorneosPerdidos;
	protected Jugador[] jugadores = new Jugador[10];
	
	public Equipo(String NombreEquipo, String Division, String Entrenador, int TorneosParticipados, int TorneosGanados, int TorneosPerdidos) {
		this.NombreEquipo = NombreEquipo;
		this.Division = Division;
		this.Entrenador = Entrenador;
		this.TorneosParticipados = TorneosParticipados;
		this.TorneosGanados = TorneosGanados;
		this.TorneosPerdidos = TorneosPerdidos;
		//setJugadores(10);
	}
	
	public void setNombreEquipo(String NombreEquipo) {
		this.NombreEquipo = NombreEquipo;
	}
	
	public String getNombreEquipo() {
		return NombreEquipo;
	}
	
	public void setDivision(String Division) {
		this.Division = Division;
	}
	
	public String getDivision() {
		return Division;
	}
	
	public void setEntrenador(String Entrenador) {
		this.Entrenador = Entrenador;
	}
	
	public String getEntrenador() {
		return Entrenador;
	}
	
	public void setTorneosParticipados(int TorneosParticipados) {
		this.TorneosParticipados = TorneosParticipados;
	}
	
	public int getTorneosParticipados() {
		return TorneosParticipados;
	}
	
	public void setTorneosGanados(int TorneosGanados) {
		this.TorneosGanados = TorneosGanados;
	}
	
	public int getTorneosGanados() {
		return TorneosGanados;
	}
	
	public void setTorneosPerdidos(int TorneosPerdidos) {
		this.TorneosPerdidos = TorneosPerdidos;
	}
	
	public int getTorneosPerdidos() {
		return TorneosPerdidos;
	}
	
	public void setJugadores(int cantJugadores) {
		Scanner sc = new Scanner(System.in);
		int j = 0, i;
		int NumUniforme;
		String Nombre;
		int PuntosAnotados;
		String Posicion;
		double Estatura;
		jugadores  = new Jugador[cantJugadores];
		for(i=0; i<cantJugadores; i++) {
			System.out.print("JUGADOR "+(i+1)+"\n");
			do {
				System.out.print("Numero de uniforme: ");
				NumUniforme = sc.nextInt();
				for(j=0; j<i; j++) {
					if (NumUniforme == jugadores[j].getNumUniforme()) {
						System.out.println("Numero de uniforme ya escogido");
						break;
					}
				}
			}while(j<i);
			System.out.print("Nombre: ");
			sc.nextLine();
			Nombre = sc.nextLine();
			System.out.print("Puntos anotados: ");
			PuntosAnotados = sc.nextInt();
			System.out.print("Posicion: ");
			sc.nextLine();
			Posicion = sc.nextLine();
			System.out.print("Estatura: ");
			Estatura = sc.nextDouble();
			jugadores[i] = new Jugador(NumUniforme, Nombre, PuntosAnotados, Posicion, Estatura);
		}
		sc.close();
	}
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public boolean numRepetido() {
		int i,j;
		for(i=0; i<10; i++) {
			do {
				for(j=0; j<i; j++) {
					if (jugadores[i].getNumUniforme() == jugadores[j].getNumUniforme()) {
						System.out.println("Numero de uniforme repetidos, vuelva a registrar al equipo");
						return true;
					}
				}
			}while(j<i);
		}
		return false;
	}
	
	public int cantJugadores() {
		int cantJugadores = jugadores.length;
		return cantJugadores;
	}
	
	public int  sumPuntos() {
		int sum= 0;
		for(int i=0; i<jugadores.length; i++) {
			sum = sum + jugadores[i].getPuntosAnotados();
		}
		return sum;
	}
}
