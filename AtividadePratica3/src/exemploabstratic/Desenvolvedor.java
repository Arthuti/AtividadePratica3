package exemploabstratic;
public class Desenvolvedor extends Funcionario{
    private String tecnologias;

    public Desenvolvedor(){  
    }
    
    public Desenvolvedor(String nome, int matricula,String cargo, String tecnologias){
        super(nome, matricula, cargo);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }
    public void setTecnologias(String tecnologias){
        this.tecnologias = tecnologias;
    }

   

    @Override
    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor" +
                super.toString() +
                "\nTecnologias: " + tecnologias;
    }


}
