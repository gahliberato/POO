public abstract class Cliente{
    private String nome;
    private double valorDaCompra;
    
    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public double getValorDaCompra(){
        return this.valorDaCompra;
    }
    public abstract double calcularPagamento();
    }
