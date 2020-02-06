package model.data_structures;

public class Comparendo {

	private int objid;
	private String fecha;
	private String clasevehiculo;
	private String tiposervi;
	private String infraccion;
	private String localidad;
	private double latitud;
	private double longitud;
	
	public Comparendo(int paramobjid, String paramfecha, String paramclasevehiculo, String paramtiposervi, String paraminfraccion, String paramdesinfraccion, String paramlocalidad, double paramlongitud, double paramlatitud){
		objid = paramobjid;
		fecha = paramfecha;
		clasevehiculo = paramclasevehiculo;
		tiposervi= paramtiposervi;
		infraccion = paraminfraccion;
		localidad = paramlocalidad;
		latitud = paramlatitud;
		longitud = paramlongitud;
	
	}
	
	//generados automaticamente, getters y setters
	public int getObjid() {
		return objid;
	}
	public void setObjid(int objid) {
		this.objid = objid;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getClasevehiculo() {
		return clasevehiculo;
	}
	public void setClasevehiculo(String clasevehiculo) {
		this.clasevehiculo = clasevehiculo;
	}
	public String getTiposervi() {
		return tiposervi;
	}
	public void setTiposervi(String tiposervi) {
		this.tiposervi = tiposervi;
	}
	public String getInfraccion() {
		return infraccion;
	}
	public void setInfraccion(String infraccion) {
		this.infraccion = infraccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String info(){
		return getClasevehiculo()+ getFecha()+ getInfraccion()+getLocalidad()+ getObjid()+ getTiposervi();
		}
	
}
