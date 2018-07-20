package comportamiento.Iterador;
/**
 * Created by jmillafilo 
 */
public class Test{
	public static void main(String... args){
		ListaPalabras lp = new ListaPalabras();
		Iterador iterador;


		lp.agregar("OCHO");
		lp.agregar("CINCO");
		lp.agregar("DOS");
		lp.agregar("UNO");
		lp.agregar("TRES");
		lp.agregar("NUEVE");

		iterador = lp.iterador();
		while(iterador.tieneSiguiente()){
			String palabra = (String) iterador.siguiente();
			System.out.println(palabra);
		}

	}
}