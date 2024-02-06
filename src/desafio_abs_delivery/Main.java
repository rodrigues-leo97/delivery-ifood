package desafio_abs_delivery;

import java.util.Scanner;

import desafio_abs_delivery.enums.Bebidas;
import desafio_abs_delivery.enums.TakeOutEatIn;
import desafio_abs_delivery.enums.Tamanho;
import desafio_abs_delivery.enums.TipoDeCopo;
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
				default -> {
					System.out.println("Opção inválida, comece novamente");
					System.exit(0);
				}
			}
			
			System.out.println("Deseja gelo em sua bebida?");
			System.out.println("S - Sim");
			System.out.println("N - Não");
			char isGelo = sc.next().charAt(0);
			
			if(Character.toUpperCase(isGelo) == 'S') bebida.setIsGelo(true);
			else if (Character.toUpperCase(isGelo) == 'N') bebida.setIsGelo(false);
			else bebida.setIsGelo(true);
			
			System.out.println("Qual tamanho vc deseja?");
			char tamanhoBebida;
			
			if(opcaoBebida == 1 || opcaoBebida == 2) {
				System.out.println("P -> " + Tamanho.PEQUENO.getTamanho());
				System.out.println("M -> " + Tamanho.MEDIO.getTamanho());
				System.out.println("G -> " + Tamanho.GRANDE.getTamanho());
				bebida.setTipoDeCopo(TipoDeCopo.PAPEL);
				
			} else {
				System.out.println("P -> " + Tamanho.PEQUENO.getTamanho());
				System.out.println("M -> " + Tamanho.MEDIO.getTamanho());
				bebida.setTipoDeCopo(TipoDeCopo.PLASTICO);
			}
			
			tamanhoBebida = sc.next().charAt(0);
			switch(Character.toUpperCase(tamanhoBebida)) {
				case 'P' -> bebida.setTamanho(Tamanho.PEQUENO);
				case 'M' -> bebida.setTamanho(Tamanho.MEDIO);
				case 'G' -> bebida.setTamanho(Tamanho.GRANDE);
			}
			
			System.out.println("Deseja que o pedido seja embalado para viagem?");
			System.out.println("S - SIM");
			System.out.println("N - NAO");
			char isViagem = sc.next().charAt(0);
			switch(Character.toUpperCase(isViagem)) {
				case 'S' -> bebida.setTampa(TakeOutEatIn.TAKE_OUT);
				case 'N' -> bebida.setTampa(TakeOutEatIn.EAT_IN);
			}
			
			System.out.println(bebida);

	}

}
