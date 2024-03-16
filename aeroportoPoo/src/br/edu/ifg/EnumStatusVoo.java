package br.edu.ifg;

public enum EnumStatusVoo {
	DE("DECOLANDO"), AT("ATERRISANDO");
	
	
	

	private String descricao;

	private EnumStatusVoo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
	
	
	
}
