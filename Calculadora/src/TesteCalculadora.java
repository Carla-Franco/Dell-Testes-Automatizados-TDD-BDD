import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	public calculadora cal = new calculadora(); 	
	@Test
	public void test() {
		
		double soma = cal.somar(2,  2);
		assertEquals(4,soma);
	}

}
