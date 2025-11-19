public class CadastroPagamento {
    // Criando um array de Pessoa
    private Pagamento[] pagamentos = new Pagamento[10];
    // Defino a posição inicial do array
    private int posicao = 0;

    // Método para adicionar pessoas no array
    public void adicionar(Pagamento pagamento) {
        // Verifico se ainda há espaço no array
        if (posicao < this.pagamentos.length) {
            // Usa o valor atual de 'posicao' como índice e armazena 'cliente' no array
            this.pagamentos[posicao] = pagamento;
        } else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais pagamentos.");
        }
        // Incremento a posição para apontar para o próximo índice disponível, isso
        // garante que a próxima pessoa será adicionada na próxima posição do array
        posicao++;
    }

    public void imprimirPagamentos() {
        // A contagem (i) inicia em 0. Em programação, arrays começam a ser contados a
        // partir do índice 0.Verifica a Condição: O loop verifica se i é menor que
        // posicao (ou qtde). Em seguido, incrementa i em 1 a cada iteração (i++).
        // Basicamente, isso significa que o loop excutando o código a seguir continuará
        // enquanto i for menor que o número de pessoas atualmente armazenadas no array.
        for (int i = 0; i < posicao; i++) {
            // Chama o método cumprimentar() para cada objeto Pessoa armazenado no array
            // pessoas. Aqui, o polimorfismo entra em ação: mesmo que o array seja do tipo
            // Pessoa, nenhum método tem o mesmo cumprimento, como no mundo real.
            System.out.println(pagamentos[i].processarPagamento());
        }
    }

    public void calcularTotal() {
        // total inicializa com 0
        double total = 0;
        for (int i = 0; i < posicao; i++) {

            // adiciona o valor calculado do pagamento de cada cliente ao total
            total += pagamentos[i].processarPagamento();
        }
        // a variável total agora contém a soma dos pagamentos e eu chamo ela no sistema
        System.out.println("Valor total de pagamentos efetuados: " + total);
    }
}
