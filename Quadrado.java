// Classe
public class Quadrado {

    // Atributo
    private double lado;

    // Construtor
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

    // Método
    public void imprimir(){
        System.out.printf("Lado: %.2f, Área: %.2f, Perímetro: %.2f\n", 
                          lado, calcularArea(), calcularPerimetro());
    }
}
