import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

package Main;

public class test {
	ICalcu calcular = new Calcu();
	
	@Test
	void TC1_SumaPositivosTest() {
		int result = (int) calcular.Suma(3, 5);
		assertEquals(8, result);
	}

	@Test
	void TC2_RestaTest() {
		int result = (int) calcular.Resta(-3, 5);
		assertEquals(2, result);
	}

	@Test
	void TC3_DivisionTest() {
		int result = (int) calcular.Dividir(3, -5);
		assertEquals(-2, result);

}
