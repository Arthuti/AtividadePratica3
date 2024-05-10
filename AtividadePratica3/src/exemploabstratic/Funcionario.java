package exemploabstratic;

import exemplointerface.Trabalhavel;

public abstract class Funcionario implements Trabalhavel {

    private String nome;
    private int matricula;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(String nome, int matricula, String cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }
  
    public void setNome(String nome ) {
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }


    public void setMatricula(int matricula ) {
        this.matricula = matricula;
    }

    public String getCargo(){
        return cargo;
    }
  
    public void setCargo(String cargo ) {
        this.cargo = cargo;
    }


    @Override
    public void trabalhar() {
        System.out.println("O funcionário " + nome + " está trabalhando.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O funcionário " + nome + " está relatando o progresso.");
    }

    @Override
    public String toString() {
        
        return  "\nNome: " + nome +
                "\nMatricula: " + matricula + 
                "\nCargo: " + cargo;
    }

    public abstract double calcularSalario();

    
}
