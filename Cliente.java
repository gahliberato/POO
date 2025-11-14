public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    // Getter para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    // Getter para o atributo 'valorDaCompra'
    public double getValorDaCompra() {
        return this.valorDaCompra;
    }

    // Setter para o atributo 'valorDaCompra'
    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public abstract double calcularPagamento();
}
