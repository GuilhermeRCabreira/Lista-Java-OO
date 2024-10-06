public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 2500.00, 10);


        produto1.exibirInfo();


        produto1.setPreco(-1500.00);


        produto1.setQuantidadeEmEstoque(-5);


        produto1.setPreco(2300.00);
        produto1.setQuantidadeEmEstoque(8);


        produto1.exibirInfo();
    }
}
