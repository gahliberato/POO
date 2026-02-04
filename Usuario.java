public class Usuario{
    private int matricula, q_Emprestimo;
    private String nome_U;
    
    public Usuario(int matricula, int q_Emprestimo, String nome_U){
        this.matricula = matricula;
        this.q_Emprestimo = 0;
        this.nome_U = nome_U;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getQ_emprestimo(){
        return q_Emprestimo;
    }
    public void setQ_emprestimo(int q_Emprestimo){
        this.q_Emprestimo = q_Emprestimo;
    }

    public String getNome_u(){
        return nome_U;
    }
    public void setNome_u(String nome_U){
        this.nome_U = nome_U;
    }
}