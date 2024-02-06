package dominio;

import desafio_abs_delivery.enums.Bebidas;
import desafio_abs_delivery.enums.TakeOutEatIn;
import desafio_abs_delivery.enums.Tamanho;

public class Bebida {
	
	private String tipo;
	private Boolean isGelo;
	private Bebidas sabor;
	private Tamanho tamanho;
	private TakeOutEatIn takeOutEatIn;

	public Bebida(String tipo, Boolean isGelo, Bebidas sabor, Tamanho tamanho, TakeOutEatIn takeOutEatIn) {
		super();
		this.tipo = tipo;
		this.isGelo = isGelo;
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.takeOutEatIn = takeOutEatIn;
	}

	public Bebida() {}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bebidas getSabor() {
		return sabor;
	}

	public void setSabor(Bebidas sabor) {
		this.sabor = sabor;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public Boolean getIsGelo() {
		return isGelo;
	}

	public void setIsGelo(Boolean isGelo) {
		this.isGelo = isGelo;
	}

	public TakeOutEatIn getTakeOutEatIn() {
		return takeOutEatIn;
	}

	public void setTakeOutEatIn(TakeOutEatIn takeOutEatIn) {
		this.takeOutEatIn = takeOutEatIn;
	}

}
