import exemploabstratic.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static Funcionario buscarFuncionario(int matricula) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }
        return null;
    }

    public static void excluirFuncionario(int matricula) {
        funcionarios.removeIf(funcionario -> funcionario.getMatricula() == matricula);
    }

    public static void listarTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public static void excluirTodosFuncionarios() {
        funcionarios.clear();
    }
}
