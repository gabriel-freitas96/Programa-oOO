package Aula06;

public class Lutador1 {
	private String nome;
	private int peso;
	private String categoria;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
		if (peso < 52) {
			this.categoria = "Invalido";
		} else if (peso <= 70.3) {
			this.categoria = "Leve";
		} else if (peso <= 90) {
			this.categoria = "Médio";
		} else if (peso <= 120) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
		}
	}

