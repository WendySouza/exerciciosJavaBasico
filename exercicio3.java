package resolucaoExercicios;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
float valores = 0,salarioBruto,adicional,horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o Adicional Norturno: ");
		adicional = leia.nextFloat();
		System.out.println("\nDigite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite o desconto: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicional + (horasExtras*5) - descontos;
		
		System.out.printf("\nSalário Líquido: %.2f",salarioLiquido);	
	}

}
