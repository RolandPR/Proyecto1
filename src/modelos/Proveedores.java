package modelos;

public class Proveedores {

	private int idProveedores;
	private int idRecaudo;
	private String nombre;
	
	public Proveedores(int idRecaudo, String nombre) {
		super();
		this.idRecaudo = idRecaudo;
		this.nombre = nombre;
	}
	
	public int getIdProveedores() {
		return idProveedores;
	}
	public void setIdProveedores(int idProveedores) {
		this.idProveedores = idProveedores;
	}
	public int getIdRecaudo() {
		return idRecaudo;
	}
	public void setIdRecaudo(int idRecaudo) {
		this.idRecaudo = idRecaudo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
