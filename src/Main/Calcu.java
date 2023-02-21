package Main;

public class Calcu implements ICalcu{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Operacion suma
	@Override
	public float Suma(float num1, float num2) {
		// TODO Auto-generated method stub
		return (num1 + num2);
	}

	// Operacion resta
	@Override
	public float Resta(float num1, float num2) {
		// TODO Auto-generated method stub
		return (num1 - num2);
	}

	//Operacion division
	@Override
	public float Dividir(float num1, float num2) {
		// TODO Auto-generated method stub
		return (num1 / num2);
	}

	@Override
	public float Multiplicar(float num1, float num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
