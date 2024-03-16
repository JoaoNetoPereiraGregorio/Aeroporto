package br.edu.ifg;

public class Voo {
	private int numero;

	private Tripulacao tripulacao;
	private Aviao aviao;
	private EnumStatusVoo status;

	public Voo() {

	}

	public Voo(int numero, EnumStatusVoo status, Tripulacao tripulacao, Aviao aviao) {
		super();
		this.numero = numero;
		this.status = status;
		this.tripulacao = tripulacao;
		this.aviao = aviao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public EnumStatusVoo getStatus() {
		return status;
	}

	public void setStatus(EnumStatusVoo status) {
		this.status = status;
	}

	public Tripulacao getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(Tripulacao tripulacao) {
		this.tripulacao = tripulacao;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	@Override
	public String toString() {
		return "\n\nNumero:" + numero + "\nStatus:" + status.getDescricao() + "\n" + tripulacao.toString() + aviao.toString();
	}

}
