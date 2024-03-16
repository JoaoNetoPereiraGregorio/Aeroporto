package br.edu.ifg;

public interface InterfaceTripulacao {
	public void setUmaAeromocaVez(Aeromoca aeromoca) ;
	public void setUmPilotoVez(Piloto piloto);
	public String mostraPIlotos(Piloto[] pilotos);
	public String mostraAeromocas(Aeromoca[] aeromocas);
}
