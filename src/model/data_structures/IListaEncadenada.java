package model.data_structures;

public interface IListaEncadenada <T>{

	
	public int darTotalNodos();
	public Nodo<T> darPrimerNodo();
	public Nodo<T> darUltimoNodo();
	public void add(Comparendo n);
	public T buscarObjId(int i);
	public int size();
	public String darInformacion();
	
}
