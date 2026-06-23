package Exercicio_JCombobox;

public enum PlanoAcademia {
	
	BASICO ("Básico", 80.0),
    INTERMEDIARIO("Intermediário", 120.0),
    PREMIUM("Premium", 180.0);

    private String descricao;
    private double valor;

    PlanoAcademia (String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

   
    public String toString() {
        return descricao;
    }
}
	

