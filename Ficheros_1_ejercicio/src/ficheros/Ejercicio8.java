package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
	private static final String SEPARADOR=",";
	private static final String COMILLA="\"";
	public final static String FICHEROTRABAJO = "ejercicio08.csv";

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(Ejercicio3.RUTA_DATOS+FICHEROTRABAJO));
			String line;
			while ((line = br.readLine())!=null) {
				String[] fields = line.split(SEPARADOR);
				mostrarValores(fields);
				fields = eliminaComillas(fields);
				mostrarValores(fields);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) {
				br.close();
			}
		}
	}

	private static String[] eliminaComillas(String[] fields) {
		for (int i = 0; i<fields.length; i++) {
			fields[i] = fields[i].trim().replaceAll("^" + COMILLA, "").replaceAll(COMILLA+"$", "").replaceAll(COMILLA+COMILLA, COMILLA);
		}
		return fields;
		
	}

	private static void mostrarValores(String[] fields) {
		for (int i = 0; i<fields.length; i++) {
			System.out.println("\t - " + fields[i]);
		}
		System.out.println();
		
	}

}
