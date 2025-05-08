import java.util.Scanner;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    // Getters e Setters
    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    public float calculaSalarioLiquido() {
        return salario * 0.89f; // desconto de 11%
    }

    public void mostrarEstado() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário bruto: R$ %.2f\n", salario);
        System.out.printf("Salário líquido: R$ %.2f\n", calculaSalarioLiquido());
    }
}
