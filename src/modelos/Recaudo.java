package modelos;

import java.util.Date;

public class Recaudo {
	private int idRecaudo;
	private int idClientes;
	private long noReferencia;
	private float valor;
	private Date fechaVencimiento;
	
	public Recaudo(int idClientes, long noReferencia, float valor, Date fechaVencimiento) {
		super();
		this.idClientes = idClientes;
		this.noReferencia = noReferencia;
		this.valor = valor;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public int getIdRecaudo() {
		return idRecaudo;
	}
	public void setIdRecaudo(int idRecaudo) {
		this.idRecaudo = idRecaudo;
	}
	public int getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}
	public long getNoReferencia() {
		return noReferencia;
	}
	public void setNoReferencia(long noReferencia) {
		this.noReferencia = noReferencia;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
