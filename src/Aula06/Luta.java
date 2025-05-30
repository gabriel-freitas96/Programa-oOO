package Aula06;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			this.rounds = 3; // Default rounds
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if (this.aprovada) {
			System.out.println("Lutador desafiado: " + this.desafiado.getNome());
			System.out.println("Lutador desafiante: " + this.desafiante.getNome());
			System.out.println("Rounds: " + this.rounds);
			int resultado = (int) (Math.random() * 3);
			switch (resultado) {
				case 0:
					System.out.println("Empate!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println(this.desafiado.getNome() + " venceu!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println(this.desafiante.getNome() + " venceu!");
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		} else {
			System.out.println("Luta não aprovada.");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public String toString() {
		return "Luta{" +
				"desafiado=" + (desafiado != null ? desafiado.getNome() : "N/A")+
				", desafiante=" + desafiante.getNome() +
				", rounds=" + rounds +
				", aprovada=" + aprovada +
				'}';
	}
}
