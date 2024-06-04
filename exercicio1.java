package resolucaoExercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valores = 0,salarioInicial,abono,salarioFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário: ");
		salarioInicial = leia.nextFloat();
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		salarioFinal = salarioInicial + abono; 
		
		
		System.out.printf("\nNovo Salário: %.2f",salarioFinal);
		
		
	}

}
