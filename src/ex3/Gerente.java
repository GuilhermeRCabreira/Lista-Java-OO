public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}
