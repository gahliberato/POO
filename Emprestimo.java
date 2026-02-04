
import javax.xml.crypto.Data;

public class Emprestimo {
    private int id_e;
    private Data devolucao;

public Emprestimo(int id_e, Data devolucao){
    this.id_e = id_e;
    this.devolucao = devolucao;
}

    public int getId_e(){
        return id_e;
    }
    public void setId_e(int id_e){
        this.id_e = id_e;
    }

    public Data getDevolucao(){
        return devolucao;
    }
    public void setDevolucao(Data devolucao){
        this.devolucao = devolucao;
    }
}
