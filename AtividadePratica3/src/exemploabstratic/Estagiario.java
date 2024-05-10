package exemploabstratic;
public class Estagiario extends Funcionario {
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(){
    }

    public Estagiario(String nome, int matricula, String cargo , int horasTrabalhadas, String supervisor ) {
        super(nome, matricula, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    }

    

    

    @Override
    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Estagiario" +
                super.toString() +
                "\nHorasTrabalhadas: " + horasTrabalhadas +
                "\nSupervisor: " + supervisor;
    }
}

