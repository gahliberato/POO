public class ClienteVip extends Cliente {
    private double numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, double numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    public String getNome() {
        return super.getNome();
    }

    public double calcularPagamento() {
        return this.getValorDaCompra() * 90 / 100;
    }
}