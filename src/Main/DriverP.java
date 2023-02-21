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
		
		Calcu calcu = new Calcu();
		Stack<String> poS = new Stack<>();
		
		float num1; 
		float num2;
		float res;
		
		for (String item : items) {
			if ( isNumeric(item) == true) {
				poS.push(item);
			}
		}
		
		
	}

	// Creditos: https://es.stackoverflow.com/questions/283663/como-usar-el-isnumeric-con-un-if-en-java
	public static boolean isNumeric(String str) { 
	    try {  
	      Double.parseDouble(str);  
	      return true;
	    } catch(NumberFormatException e){  
	      return false;  
	    }  

	}

}
