package model.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import model.data_structures.*;


public class Modelo{

	/**
	 * Atributos del modelo del mundo
	 */
	private ListaEncadenada datos;
	
	
	
	//constructor
	public Modelo()
	{
		datos = new ListaEncadenada();
	}
	
	
	public void cargar()throws FileNotFoundException{
	
		String ruta = "./data/comparendos_dei_2018.geojson";
		
		File ar = new File (ruta);
		JsonReader lector = new JsonReader ( new InputStreamReader(new FileInputStream(ar)));
	
		JsonObject obj0 = JsonParser.parseReader(lector).getAsJsonObject();
		
		JsonArray comparendos = obj0.get("features").getAsJsonArray();
		
		int i=0;
		
		while (i<comparendos.size()){
			JsonElement obj = comparendos.get(i);
			JsonObject gsonObj = obj.getAsJsonObject();
		
			JsonObject propiedades = gsonObj.get("properties").getAsJsonObject();
			int objid = propiedades.get("OBJECTID").getAsInt();
			String infraccion = propiedades.get("INFRACCION").getAsString();
			String fecha = propiedades.get("FECHA_HORA").getAsString();
			String localidad = propiedades.get("LOCALIDAD").getAsString();
			String clasevehiculo = propiedades.get("CLASE_VEHI").getAsString();
			String tiposervi= propiedades.get("TIPO_SERVI").getAsString();
			String desinfraccion = propiedades.get("DES_INFRAC").getAsString();

			JsonObject geo = gsonObj.get("geometry").getAsJsonObject();
			
			JsonArray coordenadas = geo.get("coordinates").getAsJsonArray();
			
			double latitud = coordenadas.get(1).getAsDouble();

			double longitud = coordenadas.get(0).getAsDouble();
			
			Comparendo agregar = new Comparendo(objid, fecha, clasevehiculo, tiposervi, infraccion, desinfraccion, localidad, longitud, latitud);
			
			datos.add(agregar);
			
			i++;
		
		}
	}
	
	

	//info primero
	//Info ultimo
	//info total elementos
	public String mostrarInfoBasica(){
		
		String var = datos.darInformacion();
		return var;
	}

	public int darTamano()
	{
		return datos.size();	
	}


	
	//TOCA IMPLEMENTARLO ACA
	
	public <T> String buscarPorObjectId(int objectId)
	{
		String var = "";
		T v = (T) datos.buscarObjId(objectId);	
	
		
		return var;
	}



}
