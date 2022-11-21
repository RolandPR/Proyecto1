package modelos;

public class Tipos_documentos {

	private int idTiposDocumentos;
	private String nombre;
	
	
	public Tipos_documentos(String nombre) {
		this.nombre = nombre;
		
	}
	
	public int getIdTiposDocumentos() {
		return idTiposDocumentos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
