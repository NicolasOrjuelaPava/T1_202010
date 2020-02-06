package test.data_structures;

import model.data_structures.ListaEncadenada;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ListaEncadenada lista;
	
	
	
	public void setUp1() {
		lista= new ListaEncadenada();
	}

	public void setUp2() {
		for(int i =0; i< 2*2; i++){
			lista.add(i);
		}
	}


}
