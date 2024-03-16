package br.edu.ifg;

public class Piloto extends Pessoa {

	private String funcao;
	private String matriculaPiloto;

	public Piloto() {

	}

	public Piloto(String nome, String cpf, String sexo, String funcao, String matriculaPiloto) {
		super(nome, cpf, sexo);
		this.funcao = funcao;
		this.matriculaPiloto = matriculaPiloto;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getMatriculaPiloto() {
		return matriculaPiloto;
	}

	public void setMatriculaPiloto(String matriculaPiloto) {
		this.matriculaPiloto = matriculaPiloto;
	}

	@Override
	public String toString() {
		return "\n\nNome:" + getNome() + "\nCPF:" + getCpf() + "\nSexo:" + getSexo() + "\nFunção:" + funcao
				+ " \nMatricula Piloto:" + matriculaPiloto;
	}

}
