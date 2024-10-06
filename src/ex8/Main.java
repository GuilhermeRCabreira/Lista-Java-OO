public class Main {
    public static void main(String[] args) {
        GestaoFuncionarios gestao = new GestaoFuncionarios();


        Funcionario gerente = new Gerente("Alice", 5000.00);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000.00);
        Funcionario estagiario = new Estagiario("Carlos", 2000.00);


        gestao.adicionarFuncionario(gerente);
        gestao.adicionarFuncionario(desenvolvedor);
        gestao.adicionarFuncionario(estagiario);


        gestao.calcularFolhaPagamento();


        gestao.promoverFuncionario(estagiario, new Desenvolvedor("Carlos", 3000.00));


        gestao.calcularFolhaPagamento();
    }
}
