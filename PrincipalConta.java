public class PrincipalConta {
    public static void main(String[] args) {
        // 1. Criar três objetos da classe Conta
        Conta c1 = new Conta(101, "Alice");
        Conta c2 = new Conta(102, "Bruno");
        Conta c3 = new Conta(103, "Carla");

        // 2. Exibir o estado das contas
        System.out.println("Estado inicial das contas:");
        System.out.println(c1.exibir());
        System.out.println(c2.exibir());
        System.out.println(c3.exibir());

        // 3. Realizar um depósito em cada conta
        c1.depositar(500);
        c2.depositar(1000);
        c3.depositar(1500);

        // 4. Exibir o estado das contas
        System.out.println("\nApós depósitos:");
        System.out.println(c1.exibir());
        System.out.println(c2.exibir());
        System.out.println(c3.exibir());

        // 5. Alterar o nome do cliente em cada conta
        c1.setNomeCliente("Ana Paula");
        c2.setNomeCliente("Bruna Silva");
        c3.setNomeCliente("Carlos Eduardo");

        // 6. Realizar um saque em cada conta
        c1.sacar(100);
        c2.sacar(300);
        c3.sacar(500);

        // 7. Exibir o estado das contas
        System.out.println("\nApós alteração de nome e saques:");
        System.out.println(c1.exibir());
        System.out.println(c2.exibir());
        System.out.println(c3.exibir());

        // 8. Desativar duas contas
        c1.desativar();
        c2.desativar();

        // 9. Exibir o estado das contas
        System.out.println("\nApós desativar c1 e c2:");
        System.out.println(c1.exibir());
        System.out.println(c2.exibir());
        System.out.println(c3.exibir());
    }
}