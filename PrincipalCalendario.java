public class PrincipalCalendario {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(7, 5, 2024);
        Calendario c2 = new Calendario(25, 12, 2023);

        c1.mostrarData();
        c1.anoBissexto();

        c2.mostrarData();
        c2.anoBissexto();
    }
}

