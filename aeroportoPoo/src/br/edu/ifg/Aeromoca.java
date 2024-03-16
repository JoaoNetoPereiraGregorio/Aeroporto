package br.edu.ifg;

public class Aeromoca extends Pessoa {

	private String matriculaAeromoca;
	
	public Aeromoca() {
		
	}

	public Aeromoca(String nome, String cpf, String sexo,String matriculaAeromoca) {
		super(nome,cpf,sexo);
		this.matriculaAeromoca=matriculaAeromoca;
	}

	public String getMatriculaAeromoca() {
		return matriculaAeromoca;
	}

	public void setMatriculaAeromoca(String matriculaAeromoca) {
		this.matriculaAeromoca = matriculaAeromoca;
	}

	@Override
	public String toString() {
		return "\n\nNome:" + getNome() + "\nCPF:" + getCpf() + "\nSexo:" + getSexo() +"\nMatricula Aeromoca:" + matriculaAeromoca ;
	}
	
	
	
	

}
