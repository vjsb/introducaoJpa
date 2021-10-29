package program;

import domain.Pessoa;

public class App {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carla de Andrade", "carlaandrade@gmail.com");
		Pessoa p2 = new Pessoa(2, "Vitor Macedo", "vitormacedo@gmail.com");
		Pessoa p3 = new Pessoa(3, "Joao Victor", "joaovictor@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		

	}

}
