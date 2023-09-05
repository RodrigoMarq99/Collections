package ExerciciosCollections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Exercicio3_Set_E_Iterator {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> listaSet = new HashSet<Integer>();
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.println("Digite " + (indice+1) + "° valor inteiro: (Obs: Não repita valores).");
			Integer num = leia.nextInt();
			listaSet.add(num);
		}
		
		System.out.println("Listar dados do Set: ");
		Iterator<Integer> iListaSet = listaSet.iterator();
		while(iListaSet.hasNext()) {
			System.out.print(iListaSet.next() + " ");
		}
		leia.close();
	}
}