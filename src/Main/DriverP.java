package Main;
import java.io.File;
import java.util.Stack;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class DriverP {

	public static void main(String[] args) throws FileNotFoundException{

		String archivo = "datos.txt";
		File arch = new File(archivo);
		Scanner scanner = new Scanner(arch);
		String inflix = "";
		inflix = scanner.nextLine();
		
		Stack<String> operandoS = new Stack<>();
        Stack<String> operadorS = new Stack<>();
        String[] car = inflix.split("(?<=[-+*/()])|(?=[-+*/()])");
        for (String carac : car) {
        	switch (carac) {
        	case "+":
            case "-":
            case "*":
            case "/":
            case "(":
                operadorS.push(carac);
                break;
            case ")":
                while (!operadorS.peek().equals("(")) {
                    String op = operadorS.pop();
                    String n2 = operandoS.pop();
                    String n1 = operandoS.pop();
                    operandoS.push(operaciones(n1, n2, op));
                }
                operadorS.pop(); // sacar el "(" del stack de operadores
                if (!operadorS.empty() && 
                        (operadorS.peek().equals("*") || operadorS.peek().equals("/"))) {
                    String op = operadorS.pop();
                    String n2 = operandoS.pop();
                    String n1 = operandoS.pop();
                    operandoS.push(operaciones(n1, n2, op));
                }
                break;
            default:
            	operandoS.push(carac);
                if (!operadorS.empty() && 
                    (operadorS.peek().equals("*") || operadorS.peek().equals("/") )) {
                    String op = operadorS.pop();
                    String n2 = operandoS.pop();
                    String n1 = operandoS.pop();
                    operandoS.push(operaciones(n1, n2, op));
                }
                break;    
        	}
        }
        
        while (!operadorS.empty()) {
            String op = operadorS.pop();
            String n2 = operandoS.pop();
            String n1 = operandoS.pop();
            operandoS.push(operaciones(n1, n2, op));
        }
        
        System.out.println();
        System.out.println("El resultado es: " + operandoS.pop());
     
		
		
	}

	 public static String operaciones(String n1, String n2, String op) {
		 Calcu calcu = new Calcu();
		 float op1 = Float.parseFloat(n1);
		 float op2 = Float.parseFloat(n2);
	     float res = 0;
	     switch (op) {
         case "+":
        	 res = calcu.Suma(op2, op1);
             break;
         case "-":
        	 res = calcu.Resta(op2, op1);
             break;
         case "*":
        	 res = calcu.Multiplicar(op2, op1);
             break;
         case "/":
        	 res = calcu.Dividir(op2, op1);
             break;
     }
     return Float.toString(res);
	    }
}