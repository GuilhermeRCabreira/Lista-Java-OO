public class Funcionario {

    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }


    public double calcularBonus() {
        return 0;
    }
}
