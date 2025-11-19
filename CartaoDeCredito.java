public class CartaoDeCredito extends Pagamento {
    private double quantidadeParcelas;

    public CartaoDeCredito(String nomeCliente, double valor, double quantidadeParcelas) {
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double processarPagamento() {
        return this.getValor() + (this.getValor() * this.quantidadeParcelas / 100);
    }
}
