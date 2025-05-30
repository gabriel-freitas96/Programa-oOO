package Aula06;

public class Main {

	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Pelé", "Brasil", 30, 1.75f, 70, 10, 2, 1);
		Lutador lutador2 = new Lutador("Maradona", "EUA", 28, 1.80f, 80, 15, 3, 0);
		Lutador lutador3 = new Lutador("Marcola", "Alemanha", 34, 1.65f, 100, 2, 3, 1);
		Lutador lutador4 = new Lutador("Macin", "Holanda", 42, 1.48f, 70, 90, 2, 1);
		
		System.out.println("===================RESULTADO DA PESQUISA!===============================");
		System.out.println(lutador1.apresentar());
		System.out.println("=======================================================================");
		System.out.println(lutador2.apresentar());
		System.out.println("=======================================================================");
		System.out.println(lutador3.apresentar());
		System.out.println("=======================================================================");
		System.out.println(lutador4.apresentar());
		System.out.println("=======================================================================");
		
		lutador1.ganharLuta();
		lutador2.perderLuta();
		lutador3.empatarLuta();
		lutador4.ganharLuta();
		
		System.out.println(lutador1.status());
		System.out.println("=======================================================================");
		System.out.println(lutador2.status());
		System.out.println("=======================================================================");
		System.out.println(lutador3.status());
		System.out.println("=======================================================================");
		System.out.println(lutador4.status());
		
	}

}
