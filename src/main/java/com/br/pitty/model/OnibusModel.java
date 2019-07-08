package com.br.pitty.model;

import java.util.List;

public class OnibusModel {
	private String empresa;
	private String destino;
	private double tempoDeViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private List<String> pessoas;

	public OnibusModel() {

	}

	public OnibusModel(String empresa, String destino, double tempoDeViagem, int lugares, int lugaresDisponiveis) {
		this.empresa = empresa;
		this.destino = destino;
		this.tempoDeViagem = tempoDeViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getTempoDeViagem() {
		return tempoDeViagem;
	}

	public void setTempoDeViagem(double tempoDeViagem) {
		this.tempoDeViagem = tempoDeViagem;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int isLugaresDisponiveis() {
		return lugaresDisponiveis;
	}

	public void setLugaresDisponiveis(int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public List<String> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<String> pessoas) {
		this.pessoas = pessoas;
	}

	public String getEmpresa() {
		return empresa;
	}


	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Empresa: " +this.empresa);
		modelo.append("\n");
		modelo.append("Destino: "+ this.destino);
		modelo.append(" tempo de viagem: " +this.tempoDeViagem);
		modelo.append("\n");
		modelo.append("tempo de viagem: "+ this.lugares);
		return super.toString();



	}

}
