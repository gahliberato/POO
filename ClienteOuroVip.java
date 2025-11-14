public class ClienteOuroVip extends ClienteVip {
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, double numeroCartao, String endereco) {
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

    public String getNome() {
        return super.getNome();
    }

    public double calcularPagamento() {
        return this.getValorDaCompra() * 85 / 100;
    }
}
