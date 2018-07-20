package comportamiento.Iterador;

import java.util.ArrayList;

/**
 * Created by jmillafilo 
 */
public class ListaPalabrasIterador implements Iterador{
	private ArrayList<String> palabra;
	private int posicion;

	public ListaPalabrasIterador(ArrayList<String> palabra)
	{
		this.palabra = palabra;
		this.posicion = 0;
	}

	@Override
	public Object siguiente(){
		posicion++;
		return palabra.get(posicion);
	}

	@Override
	public boolean tieneSiguiente(){
		if(posicion < palabra.size()-1){
			return true;
		} else { 
			return false;
		}
	}
}