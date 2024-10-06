public class Desenvolvedor extends Funcionario {


    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void trabalhar() {
        System.out.println(nome + " está desenvolvendo código.");
    }


    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}
