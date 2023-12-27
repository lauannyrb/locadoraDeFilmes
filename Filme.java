interface AluguelCalculavel {
    double calcularValorAluguel(int dias);
}

abstract class Filme implements AluguelCalculavel {
    protected String titulo;
    protected int ano;
    protected String tipo;
    protected double valorDiaria;

    public Filme(String titulo, int ano, String tipo, double valorDiaria) {
        this.titulo = titulo;
        this.ano = ano;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Ano: " + ano + ", Tipo: " + tipo + ", Valor diária: R$" + valorDiaria;
    }

    abstract void metodoDaClasseFilha();
}