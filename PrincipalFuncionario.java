public class PrincipalFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario f = new Funcionario(1, "Ana", "123.456.789-00", "Rua A", "99999-0000", 30, 3000f);
        System.out.println("Dados iniciais:");
        f.mostrarEstado();

        System.out.print("Informe o novo salário: ");
        float novoSalario = scanner.nextFloat();
        f.setSalario(novoSalario);

        System.out.println("\nDados atualizados:");
        f.mostrarEstado();
    }
}
