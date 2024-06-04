package resolucaoExercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
float n1,n2,n3,n4, diferenca; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número1: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o número2: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o número3: ");
		n3 = leia.nextFloat();
		System.out.println("\nDigite o número4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.printf("\nMédia final: %.1f",diferenca);
	}

}
