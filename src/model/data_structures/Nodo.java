package model.data_structures;

import java.io.Serializable;

public class Nodo <T> {

	/**
	 * 
	 */

	private T actual;
	
	private T siguiente;
	
	//constructor
	public Nodo(T c){
		
		actual = c;
		siguiente = null;
	}
	
	
	public T darActual(){
		return actual;
	}
	
	public T darSiguiente(){
		return siguiente;
	}
	
	public void agregarSiguiente(T n){
		if (siguiente==null){
			siguiente = (T) n; 
		}
	}
		

	
}
