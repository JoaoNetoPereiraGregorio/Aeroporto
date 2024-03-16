package br.edu.ifg;

import java.util.Arrays;

public class Aviao implements InterfaceAviao {
	private int numero;
	private Poltrona[] poltronas = new Poltrona[10];
	private Passageiro[] passageiros = new Passageiro[10];

	public Aviao() {

	}

	public Aviao(int numero, Poltrona[] poltronas, Passageiro[] passageiros) {

		this.numero = numero;
		this.poltronas = poltronas;
		this.passageiros = passageiros;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Poltrona[] getPoltronas() {
		return poltronas;
	}

	public void setPoltronas(Poltrona[] poltronas) {
		this.poltronas = poltronas;
	}

	public Passageiro[] getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Passageiro[] passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public void setUmaPoltronaVez(Poltrona poltrona) {
		for (Poltrona umaPoltrona :  poltronas) {
			if (umaPoltrona == null) {
				umaPoltrona = poltrona;
				return;
			}
		}
	}

	@Override
	public void setUmPassageiroVez(Passageiro passageiro) {
		for (Passageiro umPassageiro :  this.passageiros) {
			if (umPassageiro == null) {
				umPassageiro = passageiro;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "\n\nAviao \n\nNumero:" + numero + "\n\nPOlTRONAS" + mostraPoltronas(poltronas) + "\n\nPASSAGEIROS"
				+ mostraPassageiros(passageiros);
	}

	@Override
	public String mostraPoltronas(Poltrona[] poltronas) {
		String resposta = "";
		for (Poltrona poltrona:  poltronas) {
			if (poltrona == null) {
				break;
			} else {
				resposta += "\n\nPoltrona " + poltrona.toString();
			}
		}
		return resposta;
	}

	@Override
	public String mostraPassageiros(Passageiro[] passageiros) {
		String resposta = "";
		for (Passageiro passageiro : passageiros) {
			if (passageiro == null) {
				break;
			} else {
				resposta += "\n\nPassageiro "  + passageiro.toString();
			}
		}
		return resposta;
	}

}
