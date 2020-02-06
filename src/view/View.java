package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
		public int eleccionUsuario;
		public Modelo modelo;
		public int objectIdBuscado;
		
	    public View()
	    {
	    	eleccionUsuario=0;
	    	objectIdBuscado=0;
	    }
	    
		public void printMenu()
		{
			//despliga el menu de opciones para que el usuario lea
			System.out.println("BIENVENIDO, POR FAVOR ESCRIBA EL NUMERO DE LA ACCION QUE DESEA REALIZAR: 1 O 2");
			System.out.println("1 - Crear Lista Encadenada de los Datos de Comparendos");
			System.out.println("2 - Consultar por OBJECTID");
			
		}

		public void printMessage() {
			// el ingreso de la seleccion del usuario y si es 2, asigna el valor a objetId, return 1 si se usa la op. 2, 0 si no, 
		
			Scanner entrada = new Scanner(System.in);
			eleccionUsuario = entrada.nextInt();
			if (eleccionUsuario == 2){
				System.out.println("Ingrese el OBJECTID del comparendo que desea buscar");
				objectIdBuscado = entrada.nextInt();
			}

		}		
		
		public void printModelo() throws FileNotFoundException
		{
			// TODO implementar
		 	if (eleccionUsuario == 1){
		 		//llamar metodo de modelo de crear la lista encadenada y hacer las operaciones necesarias (mostrar info primero, ultimo, mostrar total elementos)
		 		//crear la LISTA
		 		modelo.cargar();
		 		//LLamar a modelo
		 		modelo.mostrarInfoBasica();
		 		//mostrar info primer comparendo
		 		
		 		//mostrar info ultimo comparendo
		 		
		 		//mostrar total de comparendos
		 		
		 		System.out.println("esta bn la metodologia"+ modelo.darTamano());
		 		
		  	}else{
		  		//lamar metodo de modelo para consultar por objectId
		  		// crear la lista y llamar los requerimientos
		  		modelo.cargar();
		  		modelo.buscarPorObjectId(objectIdBuscado);
		  	}
		 
		 	
		}
}
