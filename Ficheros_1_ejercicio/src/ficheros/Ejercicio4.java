package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio4 {
	private final static String DATOSFILE_IN = "imagen.jpg";
	private final static String DATOSFILE_OUT = "imagen_copia.jpg";
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File(Ejercicio3.RUTA_DATOS + DATOSFILE_IN));
			FileOutputStream fos = new FileOutputStream(new File(Ejercicio3.RUTA_DATOS + DATOSFILE_OUT));

			fos.write(fis.readAllBytes());
			fis.close();
			fos.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura o escritura");
			e.printStackTrace();
		}
		
	}
}

