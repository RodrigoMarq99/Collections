package ExerciciosCollections;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2_ArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		//Adicionar valores a lista
		num.add(9); num.add(8); num.add(7); num.add(6); num.add(5); num.add(4); num.add(3); num.add(2); num.add(1); num.add(0);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		Integer verificador = leia.nextInt();
		
		int posicao = num.indexOf(verificador);
		
		if(posicao >= 0 && posicao <= 10) {
			System.out.println("O número " + verificador + " está localizado na posição " + posicao);
		}else {
			System.out.println("O número " + verificador + " não foi encontrado!");
		}
		leia.close();
	}
}
