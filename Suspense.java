class Suspense extends Filme {

    public Suspense(String titulo, int ano, double valorDiaria) {
        super(titulo, ano, "Suspense", valorDiaria);
    }

    @Override
    void metodoDaClasseFilha() {
        System.out.println("Método específico da classe Suspense");
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorDiaria * dias;
    }
}
