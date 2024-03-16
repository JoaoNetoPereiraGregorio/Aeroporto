package br.edu.ifg;

public interface InterfaceAviao {
	public void setUmaPoltronaVez(Poltrona poltrona);
	public void setUmPassageiroVez(Passageiro passageiro);
	public String mostraPoltronas(Poltrona[] poltronas);
	public String mostraPassageiros(Passageiro[] passageiros);
}
