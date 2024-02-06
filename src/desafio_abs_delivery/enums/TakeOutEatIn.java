package desafio_abs_delivery.enums;

public enum TakeOutEatIn {
	TAKE_OUT("Tampa sem furo"),
	EAT_IN("Tampa com furo para o canudo");
	
	private String descricao;

	private TakeOutEatIn(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
