package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeBreakTest {

	@Test
	public void test_numero_correcto() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1234");
		assertEquals("XXXX", igual);
	}
	
	@Test
	public void test_solo_aprueba_1234() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1234");
		assertEquals("XXXX", igual);
	}
	@Test
	public void test_no_coincide() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("6789");
		assertEquals("", igual);
	}
	@Test
	public void test_todos_numeros_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("4321");
		assertEquals("____", igual);
	}
	
	@Test
	public void test_un_acierto_posicion() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1567");
		assertEquals("X", igual);
	}
	
	@Test
	public void test_dos_acierto_posicion() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1265");
		assertEquals("XX", igual);
	}
	
	@Test
	public void test_tres_acierto_posicion() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1264");
		assertEquals("XXX", igual);
	}
	
	@Test
	public void test_un_numero_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("2789");
		assertEquals("_", igual);
	}
	
	@Test
	public void test_dos_numero_posicion_erron() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("2476");
		assertEquals("__", igual);
	}
	
	@Test
	public void test_tres_numero_posicion_erron() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("4328");
		assertEquals("___", igual);
	}
	@Test
	public void test_un_acierto_posicion_tres_numero_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1423");
		assertEquals("X___", igual);
	}
	@Test
	public void test_dos__acierto_posicion_dos_numero_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1243");
		assertEquals("XX__", igual);
	}
	@Test
	public void test_dos_acierto_posicion_un_numero_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1245");
		assertEquals("XX_", igual);
	}
	@Test
	public void test_un_acierto_posicion_dos_numero_posicion_erronea() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("1325");
		assertEquals("X__", igual);
	}
	
	@Test
	public void test_numero_mayor_cuatro_digitos() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("12466");
		assertEquals(null, igual);
	}
	@Test
	public void test_numero_digito_repetido() {
		CodeBreaker cb = new CodeBreaker();
		String igual = cb.adivinar("3333");
		assertEquals(null, igual);
	}

}
