class Terror extends Filme {

    public Terror(String titulo, int ano, double valorDiaria) {
        super(titulo, ano, "Terror", valorDiaria);
    }

    @Override
    void metodoDaClasseFilha() {
        System.out.println("Método específico da classe Terror");
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorDiaria * dias;
    }
}
