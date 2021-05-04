import java.util.Scanner;
public class Torneo {
	private String NombreTorneo;
	private String Region;
	private int EquiposParticipantes = 5;
	private int PartidosJugados;
	private int PartidosPendientes;
	protected Equipo[] equipos = new Equipo[5];
	
	public Torneo(String NombreTorneo, String Region, int PartidosJugados, int PartidosPendientes) {
		this.NombreTorneo = NombreTorneo;
		this.Region = Region;
		this.PartidosJugados = PartidosJugados;
		this.PartidosPendientes = PartidosPendientes;
		//setEquipos();
	}
	
	public void setNombreTorneo(String NombreTorneo) {
		this.NombreTorneo = NombreTorneo;
	}
	
	public String getNombreTorneo() {
		return NombreTorneo;
	}
	
	public void setRegion(String Region) {
		this.Region = Region;
	}
	
	public String getRegion() {
		return Region;
	}
	
	public void setEquiposParticipantes(int EquiposParticipantes) {
		this.EquiposParticipantes = EquiposParticipantes;
	}
	
	public int getEquiposParticipantes() {
		return EquiposParticipantes;
	}
	
	public void setPartidosJugados(int PartidosJugados) {
		this.PartidosJugados = PartidosJugados;
	}
	
	public int getPartidosJugados() {
		return PartidosJugados;
	}
	
	public void setPartidosPendientes(int PartidosPendientes) {
		this.PartidosPendientes = PartidosPendientes;
	}
	
	public int getPartidosPendientes() {
		return PartidosPendientes;
	}
	
	public void setEquipos() {
		Scanner sc = new Scanner(System.in);
		int repeticion;
		String NombreEquipo;
		String Division;
		String Entrenador;
		int TorneosParticipados;
		int TorneosGanados;
		int TorneosPerdidos;
		int cantJugadores;
		Jugador jugadores1[];
		Jugador jugadores2[];
		equipos = new Equipo[EquiposParticipantes];
		for(int i=0; i<EquiposParticipantes; i++) {
			System.out.print("EQUIPO "+(i+1)+"\n");
			System.out.print("Nombre del equipo: ");
			sc.nextLine();
			NombreEquipo = sc.nextLine();
			System.out.print("Division: ");
			sc.nextLine();
			Division = sc.nextLine();
			System.out.print("Entrenador del equipo: ");
			sc.nextLine();
			Entrenador = sc.nextLine();
			System.out.print("Numero de torneos participados: ");
			TorneosParticipados = sc.nextInt();
			System.out.print("Numero de torneos ganados: ");
			TorneosGanados = sc.nextInt();
			System.out.print("Numero de torneos perdidos: ");
			TorneosPerdidos = sc.nextInt();
			System.out.print("Numero de jugadores: ");
			cantJugadores = sc.nextInt();
			equipos[i] = new Equipo(NombreEquipo, Division, Entrenador, TorneosParticipados, TorneosGanados, TorneosPerdidos);
			do {
				jugadores1 = equipos[i].getJugadores();
				repeticion = 0;
				for(int j=0; j<i; j++) {
					jugadores2 = equipos[j].getJugadores();
					for(int k=0; k<jugadores1.length; k++) {
						for(int l=0; l<jugadores2.length; l++) {
							if(jugadores1[k].getNombre().equals(jugadores2[l].getNombre())) {
								System.out.println("El jugador "+jugadores1[k].getNombre()+" ya esta registrado en otro equipo, favor de volver a registrar a los jugadores");
								equipos[i].setJugadores(cantJugadores);
								repeticion = repeticion+1;
								l= -1;
							}
						}
					}
				}
			}while(repeticion>0);
		}
		//sc.close();
	}
	
	public Equipo[] getEquipos() {
		return equipos;
	}
	
	public boolean jugadoresRepetidos() {
		int repeticion;
		Jugador jugadores1[];
		Jugador jugadores2[];
		for(int i=0; i<EquiposParticipantes; i++) {
			do {
				jugadores1 = equipos[i].getJugadores();
				repeticion = 0;
				for(int j=0; j<i; j++) {
					jugadores2 = equipos[j].getJugadores();
					for(int k=0; k<jugadores1.length; k++) {
						for(int l=0; l<jugadores2.length; l++) {
							if(jugadores1[k].getNombre().equals(jugadores2[l].getNombre())) {
								System.out.println("El jugador "+jugadores1[k].getNombre()+" ya esta registrado en otro equipo, favor de revisar los jugadores");
								return true;
							}
						}
					}
				}
			}while(repeticion>0);
		}
		return false;
	}
}
