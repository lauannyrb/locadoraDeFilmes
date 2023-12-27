class Comedia extends Filme {

    public Comedia(String titulo, int ano, double valorDiaria) {
        super(titulo, ano, "Comédia", valorDiaria);
    }

    @Override
    void metodoDaClasseFilha() {
        System.out.println("Método específico da classe Comédia");
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorDiaria * dias;
    }
}
