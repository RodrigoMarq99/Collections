package ExerciciosCollections;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1_ArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.println("Digite a " + (contador+1) + "° cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("Listar todas as cores: ");
		System.out.println(cores);
		
		cores.sort(null);
		System.out.println("Ordenar as cores: ");
		System.out.println(cores);
		
		leia.close();
	}
}