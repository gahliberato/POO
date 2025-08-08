public class Conta {
    private boolean estaAtiva;
    private int numConta;
    private String nomeCliente;
    private int saldo;

    // construtor = inicializar os atributos
    public Conta(int numConta, String nomeCliente) {
    this.numConta = numConta;
    this.nomeCliente = nomeCliente;
    this.saldo = 0;
    this.estaAtiva = true;
}

    //setters e getters

    public boolean isEstaAtiva() {
        return estaAtiva;
    }

    public void setEstaAtiva(boolean estaAtiva) {
        this.estaAtiva = estaAtiva;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    // métodos = ações do objeto

    public void depositar(int valor) {
        if (valor > 0 && estaAtiva) {
            saldo += valor;
        }
    }

    public void sacar(int valor) {
        if (valor <= saldo && estaAtiva) {
            saldo -= valor;
        }
    }

    public void desativar() {
        if (estaAtiva) {
            estaAtiva = false;
        }
    }

    public void ativar() {
        if (!estaAtiva) {
            estaAtiva = true;
        }
    }

    public String exibir() {
        return "Conta{" +
                "estaAtiva=" + estaAtiva +
                ", numConta=" + numConta +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
