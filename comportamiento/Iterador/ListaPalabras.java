package comportamiento.Iterador;

import java.util.ArrayList;

/**
 * Created by jmillafilo 
 */
public class ListaPalabras{
	private ArrayList<String> palabra;
	private int posicion;

	public ListaPalabras(){
		palabra = new ArrayList<>();
		posicion = 0;
	}

	public void agregar(String p){
		palabra.add(p);
		posicion++;
	}

	public ListaPalabrasIterador iterador(){
		return new ListaPalabrasIterador(palabra);
	}
}