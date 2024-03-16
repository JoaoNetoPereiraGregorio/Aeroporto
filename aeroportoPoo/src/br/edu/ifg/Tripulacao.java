package br.edu.ifg;

import java.util.Arrays;

public class Tripulacao implements InterfaceTripulacao {
	private Piloto[] pilotos = new Piloto[2];
	private Aeromoca[] aeromocas = new Aeromoca[2];

	public Tripulacao() {

	}

	public Tripulacao(Piloto[] pilotos, Aeromoca[] aeromocas) {

		this.pilotos = pilotos;
		this.aeromocas = aeromocas;
	}

	public Piloto[] getPilotos() {
		return pilotos;
	}

	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}

	public Aeromoca[] getAeromocas() {
		return aeromocas;
	}

	public void setAeromocas(Aeromoca[] aeromocas) {
		this.aeromocas = aeromocas;
	}

	@Override
	public void setUmaAeromocaVez(Aeromoca aeromoca) {
		for (Aeromoca umaAeromoca : aeromocas) {
			if (umaAeromoca == null) {
				umaAeromoca = aeromoca;
				return;
			}
		}
	}

	@Override
	public void setUmPilotoVez(Piloto piloto) {
		for (Piloto umPiloto : pilotos) {
			if (umPiloto == null) {
				umPiloto = piloto;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "\n\nTRIPULAÇÃO " + mostraPIlotos(pilotos) + "\n\nAEROMOÇAS" + mostraAeromocas(aeromocas);
	}

	@Override
	public String mostraPIlotos(Piloto[] pilotos) {
		String resposta = "";
		for (Piloto piloto : pilotos) {
			if (piloto == null) {
				break;
			} else {
				resposta += "\n\nPiloto " + piloto.toString();
			}
		}

		return resposta;
	}

	@Override
	public String mostraAeromocas(Aeromoca[] aeromocas) {
		String resposta = "";
		for (Aeromoca aeromoca : aeromocas) {
			if (aeromoca == null) {
				break;
			} else {
				resposta += "\n\nAeromoça "  + 	aeromoca.toString();
			}
		}

		return resposta;
	}

}
