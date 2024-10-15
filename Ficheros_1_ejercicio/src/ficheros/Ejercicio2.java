package ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca la ruta al directorio o fichero: ");
		String fileName = scanner.nextLine();
		File f = new File(fileName);
		scanner.close();
		if (f.exists()) {
			System.out.println((f.isFile()?"F\t":"D\t"));
			infoFichero(f);
			if (f.isDirectory()) {
			File[] hijos = f.listFiles();
			for(File file: hijos) {
				System.out.println("\t" + file.getName() + "\t" + (file.isFile()?"F\t":"D\t"));
				infoFichero(file);
			}
		}
		} else {
			System.out.println("El fichero o directorio introducido no existe, por favor revise la ruta");
			
		}
		

	}
public static void infoFichero(File f) {
	System.out.println(
			(f.isFile()
			
				
					)
			);
}
}
//f.canRead()/canWrite()/canExecute/Probar a hacerlo recursivo