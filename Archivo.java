package practica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {
	public ArrayList<Integer> lecturaArchivo() throws ExcepcionMaximo {
		String pro = "";
		ArrayList <Integer> calif = new ArrayList<Integer>();
		FileInputStream fis = null;
		int i;
		try {
            //Abrir el archivo
			fis = new FileInputStream("practica9.csv");
        }catch (FileNotFoundException exc){
            System.out.println("Archivo no encontrado");
        }
		
		try {
			do {
				i = fis.read();
				if(i!=-1) {
					if((char)i >=48 && (char)i <=57){
						pro = pro+(char)i;
					}
					else {
						if (!pro.equals("")) {
							if(Integer.parseInt(pro)>100) {
								throw new ExcepcionMaximo("Calificacion no valida");
							}
							calif.add(Integer.parseInt(pro));
							pro="";
						}
					}
				}
			}while(i!=-1);
			calif.add(Integer.parseInt(pro));
		}catch(IOException ioe) {
			System.out.println("Error: "+ioe.toString());
		}finally {
			try {
				if(fis!=null)
					fis.close();
			}catch(IOException ioe) {
				System.out.println("Error al cerrar el archivo");
			}
		}
		return calif;
	}
}
