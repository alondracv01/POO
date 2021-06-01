package InterfazdeUsuario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoRecord{
	
	public void escrituraArchivo(int rec) {
		FileOutputStream fos = null;
		byte[] buffer = new byte [81];
		int nBytes;
		try {
			buffer = String.valueOf(rec).getBytes();
			nBytes = String.valueOf(rec).getBytes().length;
			fos = new FileOutputStream("Record.txt");
			fos.write(buffer, 0, nBytes);
        } catch (IOException io) {
            io.printStackTrace();
        }
		finally {
			try {
				if(fos != null) fos.close();
			}catch (IOException io) {
				System.out.println("Error al cerrar el archivo");
	        }
		}
		
	}
	
	public int lecturaArchivo(){
		FileInputStream fis = null;
		byte[] buffer = new byte [81];
		int nBytes, i= 0;
		try {
			fis = new FileInputStream("Record.txt");
			nBytes = fis.read(buffer, 0, 81);
			String texto = new String(buffer, 0, nBytes);
			i = Integer.parseInt(texto);
		}catch (IOException io) {
            io.printStackTrace();
        }
		finally {
			try {
				if(fis != null) fis.close();
			}catch (IOException io) {
				System.out.println("Error al cerrar el archivo");
	        }
		}
		return i;
	}
}
