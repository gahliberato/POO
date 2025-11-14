public class Principal {
    public static void main(String[] args) {
        Mercadinho mercadinho = new Mercadinho();
        Cliente[] clientes = new Cliente[10];
        clientes[0] = new ClienteOuroVip("Gah Vinsmoke", 5000, 2000938, "Rua 1");
        mercadinho.adicionarCliente(clientes[0]);
        clientes[1] = new ClienteRegular("Normy Roronoa", 500);
        mercadinho.adicionarCliente(clientes[1]);
        clientes[2] = new ClienteVip("Isabelly Chávez", 3000, 2000938);
        mercadinho.adicionarCliente(clientes[2]);
        clientes[3] = new ClienteVip("Kamyla Bracho", 3000, 2000938);
        mercadinho.adicionarCliente(clientes[3]);
        clientes[4] = new ClienteVip("Rhylary Swift", 3000, 2000938);
        mercadinho.adicionarCliente(clientes[4]);

        mercadinho.imprimirClientes();
        mercadinho.calcularTotal();
    }
}
