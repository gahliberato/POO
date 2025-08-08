public class Principal {
    public static void main(String[] args) {
        // Criando TV
        Televisor tv1 = new Televisor(5, 20);

        // Criando controle remoto para essa TV
        ControleRemoto controle = new ControleRemoto(tv1);

        // Usando controle remoto
        controle.ligar();
        controle.trocarCanal(12);
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();

        System.out.println(controle);

        controle.desligar();
        System.out.println(controle);
    }
}
