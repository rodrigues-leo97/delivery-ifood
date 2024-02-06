package dominio;

import desafio_abs_delivery.enums.Bebidas;
import desafio_abs_delivery.enums.TakeOutEatIn;
import desafio_abs_delivery.enums.Tamanho;
import desafio_abs_delivery.enums.TipoDeCopo;

public class Bebida {
	
	private Boolean isGelo;
	private Bebidas sabor;
	private Tamanho tamanho;
	private TakeOutEatIn tampa;
	private TipoDeCopo tipoDeCopo;

	public Bebida(Boolean isGelo, Bebidas sabor, Tamanho tamanho, TakeOutEatIn tampa, TipoDeCopo tipoDeCopo) {
		super();
		this.isGelo = isGelo;
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.tampa = tampa;
		this.tipoDeCopo = tipoDeCopo;
	}

	public Bebida() {}

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

	public TakeOutEatIn getTampa() {
		return tampa;
	}

	public void setTampa(TakeOutEatIn tampa) {
		this.tampa = tampa;
	}
	

	public TipoDeCopo getTipoDeCopo() {
		return tipoDeCopo;
	}

	public void setTipoDeCopo(TipoDeCopo tipoDeCopo) {
		this.tipoDeCopo = tipoDeCopo;
	}

	@Override
	public String toString() {
		return "Bebida [isGelo=" + isGelo + ", sabor=" + sabor + ", tamanho=" + tamanho + ", tipo da tampa="
				+ tampa.getDescricao() + ", tipoDeCopo=" + tipoDeCopo + "]";
	}

}
