public class PrincipalPagamento {
    public static void main(String[] args) {
        CadastroPagamento pagamentos = new CadastroPagamento();
        Pagamento[] pagamento = new Pagamento[10];
        pagamento[0] = new CartaoDeCredito("Gah Vinsmoke", 5000, 2);
        pagamentos.adicionar(pagamento[0]);
        pagamento[1] = new PIX("Normy Roronoa", 500, "123111111");
        pagamentos.adicionar(pagamento[1]);
        pagamento[2] = new Boleto("Isabelly Chávez", 3000, 2000000038);
        pagamentos.adicionar(pagamento[2]);
        pagamento[3] = new Boleto("Kamyla Bracho", 3000, 2000938);
        pagamentos.adicionar(pagamento[3]);
        pagamento[4] = new Boleto("Rhylary Swift", 3000, 2000938);
        pagamentos.adicionar(pagamento[4]);

        pagamentos.imprimirPagamentos();
        pagamentos.calcularTotal();
    }
}
