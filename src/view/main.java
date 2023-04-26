package view;

import java.util.Scanner;

import controller.fat;

public class main {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		fat controller= new fat();
	int n;
	System.out.println("Digite um núemro: ");
	n=leia.nextInt();
	if(n>12) {
		System.out.println("Numero acima do limite");
	}else {
	 int resultado = fat.fatorial(n);
	 System.out.println(resultado);
}
}
}
