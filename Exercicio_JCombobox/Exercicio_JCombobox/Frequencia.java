package Exercicio_JCombobox;

public enum Frequencia {
	
	DUAS_VEZES("2x por semana", 0),
    TRES_VEZES("3x por semana", 0.20),
    CINCO_VEZES("5x por semana", 0.50);

    private String descricao;
    private double acrescimo;

    Frequencia(String descricao, double acrescimo) {
        this.descricao = descricao;
        this.acrescimo = acrescimo;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    @Override
    public String toString() {
        return descricao;
    }
	
	
	
//	DUAS_VEZES_SEMANA("2x por semana"), TRES_VEZES_SEMANA("3x por semana"), CINCO_VEZES_SEMANA("5x por semana");
//	String descricao;
//	
//	Frequencia(String descricao){
//		this.descricao = descricao;
//	}
//	
//	public String toString() {
//		return descricao;
//	}
}
