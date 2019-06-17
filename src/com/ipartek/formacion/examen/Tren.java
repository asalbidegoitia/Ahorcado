package com.ipartek.formacion.examen;

public class Tren {
	// atributos
	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int anosActivo;

	// constructora
	public Tren(String tipo, String referencia, int asientosOcupados, int anosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivo = anosActivo;
	}

	// getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAnosActivo() {
		return anosActivo;
	}

	public void setAnosActivo(int anosActivo) {
		this.anosActivo = anosActivo;
	}

	// metodos
	
	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", anosActivo=" + anosActivo + "]";
	}

	public boolean TrenLleno() {
		if (asientosOcupados >400){
			return true;
		}else {
			return false;
		}
		
	}

	public void demasiadoViejo() {
		if (anosActivo>=40){
			System.out.println("EN CIRCULACION");
		}else {
			System.out.println("FUERA DE CIRCULACION");
		}
	}

}
