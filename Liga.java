
public class Liga {

	public static void main(String[] args) {
		Torneo torneo = new Torneo("CIBACOPA 2018", "Costa del Pacifico", 5, 5);
		
		//Equipo 1
		torneo.equipos[0] = new Equipo("Zonkeys", "Juvenil", "Juan Perez", 10, 3, 7);
		torneo.equipos[0].jugadores[0] = new Jugador(1, "Alvaro Arreola", 5, "Base", 1.98);
		torneo.equipos[0].jugadores[1] = new Jugador(2, "Baldomero Barraza", 5, "Base", 1.87);
		torneo.equipos[0].jugadores[2] = new Jugador(3, "Carlos Carrillo", 5, "Escolta", 1.85);
		torneo.equipos[0].jugadores[3] = new Jugador(4, "Daniel Dominguez", 5, "Escolta", 1.95);
		torneo.equipos[0].jugadores[4] = new Jugador(5, "Ernesto Encino", 5, "Alero", 2.04);
		torneo.equipos[0].jugadores[5] = new Jugador(6, "Fernando Fernandez", 5, "Alero", 1.90);
		torneo.equipos[0].jugadores[6] = new Jugador(7, "Gabriel Gomez", 5, "Ala y pivot", 1.97);
		torneo.equipos[0].jugadores[7] = new Jugador(8, "Hernan Herrera", 5, "Ala y pivot", 2.01);
		torneo.equipos[0].jugadores[8] = new Jugador(9, "Ignacio Iturbide", 5, "Pivot", 1.88);
		torneo.equipos[0].jugadores[9] = new Jugador(10, "Jose Jimenez", 5, "Pivot", 1.99);
		if(torneo.equipos[0].numRepetido())
			torneo.equipos[0].setJugadores(10);
		
		//Equipo 2
		torneo.equipos[1] = new Equipo("Halcones", "Juvenil", "Mauricio Luna", 21, 6, 15);
		torneo.equipos[1].jugadores[0] = new Jugador(1, "Kevin Kelly", 3, "Base", 1.93);
		torneo.equipos[1].jugadores[1] = new Jugador(2, "Luis Lopez", 3, "Base", 1.87);
		torneo.equipos[1].jugadores[2] = new Jugador(3, "Mario Morales", 3, "Escolta", 1.83);
		torneo.equipos[1].jugadores[3] = new Jugador(4, "Noe Nogales", 3, "Escolta", 1.87);
		torneo.equipos[1].jugadores[4] = new Jugador(5, "Oscar Oliva", 3, "Alero", 2.01);
		torneo.equipos[1].jugadores[5] = new Jugador(6, "Pablo Prieto", 3, "Alero", 1.95);
		torneo.equipos[1].jugadores[6] = new Jugador(7, "Rodrigo Ruvalcaba", 3, "Ala y pivot", 1.98);
		torneo.equipos[1].jugadores[7] = new Jugador(8, "Samuel Sanchez", 3, "Ala y pivot", 2.03);
		torneo.equipos[1].jugadores[8] = new Jugador(9, "Tomas Torres", 3, "Pivot", 1.98);
		torneo.equipos[1].jugadores[9] = new Jugador(10, "Uriel Urias", 3, "Pivot", 1.83);
		if(torneo.equipos[1].numRepetido())
			torneo.equipos[1].setJugadores(10);
		
		//Equipo 3
		torneo.equipos[2] = new Equipo("Nauticos", "Juvenil", "Calvin Poza", 34, 10, 24);
		torneo.equipos[2].jugadores[0] = new Jugador(1, "Victor Vazquez", 4, "Base", 2.01);
		torneo.equipos[2].jugadores[1] = new Jugador(2, "William Wilson", 4, "Base", 1.75);
		torneo.equipos[2].jugadores[2] = new Jugador(3, "Yan Yarto", 4, "Escolta", 1.89);
		torneo.equipos[2].jugadores[3] = new Jugador(4, "Zeus Zamora", 4, "Escolta", 1.86);
		torneo.equipos[2].jugadores[4] = new Jugador(5, "Arturo Astudillo", 4, "Alero", 1.98);
		torneo.equipos[2].jugadores[5] = new Jugador(6, "Benito Barca", 4, "Alero", 2.06);
		torneo.equipos[2].jugadores[6] = new Jugador(7, "Caleb Colorado", 4, "Ala y pivot", 1.93);
		torneo.equipos[2].jugadores[7] = new Jugador(8, "Dante Dimas", 4, "Ala y pivot", 2.0);
		torneo.equipos[2].jugadores[8] = new Jugador(9, "Emilio Echeverria", 4, "Pivot", 1.85);
		torneo.equipos[2].jugadores[9] = new Jugador(10, "Francisco Franco", 4, "Pivot", 1.87);
		if(torneo.equipos[2].numRepetido())
			torneo.equipos[2].setJugadores(10);
		
		//Equipo 4
		torneo.equipos[3] = new Equipo("Rayos", "Juvenil", "Francis Palacios", 13, 2, 11);
		torneo.equipos[3].jugadores[0] = new Jugador(1, "Gonzalo Grande", 2, "Base", 2.01);
		torneo.equipos[3].jugadores[1] = new Jugador(2, "Homero Hernandez", 2, "Base", 1.75);
		torneo.equipos[3].jugadores[2] = new Jugador(3, "Ian Ignacio", 2, "Escolta", 1.89);
		torneo.equipos[3].jugadores[3] = new Jugador(4, "Jorge Javier", 2, "Escolta", 1.86);
		torneo.equipos[3].jugadores[4] = new Jugador(5, "Karim Kenneth", 2, "Alero", 1.98);
		torneo.equipos[3].jugadores[5] = new Jugador(6, "Liam Limantu", 2, "Alero", 2.06);
		torneo.equipos[3].jugadores[6] = new Jugador(7, "Marcelo Martinez", 2, "Ala y pivot", 1.93);
		torneo.equipos[3].jugadores[7] = new Jugador(8, "Nazario Nava", 2, "Ala y pivot", 2.0);
		torneo.equipos[3].jugadores[8] = new Jugador(9, "Omar Ortiz", 2, "Pivot", 1.85);
		torneo.equipos[3].jugadores[9] = new Jugador(10, "Pedro Pinto", 2, "Pivot", 1.87);
		if(torneo.equipos[3].numRepetido())
			torneo.equipos[3].setJugadores(10);
		
		//Equipo 5
		torneo.equipos[4] = new Equipo("Pioneros", "Juvenil", "Dario Gaxiola", 23, 7, 16);
		torneo.equipos[4].jugadores[0] = new Jugador(1, "Ramiro Robles", 1, "Base", 2.01);
		torneo.equipos[4].jugadores[1] = new Jugador(2, "Saul Sandoval", 1, "Base", 1.75);
		torneo.equipos[4].jugadores[2] = new Jugador(3, "Tino Taboada", 1, "Escolta", 1.89);
		torneo.equipos[4].jugadores[3] = new Jugador(4, "Uziel Urquidi", 1, "Escolta", 1.86);
		torneo.equipos[4].jugadores[4] = new Jugador(5, "Valentin Villalobos", 1, "Alero", 1.98);
		torneo.equipos[4].jugadores[5] = new Jugador(6, "Waldo Wonka", 1, "Alero", 2.06);
		torneo.equipos[4].jugadores[6] = new Jugador(7, "Xavier Ximenez", 1, "Ala y pivot", 1.93);
		torneo.equipos[4].jugadores[7] = new Jugador(8, "Yael Ybarra", 1, "Ala y pivot", 2.0);
		torneo.equipos[4].jugadores[8] = new Jugador(9, "Zacarias Zea", 1, "Pivot", 1.85);
		torneo.equipos[4].jugadores[9] = new Jugador(10, "Alberto Aispuro", 1, "Pivot", 1.87);
		if(torneo.equipos[4].numRepetido())
			torneo.equipos[4].setJugadores(10);
		
		if(torneo.jugadoresRepetidos())
			torneo.setEquipos();
		
		System.out.println("\n\n Nombre del torneo: "+torneo.getNombreTorneo());
		System.out.println("Region del torneo: "+torneo.getRegion());
		System.out.println("Numero de equipos participantes: "+torneo.getEquiposParticipantes());
		System.out.println("Partidos jugados: "+torneo.getPartidosJugados());
		System.out.println("Partidos pendientes: "+torneo.getPartidosPendientes());
		
		for(int i=0; i<torneo.getEquiposParticipantes(); i++) {
			System.out.println("\n\n Nombre del equipo "+(i+1)+": "+torneo.equipos[i].getNombreEquipo());
			System.out.println("Division del equipo "+(i+1)+": "+torneo.equipos[i].getDivision());
			System.out.println("Jugadores registrados en el equipo "+(i+1)+": "+torneo.equipos[i].cantJugadores());
			System.out.println("Puntos totales del equipo "+(i+1)+": "+torneo.equipos[i].sumPuntos());
			
			for(int j=0; j<torneo.equipos[i].cantJugadores(); j++) {
				System.out.println("\n\n Nombre del jugador "+(j+1)+": "+torneo.equipos[i].jugadores[j].getNombre());
				System.out.println("Numero de uniforme del jugador "+(i+1)+": "+torneo.equipos[i].jugadores[j].getNumUniforme());
			}
		}
	}

}
