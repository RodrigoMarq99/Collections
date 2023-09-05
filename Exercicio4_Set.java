package ExerciciosCollections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Exercicio4_Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> lista = new HashSet<Integer>();
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(6);
		lista.add(5);
		lista.add(8);
		lista.add(7);
		lista.add(9);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		Integer encontrar = leia.nextInt();
		
		Boolean trueOrFalse = lista.contains(encontrar);
		
		if(trueOrFalse == true) {
			System.out.println("O número " + encontrar + " foi encontrado!");
		}else {
			System.out.println("O número " + encontrar + " não foi encontrado!");
		}
		leia.close();
	}
}