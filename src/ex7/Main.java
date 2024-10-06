public class Main {
    public static void main(String[] args) {

        FormaPagamento cartaoCredito = new CartaoCredito("1234567812345678", "João Silva", "12/25", "123");
        FormaPagamento boleto = new Boleto("00190500954014481606906809350314337370000000100");
        FormaPagamento pix = new Pix("joao.silva@banco.com");


        cartaoCredito.processarPagamento(150.75);
        boleto.processarPagamento(250.50);
        pix.processarPagamento(89.99);
    }
}
