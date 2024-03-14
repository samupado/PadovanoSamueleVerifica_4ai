
/**
 * @author Samuele Padovano
 * @version version 0
 * 
 * @return <Questa classe consiste nel assegnare due valori ad s e f>
 * @return <che tramite un metodo calcoli la sommatoria>
 */
public class PadovanoSamueleClass {

	public PadovanoSamueleClass() {

	}
	
	/**
	 * 
	 * @param s, indica il primo valore della sommatoria
	 * @param f, indica il primo valore della sommatoria
	 * 
	 * @return Questo metodo calcola la sommatoria tramite due variabili (s, f)
	 */
	public int padovanoMet (int s, int f) {
		
		int r=0;
		
		for(int i=1; i<f; i++) {
			
			r = s * f;
			
			//l'errore era che moltiplicava sempre r=0 quindi il risultato era sempre 0
		}
		
		return r;
	}
	

	public static void main(String[] args) {
		
		PadovanoSamueleClass p = new PadovanoSamueleClass();
		System.out.println(p.padovanoMet(2, 3));
		System.out.println(p.padovanoMet(5, 2));
		System.out.println(p.padovanoMet(7, 3));
	}
	
}
