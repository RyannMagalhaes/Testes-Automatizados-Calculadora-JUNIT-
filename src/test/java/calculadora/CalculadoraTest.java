package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calc;
	
	
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		//definir cenário
		int resultadoEsperado = 0;
		
		//executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();
		
		//comparar
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarConstrutorComParametroMemoria3(){
		//definir cenário
		int resultadoEsperado = 3;

		//executar
		calc = new Calculadora(3);
		int resultadoObtido = calc.getMemoria();

		//comparar
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@BeforeEach
	public void testarinstanciaPadrao(){
		calc = new Calculadora(3);
	}


	@Test
	public void testarSomaNumeroNegativo(){
		int resultadoEsperado = -1;
		calc.somar(-4);
		int resultadoObito = calc.getMemoria();

		//Comparar
		assertEquals(resultadoEsperado,resultadoObito);
	}

	@Test
	public void testarSubtrairNumeroPositivo(){
		int resultadoEsperado = 1;
		calc.subtrair(2);
		int resultadoObito = calc.getMemoria();

		//Comparar
		assertEquals(resultadoEsperado,resultadoObito);
	}

	@Test
	public void testarMultiplicarNumeroPositivo(){
		int resultadoEsperado = 6;
		calc.multiplicar(3);
		int resultadoObito = calc.getMemoria();

		//Comparar
		assertEquals(resultadoEsperado,resultadoObito);
	}

	@Test
	public void testasrDivisaoPorZero(){
		//Comparar
		assertThrows(Exception.class, () ->{
			calc.dividir(0);
		});
	}

	 @Test
	 public void dividirNumeroPositivo() throws Exception{

		calc.dividir(3);
		int resultadoEsperado = 1;
		int resultadoObito = calc.getMemoria();

		//Comparar
		assertEquals(resultadoEsperado,resultadoObito);
	}

	@Test
	public void testarZerarMemoria(){
		int resultadoEsperado = 0;
		calc.zerarMemoria();

		assertEquals(0,calc.getMemoria());
	}
}
