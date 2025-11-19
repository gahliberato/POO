public abstract class Pagamento {
    private String nomeCliente;
    private double valor;

    public Pagamento(String nomeCliente, double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    // Getter para o atributo 'nomeCliente'
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Getter para o atributo 'valor'
    public double getValor() {
        return this.valor;
    }

    // Setter para o atributo 'valor'
    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double processarPagamento();
}
