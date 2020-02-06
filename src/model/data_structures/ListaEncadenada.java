package model.data_structures;

public class ListaEncadenada<T> implements IListaEncadenada{

	private int totalNodos;
	private T primerNodo;
	private T ultimoNodo;
	Nodo <T> act;
	
	//constructor
	public ListaEncadenada(){
		totalNodos = 0;
		primerNodo = null;
		ultimoNodo = null;
	}
	
	//el metodo de buscar el Nodo que quiere encontrar el usuario se implementa en la clase Modelo, como lo establecido en el enunciado del taller
	
	public int darTotalNodos(){
		
		Nodo<T> actual = (Nodo<T>) primerNodo;
		if (actual !=null){
			totalNodos++;
		}
		return totalNodos;
	}
	
	public String darInformacion(){
		
		return "El primer comparendo es: "+((Comparendo) primerNodo).info()  + " El ultimo Comparendo es: " + ((Comparendo) ultimoNodo).info() + " Para un TOTAL de :" + darTotalNodos();
	}
	
	public Nodo<T> darPrimerNodo(){
		return (Nodo<T>) primerNodo;
	}
	
	public Nodo<T> darUltimoNodo(){
		Nodo<T> actual = (Nodo<T>) primerNodo;
		if (actual != null){
			ultimoNodo=(T) actual;
			actual = (Nodo<T>) actual.darSiguiente();
		}
		return (Nodo<T>) ultimoNodo;
	}

	
	
	public int size() {

		while (primerNodo!= null){
			totalNodos++;
			primerNodo = (T) ((Nodo<T>) primerNodo).darSiguiente();
		}
		
		return totalNodos;
	}
	
	
	public T buscarObjId(int posicion){
		if (primerNodo == null){
			return null;
		}else{
			Nodo<T> puntero = (Nodo<T>) primerNodo;
			int cont =0;
			while (cont<posicion && puntero.darSiguiente()!= null){
				puntero =(Nodo<T>) puntero.darSiguiente();
				cont++;
			}
			if (cont!=posicion){
				return null;
			}else {
				return (T) puntero.darActual();
			}
		}

	}
	
	//ojo, me puede dar nullpointer
	public void add(Comparendo n){
		Nodo actual = (Nodo) primerNodo;
		boolean centinela = false;
		
		while (centinela == false && actual!= null){
			
			if(actual.darSiguiente()== null){
				
				actual.agregarSiguiente(n);
				centinela = true;
			}
			
			actual = (Nodo) actual.darSiguiente();
		}
		
	}
	
	
	
}
