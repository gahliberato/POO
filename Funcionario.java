public class Funcionario {
    private String nome_f;
    private int CPF;
    private String funcao;

public Funcionario(String nome_f, int CPF, String funcao){
    this.nome_f = nome_f;
    this.CPF = CPF;
    this.funcao = funcao;
}


    public String getNome_f(){
        return nome_f;
    }
    public void setNome_f(String nome_f){
        this.nome_f = nome_f;
    }

    public int getCPF(){
        return CPF;
    }
    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    
    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
}
