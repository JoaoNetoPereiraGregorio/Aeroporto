package br.edu.ifg;

public class Main {

	public static void main(String[] args) {
		// Criando pilotos e colocando dentro de um array
		Piloto piloto1 = new Piloto("Paulo", "1234", "Masculino", "Piloto", "8584");
		Piloto coPiloto1 = new Piloto("Marcos", "8888", "Masculino", "Co-Piloto", "4546");
		Piloto[] pilotos1 = { piloto1, coPiloto1 };

		// criando aeromocas e colocando dentro de um array
		Aeromoca aeromoca1 = new Aeromoca("Vaniele", "4785", "Feminino", "7896");
		Aeromoca aeromoca2 = new Aeromoca("Maria", "7412", "Feminino", "3698");
		Aeromoca[] aeromocas1 = { aeromoca1, aeromoca2 };

		// criando tripulacao e passando o array de pilotos e aeromocas
		Tripulacao tripuacao1 = new Tripulacao(pilotos1, aeromocas1);

		// criando poltronas e colocando dentro de um array
		Poltrona poltrona1 = new Poltrona(001, true);
		Poltrona poltrona2 = new Poltrona(002, true);
		Poltrona poltrona3 = new Poltrona(003, false);
		Poltrona poltrona4 = new Poltrona(004, false);
		Poltrona poltrona5 = new Poltrona(005, false);
		Poltrona poltrona6 = new Poltrona(006, true);
		Poltrona poltrona7 = new Poltrona(007, true);
		Poltrona poltrona8 = new Poltrona(010, false);
		Poltrona poltrona9 = new Poltrona(011, true);
		Poltrona poltrona10 = new Poltrona(012, false);
		Poltrona[] poltronas1 = { poltrona1, poltrona2, poltrona3, poltrona4, poltrona5, poltrona6, poltrona8,
				poltrona8, poltrona9, poltrona10 };

		// criando passageiros e colocando dentro de um array
		Passageiro passageiro1 = new Passageiro("João", "1111", "Masculino", 1, poltrona1);
		Passageiro passageiro2 = new Passageiro("Mateus", "2222", "Masculino", 2, poltrona2);
		Passageiro passageiro3 = new Passageiro("Marcela", "3333", "Feminino", 3, poltrona6);
		Passageiro passageiro4 = new Passageiro("Danilo", "4444", "Masculino", 4, poltrona7);
		Passageiro passageiro5 = new Passageiro("Beatriz", "5555", "Feminino", 5, poltrona9);
		Passageiro[] passageiros1 = { passageiro1, passageiro2, passageiro3, passageiro5, passageiro5 };

		// criando o aviao passando o array de poltronas e pilotos
		Aviao aviao1 = new Aviao(11, poltronas1, passageiros1);

		// criando um voo passando um aviao e a tripulação
		
		
		Voo voo1 = new Voo(1,EnumStatusVoo.DE, tripuacao1, aviao1);

		// novos pilotos
		piloto1 = new Piloto("Roberto", "4545", "Masculino", "Piloto", "4894");
		coPiloto1 = new Piloto("Josue", "9999", "Masculino", "Co-Piloto", "4846");

		// novas aeromoças
		aeromoca1 = new Aeromoca("Viviane", "4849", "Feminino", "9635");
		aeromoca2 = new Aeromoca("Cristiane", "2031", "Feminino", "7456");

		// nova tripulação utilizando set para adicionar pilotos e aeromoças um por vez
		tripuacao1 = new Tripulacao();
		tripuacao1.setUmPilotoVez(piloto1);
		tripuacao1.setUmPilotoVez(coPiloto1);
		tripuacao1.setUmaAeromocaVez(aeromoca1);
		tripuacao1.setUmaAeromocaVez(aeromoca2);

		// novas poltronas
		poltrona1 = new Poltrona(001, false);
		poltrona2 = new Poltrona(002, true);
		poltrona3 = new Poltrona(003, false);
		poltrona4 = new Poltrona(004, true);
		poltrona5 = new Poltrona(005, false);
		poltrona6 = new Poltrona(006, true);
		poltrona7 = new Poltrona(007, true);
		poltrona8 = new Poltrona(010, false);
		poltrona9 = new Poltrona(011, true);
		poltrona10 = new Poltrona(012, false);

		// novos passageiros
		passageiro1 = new Passageiro("Sebastião", "1111", "Masculino", 1, poltrona4);
		passageiro2 = new Passageiro("Silas", "2222", "Masculino", 2, poltrona2);
		passageiro3 = new Passageiro("Bart", "3333", "Masculino", 3, poltrona6);
		passageiro4 = new Passageiro("Rick", "4444", "Masculino", 4, poltrona7);
		passageiro5 = new Passageiro("Gabriel", "5555", "Masculino", 5, poltrona9);

		// novo aviao usando set para adicionar poltonas e passageiros um por vez
		aviao1 = new Aviao();
		aviao1.setUmaPoltronaVez(poltrona1);
		aviao1.setUmaPoltronaVez(poltrona2);
		aviao1.setUmaPoltronaVez(poltrona3);
		aviao1.setUmaPoltronaVez(poltrona4);
		aviao1.setUmaPoltronaVez(poltrona5);
		aviao1.setUmaPoltronaVez(poltrona6);
		aviao1.setUmaPoltronaVez(poltrona7);
		aviao1.setUmaPoltronaVez(poltrona8);
		aviao1.setUmaPoltronaVez(poltrona9);
		aviao1.setUmaPoltronaVez(poltrona10);

		aviao1.setUmPassageiroVez(passageiro1);
		aviao1.setUmPassageiroVez(passageiro2);
		aviao1.setUmPassageiroVez(passageiro3);
		aviao1.setUmPassageiroVez(passageiro4);
		aviao1.setUmPassageiroVez(passageiro5);

		// novo voo
		
		Voo voo2 = new Voo(2, EnumStatusVoo.AT, tripuacao1, aviao1);

		// adicionando voo ao arrey de voos
		Voo[] voos = { voo1, voo2 };

		// criando um aeroporto e passando um array de voos
		Aeroporto aeroporto = new Aeroporto("Internacional", voos);

		System.out.println(aeroporto.toString());

	}

}