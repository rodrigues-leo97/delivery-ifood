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
		
		mensagemBoasVindas();
		
		Boolean continuarEscolhendo = false;
		Bebida bebida = new Bebida();
		
			apresentarBebidas();
			
			int opcaoBebida = sc.nextInt();
			while(opcaoBebida < 1 || opcaoBebida > 4) {
				System.out.println("Opção inválida, digite novamente");
				opcaoBebida = sc.nextInt();
			}
			bebida.setSabor(selecionarBebida(opcaoBebida));
			
			perguntarSobreGeloNaBebida();
			char isGelo = sc.next().charAt(0);
			while(Character.toUpperCase(isGelo) != 'S' && Character.toUpperCase(isGelo) != 'N') {
				System.out.println("Opção inválida, digite novamente");
				isGelo = sc.next().charAt(0);
			}
			
			if(Character.toUpperCase(isGelo) == 'S') bebida.setIsGelo(true);
			else if (Character.toUpperCase(isGelo) == 'N') bebida.setIsGelo(false);
			else bebida.setIsGelo(true);
			
			bebida.setQuantidadeGelo(0);
			
			System.out.println("Qual tamanho vc deseja?");
			if(opcaoBebida == 1 || opcaoBebida == 2) {
				exibirOpcoesTamanhoRefrigerante();
				bebida.setTipoDeCopo(TipoDeCopo.PAPEL);
				if(bebida.getIsGelo()) {
					bebida.setQuantidadeGelo(6);
				}
				
			} else {
				exibirOpcoesTamanhoSuco();
				bebida.setTipoDeCopo(TipoDeCopo.PLASTICO);
				if(bebida.getIsGelo()) {
					bebida.setQuantidadeGelo(12);
				}
			}
			
			char tamanhoBebida = sc.next().charAt(0);
			while(Character.toUpperCase(tamanhoBebida) != 'P' && Character.toUpperCase(tamanhoBebida) != 'M' && Character.toUpperCase(tamanhoBebida) != 'G') {
				System.out.println("Opção inválida, digite novamente");
				tamanhoBebida = sc.next().charAt(0);
			}
			bebida.setTamanho(selecionarTamanhoBebida(tamanhoBebida));
			
			perguntarPedidoParaViagem();
			char isViagem = sc.next().charAt(0);
			switch(Character.toUpperCase(isViagem)) {
				case 'S' -> bebida.setTampa(TakeOutEatIn.TAKE_OUT);
				case 'N' -> bebida.setTampa(TakeOutEatIn.EAT_IN);
			}
			
			System.out.println(bebida);

	}

	private static void perguntarPedidoParaViagem() {
		System.out.println("Deseja que o pedido seja embalado para viagem?");
		System.out.println("S - SIM");
		System.out.println("N - NAO");
	}

	private static void exibirOpcoesTamanhoSuco() {
		System.out.println("P -> " + Tamanho.PEQUENO.getTamanho() + "ml");
		System.out.println("M -> " + Tamanho.MEDIO.getTamanho() + "ml");
	}

	private static void exibirOpcoesTamanhoRefrigerante() {
		exibirOpcoesTamanhoSuco();
		System.out.println("G -> " + Tamanho.GRANDE.getTamanho() + "ml");
	}

	private static void perguntarSobreGeloNaBebida() {
		System.out.println("Deseja gelo em sua bebida?");
		System.out.println("S - Sim");
		System.out.println("N - Não");
	}

	private static void mensagemBoasVindas() {
		System.out.println("Seja bem vindo ao sistema ABS");
		System.out.println("O sistema nº 1 em bebidas do Brasil");
	}

	private static void apresentarBebidas() {
		System.out.println("Qual o número da bebida que deseja escolher?");
		System.out.println("1 - Refrigerante Coca");
		System.out.println("2 - Refrigerante Guaraná");
		System.out.println("3 - Suco de Uva");
		System.out.println("4 - Suco de Laranja");
	}

	private static Tamanho selecionarTamanhoBebida(char tamanhoBebida) {
		switch(Character.toUpperCase(tamanhoBebida)) {
			case 'P' -> {return Tamanho.PEQUENO;}
			case 'M' -> {return Tamanho.MEDIO;}
			case 'G' -> {return Tamanho.GRANDE;}
		}
		return null;
	}

	private static Bebidas selecionarBebida(int opcaoBebida) {
		switch(opcaoBebida) {
			case 1 -> { return Bebidas.COCA; }
			case 2 -> { return Bebidas.GUARANA; }
			case 3 -> { return Bebidas.UVA; }
			case 4 -> { return Bebidas.LARANJA; }
			default -> {
				return null;
			}
		}
	}

}
