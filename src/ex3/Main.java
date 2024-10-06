public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Alice", 10000.00);
        gerente.exibirInfo();
        System.out.println();

        // Criar um objeto Desenvolvedor
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 5000.00);
        desenvolvedor.exibirInfo();
    }
}
