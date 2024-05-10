package exemploabstratic;
public class Gerente extends Funcionario {
    private double bonusAnual;
    private String equipe;

    public Gerente(){
    }

    public Gerente(String nome, int matricula, double bonusAnual, String equipe, String cargo){
        super(nome, matricula, cargo);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public double getBonusAnual(){
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual){
        this.bonusAnual = bonusAnual;
    }

    public String getEquipe(){
        return equipe;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    

    @Override
    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nGerente" +
                super.toString() +
                "\nBonusAnual: " + bonusAnual +
                "\nEquipe: '" + equipe;
    }


}
