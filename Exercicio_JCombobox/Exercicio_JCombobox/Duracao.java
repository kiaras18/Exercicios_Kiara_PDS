package Exercicio_JCombobox;

public enum Duracao {
	
	 MENSAL("Mensal", 0), SEMESTRAL("Semestral", 0.10), ANUAL("Anual", 0.20);

	    private String descricao;
	    private double desconto;

	    Duracao(String descricao, double desconto) {
	        this.descricao = descricao;
	        this.desconto = desconto;
	    }

	    public double getDesconto() {
	        return desconto;
	    }

	 
	    public String toString() {
	        return descricao;
	    }
	    
//	MENSAL("Mensal"), SEMESTRAL("Semestral"), ANUAL("Anual");
//	
//	String descricao;
//	
//	Duracao(String descricao){
//		this.descricao = descricao;
//	}
}
