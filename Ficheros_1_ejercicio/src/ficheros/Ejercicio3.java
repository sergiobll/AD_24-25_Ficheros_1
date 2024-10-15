package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio3 {
	//Las constantes siempre se ponen en mayúsculas. Esta constante contiene la ruta para el archivo CSV. Es pública para poder usarla en otras clases
	public final static String RUTA_DATOS = System.getProperty("user.dir") + 
			System.getProperty("file.separator") + 
			"src" + 
			System.getProperty("file.separator") +
			"data" +
			System.getProperty("file.separator")
			;
	
	private final static String DATOSFILE = "3_Ejercicio.csv";

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(RUTA_DATOS + DATOSFILE));
			String linea;
			while((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			br.close();
			
			//El siguiente método utiliza la ruta y el archivo al que accedemos y un booleano para indicar si sobreescribimos el archivo o no
			PrintWriter pw = new PrintWriter(new FileWriter(RUTA_DATOS + DATOSFILE, true));
			pw.println("Hugo;Gómez;DAM;2");
			//pw.flush();
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			e.printStackTrace();
		}

	}

}
