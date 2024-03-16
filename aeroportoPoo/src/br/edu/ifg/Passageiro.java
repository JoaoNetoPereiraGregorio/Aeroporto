package br.edu.ifg;

public class Passageiro extends Pessoa{
	private int numeroPasagem;
	private Poltrona poltrona;
	
	public Passageiro() {
		
	}

	public Passageiro(String nome, String cpf, String sexo, int numeroPasagem, Poltrona poltrona) {
		super(nome, cpf, sexo);
		this.numeroPasagem = numeroPasagem;
		this.poltrona = poltrona;
	}

	public int getNumeroPasagem() {
		return numeroPasagem;
	}

	public void setNumeroPasagem(int numeroPasagem) {
		this.numeroPasagem = numeroPasagem;
	}

	public Poltrona getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(Poltrona poltrona) {
		this.poltrona = poltrona;
	}

	@Override
	public String toString() {
		return "\n\nNome:" + getNome() + "\nCPF:" + getCpf() + "\nSexo:" + getSexo() +"\nNumero Pasagem:" + numeroPasagem + "\nPoltrona Numero:" + poltrona.getNumero();
	}
	
	

}
