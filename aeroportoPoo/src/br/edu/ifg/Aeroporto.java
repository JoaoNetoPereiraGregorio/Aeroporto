package br.edu.ifg;

import java.util.Arrays;

public class Aeroporto implements InterfaceVoo{
	private String nome;
	private Voo[] voos = new Voo[2];

	public Aeroporto() {

	}

	public Aeroporto(String nome, Voo[] voos) {

		this.nome = nome;
		this.voos = voos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Voo[] getVoos() {
		return voos;
	}

	public void setVoos(Voo[] voos) {
		this.voos = voos;
	}
	@Override
	public void setUmVooVez(Voo voo) {
		for (Voo umVoo : voos) {
			if (umVoo == null) {
				umVoo = voo;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "AEROPORTO \n\nNome: " + nome + mostraVoos(voos);
	}
	
	public String mostraVoos(Voo[] voos) {
		String resposta = "";
		for (Voo voo :  voos) {
			if (voo == null) {
				break;
			} else {
				resposta += "\n\nVoo " + voo.toString();
			}
		}
		return resposta;
	}

	

}
