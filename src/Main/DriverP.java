package Main;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class DriverP {

	public static void main(String[] args) throws FileNotFoundException{

		String archivo = "datos.txt";
		File arch = new File(archivo);
		Scanner scanner = new Scanner(arch);
		String inflix = "";
		inflix = scanner.nextLine();
		String[] items = inflix.split(" ");
		
	}

}
