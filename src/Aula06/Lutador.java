package Aula06;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, int peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.setCategoria();
	}
	public void setCategoria() {
		if (this.peso < 52) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 90) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalida";
		}
		}
		public String getCategoria() {
			return this.categoria;
	}
	public String apresentar() {
		return "Lutador: " + this.nome + "\n" +
			   "Origem: " + this.nacionalidade + "\n" +
			   "Idade: " + this.idade + " anos\n" +
			   "Altura: " + this.altura + " m\n" +
			   "Peso: " + this.peso + " kg\n" +
			   "Categoria: " + this.categoria + "\n" +
			   "Vitórias: " + this.vitorias + "\n" +
			   "Derrotas: " + this.derrotas + "\n" +
			   "Empates: " + this.empates;
	}
	public String status() {
		return this.nome + " é um peso " + this.categoria + " com " + this.vitorias + " vitórias, " +
			   this.derrotas + " derrotas e " + this.empates + " empates.";
	}
	public void ganharLuta() {
		this.vitorias++;
	}
	public void perderLuta() {
		this.derrotas++;
	}
	public void empatarLuta() {
		this.empates++;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
		return this.peso;
	}
	public float getPeso() {
		return this.peso;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}