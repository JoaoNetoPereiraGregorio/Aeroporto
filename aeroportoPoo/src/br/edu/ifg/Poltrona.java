package br.edu.ifg;

public class Poltrona {
	
	private int numero;
	private boolean ocupado;
	
	public Poltrona() {
		
	}

	public Poltrona(int numero, boolean ocupado) {
		super();
		this.numero = numero;
		this.ocupado = ocupado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "\n\nNumero:" + numero + "\nOcupada:" + converteResultadoPoltrona(ocupado);
	}
	
	public String converteResultadoPoltrona(boolean ocupada) {
		if(ocupada) {
			return "SIM";
		}else{
			return "NÃO";
		}
	}

}
