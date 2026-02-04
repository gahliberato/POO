public class Livro {
    private int id_l;
    private int q_estoque;
    private String titulo;
    private String genero;
    private boolean reserva, disponiblidade;

    public Livro(int id_l, int q_estoque, String titulo, String genero, boolean reserva, boolean disponiblidade){
        this.id_l = id_l;
        this.q_estoque = q_estoque;
        this.titulo = titulo;
        this.genero = genero;
        this.reserva = false;
        this.disponiblidade = true;
    }
    public int getId_l(){
        return id_l;
    }
    public void setId_l(int id_l){
        this.id_l = id_l;
    }

    public int getQ_estoque(){
        return q_estoque;
    }
    public void setQ_estoque(int q_estoque){
        this.q_estoque = q_estoque;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean getReserva(){
        return reserva;
    }
    public void setGenero(boolean reserva){
        this.reserva = reserva;
    }

    public boolean getDisponibilidade(){
        return disponiblidade;
    }
    public void setDisponibilidade(boolean disponiblidade){
        this.disponiblidade = disponiblidade;
    }
}