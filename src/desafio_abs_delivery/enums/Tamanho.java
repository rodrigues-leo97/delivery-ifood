package desafio_abs_delivery.enums;

public enum Tamanho {
	PEQUENO("350"), 
	MEDIO("500"), 
	GRANDE("700");
	
	private String tamanho;
	
	Tamanho(String tamanho) {
	  this.tamanho = tamanho;
	}
	
    public String getTamanho() {
        return tamanho;
    }
}
