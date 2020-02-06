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
	
		String ruta = "./data/comparendos_dei_2018_small.geojson";
		File archivo = new File (ruta);
		JsonReader reader = new JsonReader ( new InputStreamReader(new FileInputStream(archivo)));
		JsonObject gsonObj0 = JsonParser.parseReader(reader).getAsJsonObject();
		
		JsonArray comparendos = gsonObj0.get("features").getAsJsonArray();
		int i=0;
		
		while (i<comparendos.size()){
			JsonElement obj = comparendos.get(i);
			JsonObject gsonObj = obj.getAsJsonObject();
		
			JsonObject gsonObjpropiedades = gsonObj.get("properties").getAsJsonObject();
			int objid = gsonObjpropiedades.get("OBJECTID").getAsInt();
			String fecha = gsonObjpropiedades.get("FECHA_HORA").getAsString();
			String clasevehiculo = gsonObjpropiedades.get("CLASE_VEHI").getAsString();
			String tiposervi= gsonObjpropiedades.get("TIPO_SERVI").getAsString();
			String infraccion = gsonObjpropiedades.get("INFRACCION").getAsString();
			String desinfraccion = gsonObjpropiedades.get("DES_INFRAC").getAsString();
			String localidad = gsonObjpropiedades.get("LOCALIDAD").getAsString();

			JsonObject gsonObjgeometria = gsonObj.get("geometry").getAsJsonObject();
			
			JsonArray gsonArrcoordenadas = gsonObjgeometria.get("coordinates").getAsJsonArray();
			double longitud = gsonArrcoordenadas.get(0).getAsDouble();
			double latitud = gsonArrcoordenadas.get(1).getAsDouble();
			
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
