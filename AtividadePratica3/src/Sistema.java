import exemplointerface.Trabalhavel;
import exemploabstratic.Funcionario;
import exemploabstratic.Desenvolvedor;
import exemploabstratic.Gerente;
import exemploabstratic.Estagiario;


public class Sistema {


    private static void exibirMenu() {
        System.out.println("\nSISTEMA DE CADASTRO DE FUNCIONÁRIOS");
        System.out.println("1) Cadastrar Funcionário");
        System.out.println("2) Buscar Funcionário");
        System.out.println("3) Excluir Funcionário");
        System.out.println("4) Listar Todos os Funcionários");
        System.out.println("5) Excluir Todos os Funcionários");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void cadastrarFuncionario() {
        System.out.println("\nCadastro de Funcionário:");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        System.out.print("Cargo (estagiário, desenvolvedor, gerente): ");
        String cargo = Console.lerString();

        Funcionario f = new Funcionario(nome, matricula, cargo); {
        
        CadastroFuncionarios.cadastrarFuncionario(f);
        System.out.println("\nFuncionário cadastrado com sucesso!");
    }

    private static void buscarFuncionario() {
        System.out.println("\nBuscar Funcionário:");
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        Funcionario f = CadastroFuncionarios.buscarFuncionario(matricula);
        if (f != null) {
            System.out.println("\nFuncionário encontrado:");
            System.out.println(f);
        } else {
            System.out.println("\nFuncionário não encontrado.");
        }
    }

    private static void excluirFuncionario() {
        System.out.println("\nExcluir Funcionário:");
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        CadastroFuncionarios.excluirFuncionario(matricula);
        System.out.println("Funcionário removido com sucesso.");
    }

    private static void listarTodosFuncionarios() {
        System.out.println("\nListar Todos os Funcionários:");
        CadastroFuncionarios.listarTodosFuncionarios();
    }

    private static void excluirTodosFuncionarios() {
        System.out.println("\nExcluir Todos os Funcionários:");
        CadastroFuncionarios.excluirTodosFuncionarios();
        System.out.println("Todos os funcionários foram excluídos.");
    }

    private static void verificarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                buscarFuncionario();
                break;
            case 3:
                excluirFuncionario();
                break;
            case 4:
                listarTodosFuncionarios();
                break;
            case 5:
                excluirTodosFuncionarios();
                break;
            case 0:
                System.out.println("\nO programa foi finalizado.");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }

   
}
