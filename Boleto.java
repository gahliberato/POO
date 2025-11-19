public class Boleto extends Pagamento {
    private double linhaDigitavel;

    public Boleto(String nomeCliente, double valor, double linhaDigitavel) {
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }

    public double processarPagamento() {
        return this.getValor() * 1.015;
    }

}