public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Smartphone", 3000.00, 15);


        produto1.exibirInfo();

        try {

            produto1.aplicarDesconto(20);


            produto1.aplicarDesconto(60);
        } catch (DescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }


        produto1.exibirInfo();
    }
}
