public class FitaVideo {
    private String titulo;
    private double precoAluguelPorDia;

    public FitaVideo(String titulo, double precoAluguelPorDia) {
        this.titulo = titulo;
        this.precoAluguelPorDia = precoAluguelPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoAluguelPorDia() {
        return precoAluguelPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoAluguelPorDia * numeroDeDiasAlugada;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Preço por dia: R$ %.2f", titulo, precoAluguelPorDia);
    }
}
