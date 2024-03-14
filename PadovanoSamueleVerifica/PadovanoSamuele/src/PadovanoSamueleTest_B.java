import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PadovanoSamueleTest_B {

	/**
	 * @Before seconda classe test 
	*/
	
	@Test
	public void test_1() {
		
		PadovanoSamueleClass p = new PadovanoSamueleClass();
		int risultatoOttenuto = p.padovanoMet(2, 3);
		int risultatoAtteso = 6;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto);
		
		//risultato ottenuto 0
	}
	
	@Test
	public void test_2() {
		
		PadovanoSamueleClass p = new PadovanoSamueleClass();
		int risultatoOttenuto = p.padovanoMet(5, 2);
		int risultatoAtteso = 10;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto);
		
		//risultato ottenuto 0
	}
	
	@Test
	public void test_3() {
		
		PadovanoSamueleClass p = new PadovanoSamueleClass();
		int risultatoOttenuto = p.padovanoMet(7, 3);
		int risultatoAtteso = 21;
		assertEquals(risultatoAtteso, risultatoOttenuto);
		System.out.println(risultatoOttenuto);
		
		//risultato ottenuto 0
	}

}
