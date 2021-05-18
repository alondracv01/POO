package practica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws ExcepcionMaximo {
		int [] calif1 = new int [7];
		int [] calif2 = new int [7];
		int [] calif3 = new int [7];
		Alumno alum1;
		Alumno alum2;
		Alumno alum3;
		ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
		Archivo arch = new Archivo();
		ArrayList <Integer> calif = arch.lecturaArchivo();
		
		for(int i=0; i<calif.size(); i++) {
			if(i<7)
				calif1[i] = calif.get(i);
			if(i>=7 && i<=13)
				calif2[i-7] = calif.get(i);
			if(i>13)
				calif3[i-14] = calif.get(i);
		}
		alum1 = new Alumno("Leon Leiden", "1234567", calif1);
		alum2 = new Alumno("Gustavo Vazquez", "1029384", calif2);
		alum3 = new Alumno("Selena Gomez", "1230986", calif3);
		
		alumnos.add(alum1);
		alumnos.add(alum2);
		alumnos.add(alum3);
		
		alum1.mostrarDatos();
		alum2.mostrarDatos();
		alum3.mostrarDatos();
		
		//Guardar en archivo
		try {
			FileOutputStream f = new FileOutputStream("Alumnos.txt");
            ObjectOutputStream escribir = new ObjectOutputStream(f);
            escribir.writeObject(alumnos);
            escribir.close();
            System.out.println("Se genero el archivo con los datos");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
