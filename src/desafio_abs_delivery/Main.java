package desafio_abs_delivery;

import java.util.Scanner;

import desafio_abs_delivery.enums.Bebidas;
import dominio.Bebida;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao sistema ABS");
		System.out.println("O sistema nº 1 em bebidas do Brasil");
		
		Boolean continuarEscolhendo = false;
		Bebida bebida = new Bebida();
		
			System.out.println("Qual o número da bebida que deseja escolher?");
			System.out.println("1 - Refrigerante Coca");
			System.out.println("2 - Refrigerante Guaraná");
			System.out.println("3 - Suco de Uva");
			System.out.println("4 - Suco de Laranja");
			
			int opcaoBebida = sc.nextInt();
			switch(opcaoBebida) {
			case 1 -> bebida.setSabor(Bebidas.COCA);
			case 2 -> bebida.setSabor(Bebidas.GUARANA);
			case 3 -> bebida.setSabor(Bebidas.UVA);
			case 4 -> bebida.setSabor(Bebidas.LARANJA);
			}
			
			// System.out.println(bebida);
			
			System.out.println("Deseja gelo em sua bebida?");
			System.out.println("S - Sim");
			System.out.println("N - Não");
			char isGelo = sc.next().charAt(0);
			
			if(Character.toUpperCase(isGelo) == 'S') bebida.setIsGelo(true);
			else if (Character.toUpperCase(isGelo) == 'N') bebida.setIsGelo(false);
			else bebida.setIsGelo(true);


	}

}
