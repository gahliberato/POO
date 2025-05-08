public class PrincipalFita {
    public static void main(String[] args) {
        FitaVideo f1 = new FitaVideo("O Senhor dos Anéis", 3.50);
        FitaVideo f2 = new FitaVideo("Harry Potter", 4.00);

        System.out.println(f1);
        System.out.printf("Valor por 3 dias: R$ %.2f\n", f1.getValorAluguel(3));

        System.out.println(f2);
        System.out.printf("Valor por 5 dias: R$ %.2f\n", f2.getValorAluguel(5));
    }
}

