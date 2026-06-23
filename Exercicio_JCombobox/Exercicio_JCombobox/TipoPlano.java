package Exercicio_JCombobox;

public enum TipoPlano {

    BASICO("Básico", 80.0),
    INTERMEDIARIO("Intermediário", 120.0),
    PREMIUM("Premium", 180.0);

    private String descricao;
    private double valor;

    TipoPlano(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao;
    }
}