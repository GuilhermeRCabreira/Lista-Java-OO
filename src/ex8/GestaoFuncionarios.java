import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }


    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonus = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            double bonus = funcionario.calcularBonus();
            totalSalarios += salario;
            totalBonus += bonus;
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: R$ " + salario);
            System.out.println("Bônus: R$ " + bonus);
        }

        System.out.println("Total de Salários: R$ " + totalSalarios);
        System.out.println("Total de Bônus: R$ " + totalBonus);
    }


    public void promoverFuncionario(Funcionario funcionario, Funcionario novoCargo) {
        funcionarios.remove(funcionario);
        funcionarios.add(novoCargo);
        System.out.println("Funcionário " + funcionario.getNome() + " promovido para " + novoCargo.getClass().getSimpleName());
    }
}
