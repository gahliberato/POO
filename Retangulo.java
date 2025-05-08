public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * comprimento + 2 * largura;
    }

    public void imprimir() {
        System.out.printf("Comprimento: %.2f, Largura: %.2f, Área: %.2f, Perímetro: %.2f\n",
                comprimento, largura, calcularArea(), calcularPerimetro());
    }
}