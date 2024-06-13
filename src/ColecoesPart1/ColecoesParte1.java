package ColecoesPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String nome1 = "";
		String nome2 = "";
		String nome3 = "";
		String verifica = "";
		

		for (int i=1; i<=3; i++) {
			
			System.out.println("Digite o "+i+"° Nome");
			verifica = s.next();
			
			
			switch (i) {
			case 1: nome1 = verifica;
			break;
			case 2: nome2 = verifica;
			break;
			default: nome3 = verifica;
				}
		}
		
		System.out.println("*** A lista de nomes será ***");
		List<String> nomes = new ArrayList<>();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		System.out.println(nomes);
	}

}
