public class Pix extends FormaPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso via Pix.");
        } else {
            System.out.println("Falha na validação da chave Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {

        return chavePix.length() >= 11 && (chavePix.contains("@") || chavePix.matches("\\d+"));
    }
}
