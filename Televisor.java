public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    // Construtor
    public Televisor(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = false; // TV começa desligada
    }

    public void ligar() {
        ligado = true;
        System.out.println("Televisor ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Televisor desligado.");
    }

    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado && novoCanal > 0) {
            canal = novoCanal;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "canal=" + canal +
                ", volume=" + volume +
                ", ligado=" + ligado +
                '}';
    }
}

